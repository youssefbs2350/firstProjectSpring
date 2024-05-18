package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Role;
import tn.esprit.firstproject.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite ajouterUniversite(Universite universite);
    Universite modifierUniversite(Universite universite);
    void supprimerUniversite(Long id);
    Universite chercherUniversite(Long id);
    List<Universite> listerUniversite();
}
