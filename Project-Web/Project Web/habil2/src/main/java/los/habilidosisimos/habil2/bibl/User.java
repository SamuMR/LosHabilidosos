package los.habilidosisimos.habil2.bibl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="users")
@Data
public class User{
    @Id
    private Integer id;
    private String nombre;
    private String apellido;
}