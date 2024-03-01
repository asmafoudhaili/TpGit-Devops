package com.example.revision.Services;

import com.example.revision.Entities.Foyer;
import com.example.revision.Entities.Universite;
import com.example.revision.Repositories.FoyerRepository;
import com.example.revision.Repositories.UniversiteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversiteService implements IUniversiteService{

    UniversiteRepository universiteRepository;
    FoyerRepository foyerRepository ;
    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite getUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public void deleteUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }
    @Override
    public Universite affecterFoyerToUniversite(long idFoyer, String nomUniversite) {
        Foyer foyer= foyerRepository.findById(idFoyer).orElse(null);
        Universite universite = universiteRepository.retrieveByNom(nomUniversite);
        universite.setFoyer(foyer);
        return universiteRepository.save(universite);
    }
}
