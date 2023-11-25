package los.habilidosisimos.habil2.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cursos extends User {

    public Cursos(boolean ejercicios, boolean billar, boolean videoj, boolean tejer){
        this.ejercicios = ejercicios;
        this.billar = billar;
        this.videoj = videoj;
        this.tejer = tejer;
    }

    private boolean ejercicios;
    private boolean billar;
    private boolean videoj;
    private boolean tejer;
}
