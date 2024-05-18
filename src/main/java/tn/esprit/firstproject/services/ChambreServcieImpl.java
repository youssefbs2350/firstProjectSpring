package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Chambre;
import tn.esprit.firstproject.repositories.ChambreRepo;

import java.util.List;

public class ChambreServcieImpl implements IChambreService{
    ChambreRepo chambreRepo;

    @Override
    public Chambre ajouterChambre(Chambre chambre) {
        return chambreRepo.save(chambre);
    }

    @Override
    public Chambre modifierChambre(Chambre chambre) {
        return chambreRepo.save(chambre);
    }

    @Override
    public void supprimerChambre(Long id) {
        chambreRepo.deleteById(id);

    }

    @Override
    public Chambre chercherChambre(Long id) {
        return chambreRepo.findById(id).orElse(null);
    }

    @Override
    public List<Chambre> listerChambre() {
        return chambreRepo.findAll();
    }
}
