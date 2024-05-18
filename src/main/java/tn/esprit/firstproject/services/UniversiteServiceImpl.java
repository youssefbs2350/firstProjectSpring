package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Universite;
import tn.esprit.firstproject.repositories.UniversiteRepo;

import java.util.List;

public class UniversiteServiceImpl implements IUniversiteService{
    UniversiteRepo universiteRepo;
    @Override
    public Universite ajouterUniversite(Universite universite) {
        return universiteRepo.save(universite);
    }

    @Override
    public Universite modifierUniversite(Universite universite) {
        return universiteRepo.save(universite);
    }

    @Override
    public void supprimerUniversite(Long id) {
        universiteRepo.deleteById(id);

    }

    @Override
    public Universite chercherUniversite(Long id) {
        return universiteRepo.findById(id).orElse(null);
    }

    @Override
    public List<Universite> listerUniversite() {
        return universiteRepo.findAll();
    }
}
