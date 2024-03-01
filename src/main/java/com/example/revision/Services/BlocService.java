package com.example.revision.Services;

import com.example.revision.Entities.Bloc;
import com.example.revision.Entities.Chambre;
import com.example.revision.Repositories.BlocRepository;
import com.example.revision.Repositories.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlocService implements IBlocService{
    @Autowired
    BlocRepository blocRepository;
    ChambreRepository chambreRepository ;
    public BlocService(BlocRepository blocRepository) {
        this.blocRepository = blocRepository;
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc getBloc(Long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public List<Bloc> getAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public void deleteBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
    @Override
    public Bloc affecterChambreToBloc(List<Long> numChambre, String nomBloc) {
        Bloc bloc = blocRepository.findByNomBloc(nomBloc);
        for (Long num: numChambre){
            Chambre chambre =chambreRepository.findByNumeroChambre(num);
            chambre.setBloc(bloc);
            chambreRepository.save(chambre);
        }
        return bloc ;
    }
}
