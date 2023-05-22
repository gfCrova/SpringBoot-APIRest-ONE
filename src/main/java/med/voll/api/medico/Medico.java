package med.voll.api.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    @Embedded
    private Direccion direccion;


    public Medico(DatosDeRegistroMedico registro) {
        this.nombre = registro.nombre();
        this.email = registro.email();
        this.dni = registro.dni();
        this.telefono = registro.telefono();
        this.especialidad = registro.especialidad();
        this.direccion = new Direccion(registro.direccion());
    }
}
