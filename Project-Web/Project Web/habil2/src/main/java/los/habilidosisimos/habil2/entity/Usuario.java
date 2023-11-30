package los.habilidosisimos.habil2.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

import java.util.Set;

@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String correoId;
    private String password;

    @ManyToMany
    @JoinTable(name = "usuario_cursos"
    ,joinColumns = @JoinColumn(name="usuario_id")
    ,inverseJoinColumns = @JoinColumn(name="curso_id"))
    private Set<Cursos> cursos;

    @JoinColumn(name="sesion_id", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Sesion sesion;

    public Usuario(){
    }

    

    public Usuario(String nombre, String apellido, String correoId, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoId = correoId;
        this.password = password;
    }



    public Usuario(String nombre, String apellido, String correoId, String password, Set<Cursos> cursos,
            Sesion sesion) {
                super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoId = correoId;
        this.password = password;
        this.cursos = cursos;
        this.sesion = sesion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Set<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Cursos> cursos) {
        this.cursos = cursos;
    }

    public Sesion getSesion() {
        return sesion;
    }

    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correoId=" + correoId
                + ", password=" + password + ", cursos=" + cursos + ", sesion=" + sesion + "]";
    }

    

    
}
