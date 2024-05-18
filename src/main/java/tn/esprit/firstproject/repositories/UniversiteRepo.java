package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Universite;

@Repository

public interface UniversiteRepo extends

        JpaRepository<Universite, Long> {
}
