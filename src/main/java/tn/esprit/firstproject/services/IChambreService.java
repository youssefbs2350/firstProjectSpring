package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Chambre;
import tn.esprit.firstproject.entities.Etudiant;

import java.util.List;

public interface IChambreService {
    Chambre ajouterChambre(Chambre chambre);
    Chambre modifierChambre(Chambre chambre);
    void supprimerChambre(Long id);
    Chambre chercherChambre(Long id);
    List<Chambre> listerChambre();
}
