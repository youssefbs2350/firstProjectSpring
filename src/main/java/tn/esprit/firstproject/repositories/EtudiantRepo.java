package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Etudiant;

@Repository
public interface EtudiantRepo extends JpaRepository<Etudiant, Long> {
}
