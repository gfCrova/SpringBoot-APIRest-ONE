package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.direccion.DatosDeDireccion;

public record DatosActualizarMedico(
        @NotNull Long id,
        String nombre,
        String dni,
        DatosDeDireccion direccion) {

}
