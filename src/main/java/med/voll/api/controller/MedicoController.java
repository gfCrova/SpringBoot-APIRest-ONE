package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.domain.direccion.DatosDeDireccion;
import med.voll.api.domain.medico.DatosActualizarMedico;
import med.voll.api.domain.medico.DatosDeRegistroMedico;
import med.voll.api.domain.medico.DatosListadoMedico;
import med.voll.api.domain.medico.Medico;
import med.voll.api.domain.medico.DatosRespuestaMedico;
import med.voll.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    /* Con la anotación @Autowired le estamos diciendo a Spring que el componente es un punto donde se debe inyectar una dependencia,
    en otras palabras, el componente se inyecta en la clase que lo posee, estableciendo una colaboración entre componentes.*/
    @Autowired
    private MedicoRepository medicoRepository;

    // ***** POST - Guardar *****
    @PostMapping
    public ResponseEntity<DatosRespuestaMedico> registrarMedico(@RequestBody @Valid DatosDeRegistroMedico registro, UriComponentsBuilder uri) {
        System.out.println("El request llega correctamente!");
        System.out.println(registro);
        Medico medico = medicoRepository.save(new Medico(registro));
        DatosRespuestaMedico datosRespuestaMedico = new DatosRespuestaMedico(
                medico.getId(),
                medico.getNombre(),
                medico.getEmail(),
                medico.getDni(),
                medico.getTelefono(),
                new DatosDeDireccion(
                        medico.getDireccion().getCalle(),
                        medico.getDireccion().getNumero(),
                        medico.getDireccion().getDistrito(),
                        medico.getDireccion().getCiudad()
                ));
        URI url = uri.path("/medicos/{id}").buildAndExpand(medico.getId()).toUri();
        return ResponseEntity.created(url).body(datosRespuestaMedico);
    }

    // ***** GET - LISTAR *****
    /*@GetMapping
    public List<DatosListadoMedico> listadoMedicos() {
        return medicoRepository.findAll().stream().map(DatosListadoMedico::new).toList();
    }*/

    // **** GET - PAGINACIÓN *****
    @GetMapping
    public ResponseEntity<Page<DatosListadoMedico>> listadoMedicos(@PageableDefault(size = 5) Pageable paginacion) {
        //return medicoRepository.findAll(paginacion).map(DatosListadoMedico::new);
        return ResponseEntity.ok(medicoRepository.findByActivoTrue(paginacion).map(DatosListadoMedico::new));
    }

    // ***** UPDATE *****
    @PutMapping
    @Transactional
    public ResponseEntity<DatosRespuestaMedico> actualizarMedico(@RequestBody @Valid DatosActualizarMedico datosActualizar) {
        Medico medico = medicoRepository.getReferenceById(datosActualizar.id());
        medico.actualizarDatos(datosActualizar);
        return ResponseEntity.ok( new DatosRespuestaMedico(
                medico.getId(),
                medico.getNombre(),
                medico.getEmail(),
                medico.getDni(),
                medico.getTelefono(),
                new DatosDeDireccion(
                    medico.getDireccion().getCalle(),
                    medico.getDireccion().getNumero(),
                    medico.getDireccion().getDistrito(),
                    medico.getDireccion().getCiudad()
                )));
    }

    // **** DELETE ****
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity eliminarMedico(@PathVariable Long id) {
        Medico medico = medicoRepository.getReferenceById(id);
        medico.desactivarMedico();  // Delete Lógico (No en DB)
        //medicoRepository.delete(medico);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosRespuestaMedico> retornaAllDatosMedico(@PathVariable Long id) {
        Medico medico = medicoRepository.getReferenceById(id);
        var datosMedico = new DatosRespuestaMedico(medico.getId(),
                medico.getNombre(),
                medico.getEmail(),
                medico.getDni(),
                medico.getTelefono(),
                new DatosDeDireccion(
                        medico.getDireccion().getCalle(),
                        medico.getDireccion().getNumero(),
                        medico.getDireccion().getDistrito(),
                        medico.getDireccion().getCiudad()));
        return ResponseEntity.ok(datosMedico);
    }
}
