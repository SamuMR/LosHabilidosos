package los.habilidosisimos.habil2.repository;

import los.habilidosisimos.habil2.model.CurrentSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrentSessionRepository extends JpaRepository<CurrentSession, Long> {
}