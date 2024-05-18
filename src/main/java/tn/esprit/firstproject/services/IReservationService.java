package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Foyer;
import tn.esprit.firstproject.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation reservation);
    Reservation modifierReservation(Reservation reservation);
    void supprimerReservation(String id);
    Reservation chercherReservation(String id);
    List<Reservation> listerReservation();
}
