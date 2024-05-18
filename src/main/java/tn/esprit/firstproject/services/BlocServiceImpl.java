package tn.esprit.firstproject.services;


import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entities.Bloc;
import tn.esprit.firstproject.repositories.BlocRepo;

import java.util.List;

@Service
public class BlocServiceImpl implements IBlocService{
    BlocRepo blocRepo;

    @Override
    public Bloc ajouterBloc(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public Bloc modifierBloc(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public void supprimerBloc(Long id) {
          blocRepo.deleteById(id);
    }

    @Override
    public Bloc chercherBloc(Long id) {
        return blocRepo.findById(id).orElse(null);
    }

    @Override
    public List<Bloc> listerbloc() {
        return blocRepo.findAll();
    }
}
