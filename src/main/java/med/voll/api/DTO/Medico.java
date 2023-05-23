package med.voll.api.DTO;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.DTO.medico.DatosActualizarMedico;
import med.voll.api.DTO.medico.DatosDeRegistroMedico;
import med.voll.api.DTO.medico.Especialidad;

@Entity(name = "Medico")
@Table(name = "medicos")
@Getter
@NoArgsConstructor // Constructor Vacío
@AllArgsConstructor // Constructor con Todos los Parámetros
@EqualsAndHashCode(of = "id")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String dni;
    private String telefono;
    private Boolean activo;
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    @Embedded
    private Direccion direccion;


    public Medico(DatosDeRegistroMedico registro) {
        this.nombre = registro.nombre();
        this.email = registro.email();
        this.dni = registro.dni();
        this.activo = true;
        this.telefono = registro.telefono();
        this.especialidad = registro.especialidad();
        this.direccion = new Direccion(registro.direccion());
    }

    public void actualizarDatos(DatosActualizarMedico datosActualizar) {
        if(datosActualizar.nombre() != null) {
            this.nombre = datosActualizar.nombre();
        }
        if (datosActualizar.dni() != null) {
            this.dni = datosActualizar.dni();
        }
        if (datosActualizar.direccion() != null) {
            this.direccion = direccion.actualizarDatos(datosActualizar.direccion());
        }
    }

    public void desactivarMedico() {
        this.activo = false;
    }
}
