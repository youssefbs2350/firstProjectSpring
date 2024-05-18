package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Etudiant;
import tn.esprit.firstproject.entities.Foyer;

import java.util.List;

public interface IEtudiantService {
    Etudiant ajouterEtudiant(Etudiant etudiant);
    Etudiant modifierEtudiant(Etudiant etudiant);
    void supprimerEtudiant(Long id);
    Etudiant chercherEtudiant(Long id);
    List<Etudiant> listerEtudiant();
}
