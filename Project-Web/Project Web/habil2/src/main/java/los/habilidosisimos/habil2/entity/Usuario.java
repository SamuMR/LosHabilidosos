package los.habilidosisimos.habil2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String correoId;
    private String password;

    public Usuario(){
        super();
    }

    public Usuario(String nombre, String apellido, String correoId, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoId = correoId;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoId() {
        return correoId;
    }

    public void setCorreoId(String correoId) {
        this.correoId = correoId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
