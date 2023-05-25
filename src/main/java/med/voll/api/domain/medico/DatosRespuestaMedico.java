package med.voll.api.domain.medico;

import med.voll.api.domain.direccion.DatosDeDireccion;

public record DatosRespuestaMedico(Long id, String nombre, String email, String dni, String telefono, DatosDeDireccion direccion) {
}
