package los.habilidosisimos.habil2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import los.habilidosisimos.habil2.model.CurrentSession;

public interface CurrentSessionRepository extends JpaRepository<CurrentSession, Long>{
    CurrentSession findByCurrentUser(String currentUser);
}