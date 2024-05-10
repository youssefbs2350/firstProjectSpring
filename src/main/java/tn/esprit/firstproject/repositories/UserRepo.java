package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.User;

@Repository

public interface UserRepo extends JpaRepository<User, Long> {
}
