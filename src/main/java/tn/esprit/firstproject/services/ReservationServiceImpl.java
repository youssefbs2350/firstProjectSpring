package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Reservation;
import tn.esprit.firstproject.repositories.ReservationRepo;

import java.util.List;

public class ReservationServiceImpl implements IReservationService{
    ReservationRepo reservationRepo ;
    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    @Override
    public Reservation modifierReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    @Override
    public void supprimerReservation(String id) {
        reservationRepo.deleteById(id);

    }

    @Override
    public Reservation chercherReservation(String id) {
        return reservationRepo.findById(id).orElse(null);
    }

    @Override
    public List<Reservation> listerReservation() {
        return reservationRepo.findAll();
    }
}
