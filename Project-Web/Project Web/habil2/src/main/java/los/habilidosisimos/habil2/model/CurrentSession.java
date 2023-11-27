package los.habilidosisimos.habil2.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CurrentSession extends User {

    public CurrentSession(boolean zession){
        this.zession = zession;

    }

    private boolean zession;
//https://www.youtube.com/watch?v=_OCWLPAJh0Q
}
