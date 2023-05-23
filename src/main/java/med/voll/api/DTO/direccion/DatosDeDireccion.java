package med.voll.api.DTO.direccion;

import jakarta.validation.constraints.NotBlank;

public record DatosDeDireccion(
        @NotBlank
        String calle,
        @NotBlank
        String numero,
        @NotBlank
        String distrito,
        @NotBlank
        String ciudad
) {
}
