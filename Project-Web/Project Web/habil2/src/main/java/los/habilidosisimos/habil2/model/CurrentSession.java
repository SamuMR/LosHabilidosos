package los.habilidosisimos.habil2.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "SesionActual")
@Getter
@Setter
@NoArgsConstructor
public class CurrentSession implements Serializable{
    public CurrentSession (boolean session, String currentUser){
        this.session = session;
        this.currentUser = currentUser;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String currentUser;
    private boolean session;
}
