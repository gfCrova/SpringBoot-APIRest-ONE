package med.voll.api.DTO;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.DTO.direccion.DatosDeDireccion;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {

    private String calle;
    private String numero;
    private String distrito;
    private String ciudad;

    public Direccion(DatosDeDireccion direccion) {
        this.calle = direccion.calle();
        this.numero = direccion.numero();
        this.distrito = direccion.distrito();
        this.ciudad = direccion.ciudad();
    }

    public Direccion actualizarDatos(DatosDeDireccion direccion) {
        this.calle = direccion.calle();
        this.numero = direccion.numero();
        this.distrito = direccion.distrito();
        this.ciudad = direccion.ciudad();
        return this;
    }
}
