package tn.esprit.firstproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Etudiant;
import tn.esprit.firstproject.entities.Foyer;
import tn.esprit.firstproject.repositories.EtudiantRepo;
import tn.esprit.firstproject.repositories.FoyerRepo;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService{
    private final EtudiantRepo etudiantRepo;

    @Override
    public Etudiant ajouterEtudiant(Etudiant etudiant) {
        return etudiantRepo.save(etudiant);
    }

    @Override
    public Etudiant modifierEtudiant(Etudiant etudiant) {
        return etudiantRepo.save(etudiant);
    }

    @Override
    public void supprimerEtudiant(Long id) {
        etudiantRepo.deleteById(id);

    }

    @Override
    public Etudiant chercherEtudiant(Long id) {
        return etudiantRepo.findById(id).orElse(null);
    }

    @Override
    public List<Etudiant> listerEtudiant() {
        return etudiantRepo.findAll();
    }
}
