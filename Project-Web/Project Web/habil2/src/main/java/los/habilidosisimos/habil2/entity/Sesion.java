package los.habilidosisimos.habil2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sesion {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;

    private String UsuarioActual;
    private boolean InSesion;

    public Sesion(){}

    public Sesion(Long id, String usuarioActual, boolean inSesion) {
        super();
        Id = id;
        UsuarioActual = usuarioActual;
        InSesion = inSesion;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsuarioActual() {
        return UsuarioActual;
    }

    public void setUsuarioActual(String usuarioActual) {
        UsuarioActual = usuarioActual;
    }

    public boolean isInSesion() {
        return InSesion;
    }

    public void setInSesion(boolean inSesion) {
        InSesion = inSesion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Id == null) ? 0 : Id.hashCode());
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
        Sesion other = (Sesion) obj;
        if (Id == null) {
            if (other.Id != null)
                return false;
        } else if (!Id.equals(other.Id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Sesion [Id=" + Id + ", UsuarioActual=" + UsuarioActual + ", InSesion=" + InSesion + "]";
    }

    

}
