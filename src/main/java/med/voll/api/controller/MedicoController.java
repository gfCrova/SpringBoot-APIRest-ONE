package med.voll.api.controller;

import med.voll.api.medico.DatosDeRegistroMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void registrarMedico(@RequestBody DatosDeRegistroMedico registro) {
        System.out.println("El request llega correctamente!");
        System.out.println(registro);
    }

    @GetMapping
    public String medico(DatosDeRegistroMedico datos) {
        return datos.toString();
    }
}
