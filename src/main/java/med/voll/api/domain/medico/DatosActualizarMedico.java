package med.voll.api.DTO.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.DTO.direccion.DatosDeDireccion;

public record DatosActualizarMedico(@NotNull Long id, String nombre, String dni, DatosDeDireccion direccion) {

}
