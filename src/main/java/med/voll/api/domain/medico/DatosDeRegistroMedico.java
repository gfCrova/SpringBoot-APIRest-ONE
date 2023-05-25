package med.voll.api.DTO.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.DTO.direccion.DatosDeDireccion;

public record DatosDeRegistroMedico(

        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{4,8}")
        String dni,
        @NotBlank
        String telefono,
        @NotNull
        Especialidad especialidad,
        @NotNull
        @Valid
        DatosDeDireccion direccion
) {
}
