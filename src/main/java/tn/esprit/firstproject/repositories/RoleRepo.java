package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
}
