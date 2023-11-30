package los.habilidosisimos.habil2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import los.habilidosisimos.habil2.entity.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long>{
    Usuario findByCorreoId(String correoId);
    
}
