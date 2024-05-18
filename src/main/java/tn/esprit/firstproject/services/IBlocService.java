package tn.esprit.firstproject.services;

import tn.esprit.firstproject.entities.Bloc;
import tn.esprit.firstproject.entities.Chambre;

import java.util.List;

public interface IBlocService {
    Bloc ajouterBloc(Bloc bloc);
    Bloc modifierBloc(Bloc bloc);
    void supprimerBloc(Long id);
    Bloc chercherBloc(Long id);
    List<Bloc> listerbloc();
}
