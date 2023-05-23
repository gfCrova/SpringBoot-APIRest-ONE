package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.DTO.medico.DatosActualizarMedico;
import med.voll.api.DTO.medico.DatosDeRegistroMedico;
import med.voll.api.DTO.medico.DatosListadoMedico;
import med.voll.api.DTO.Medico;
import med.voll.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    /* Con la anotación @Autowired le estamos diciendo a Spring que el componente es un punto donde se debe inyectar una dependencia,
    en otras palabras, el componente se inyecta en la clase que lo posee, estableciendo una colaboración entre componentes.*/
    @Autowired
    private MedicoRepository medicoRepository;

    // Guardar
    @PostMapping
    public void registrarMedico(@RequestBody @Valid DatosDeRegistroMedico registro) {
        System.out.println("El request llega correctamente!");
        System.out.println(registro);
        medicoRepository.save(new Medico(registro));
    }

    // Listar
    /*@GetMapping
    public List<DatosListadoMedico> listadoMedicos() {
        return medicoRepository.findAll().stream().map(DatosListadoMedico::new).toList();
    }*/

    // Estrategia de PAGINACIÓN
    @GetMapping
    public Page<DatosListadoMedico> listadoMedicos(@PageableDefault(size = 5) Pageable paginacion) {
        //return medicoRepository.findAll(paginacion).map(DatosListadoMedico::new);
        return medicoRepository.findByActivoTrue(paginacion).map(DatosListadoMedico::new);
    }

    // Actualizar
    @PutMapping
    @Transactional
    public void actualizarMedico(@RequestBody @Valid DatosActualizarMedico datosActualizar) {
        Medico medico = medicoRepository.getReferenceById(datosActualizar.id());
        medico.actualizarDatos(datosActualizar);
    }

    // Borrar
    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarMedico(@PathVariable Long id) {
        Medico medico = medicoRepository.getReferenceById(id);
        medico.desactivarMedico();  // Delete Lógico (No en DB)
        //medicoRepository.delete(medico);
    }
}
