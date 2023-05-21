package med.voll.api.medico;

import med.voll.api.direccion.DatosDeDireccion;

public record DatosDeRegistroMedico(
        String nombre,
        String email,
        String dni,
        Especialidad especialidad,
        DatosDeDireccion direccion
) {
}
