package tn.esprit.firstproject.services;

import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Foyer;

import java.util.List;
import java.util.Optional;

@Service
public interface IFoyerService {

      Foyer ajouterFoyer(Foyer foyer);
      Foyer modifierFoyer(Foyer foyer);
        void supprimerFoyer(Long id);
        Foyer chercherFoyer(Long id);
        List<Foyer> listerFoyers();
}
