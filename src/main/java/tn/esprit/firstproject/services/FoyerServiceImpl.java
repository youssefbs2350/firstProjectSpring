package tn.esprit.firstproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Foyer;
import tn.esprit.firstproject.repositories.FoyerRepo;

import java.util.List;


@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService {

    private final FoyerRepo foyerRepo;

    @Override
    public Foyer ajouterFoyer(Foyer foyer) {
        return foyerRepo.save(foyer);
    }

    @Override
    public Foyer modifierFoyer(Foyer foyer) {
        return foyerRepo.save(foyer);
    }

    @Override
    public void supprimerFoyer(Long id) {
        foyerRepo.deleteById(id);
    }

    @Override
    public Foyer chercherFoyer(Long id) {
        return foyerRepo.findById(id).orElse(null);
    }

    @Override
    public List<Foyer> listerFoyers() {
        return foyerRepo.findAll();
    }
}
