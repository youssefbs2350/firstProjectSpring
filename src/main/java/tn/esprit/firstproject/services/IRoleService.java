package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Reservation;
import tn.esprit.firstproject.entities.Role;

import java.util.List;

public interface IRoleService {
    Role ajouterRole(Role role);
    Role modifierRole(Role role);
    void supprimerRole(Long id);
    Role chercherRole(Long id);
    List<Role> listerRole();
}
