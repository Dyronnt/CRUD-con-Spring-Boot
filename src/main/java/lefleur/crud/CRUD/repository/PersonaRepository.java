package lefleur.crud.CRUD.repository;

import lefleur.crud.CRUD.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository <Persona, Long> {
}
