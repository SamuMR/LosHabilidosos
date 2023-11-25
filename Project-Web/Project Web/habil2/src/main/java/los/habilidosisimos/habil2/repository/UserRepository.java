package los.habilidosisimos.habil2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import los.habilidosisimos.habil2.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByNombre(String nombre);
}

