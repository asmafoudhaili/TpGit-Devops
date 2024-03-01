package com.example.revision.Services;

import com.example.revision.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    Universite getUniversite(Long idUniversite);
    List<Universite> getAllUniversites();
    void deleteUniversite(Long idUniversite);
    Universite updateUniversite(Universite universite);

    Universite affecterFoyerToUniversite(long idFoyer, String nomUniversite);
}
