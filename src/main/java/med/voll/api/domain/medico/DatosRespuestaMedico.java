package med.voll.api.DTO.medico;

import med.voll.api.DTO.direccion.DatosDeDireccion;

public record DatosRespuestaMedico(Long id, String nombre, String email, String dni, String telefono, DatosDeDireccion direccion) {
}
