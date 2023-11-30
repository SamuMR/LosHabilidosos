package los.habilidosisimos.habil2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cursos {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id; 

    private String Curso_id;

    public Cursos(){}

    public Cursos(String curso_id){
        this.Curso_id = curso_id;
    }

    public Cursos(Long id, String curso_id) {
        Id = id;
        Curso_id = curso_id;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCurso_id() {
        return Curso_id;
    }

    public void setCurso_id(String curso_id) {
        Curso_id = curso_id;
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
        Cursos other = (Cursos) obj;
        if (Id == null) {
            if (other.Id != null)
                return false;
        } else if (!Id.equals(other.Id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cursos [Id=" + Id + ", Curso_id=" + Curso_id + "]";
    }

    
    
}
