package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Reservation;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, String> {
}
