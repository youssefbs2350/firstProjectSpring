package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Chambre;

@Repository
public interface ChambreRepo extends JpaRepository<Chambre, Long> {
}
