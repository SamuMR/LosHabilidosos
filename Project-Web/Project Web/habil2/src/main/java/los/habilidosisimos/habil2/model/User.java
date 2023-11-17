package los.habilidosisimos.habil2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import jakarta.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "Usuarios")
@Getter
@Setter
@NoArgsConstructor
public class User implements Serializable {

    public User( String nombre, String apellido, String correo, String password){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String apellido;
    private String correo;
    private String password;


}
