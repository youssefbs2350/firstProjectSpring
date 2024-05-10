package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Foyer;

@Repository
public interface FoyerRepo extends JpaRepository<Foyer, Long> {
}
