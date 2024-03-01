package com.example.revision.Services;

import com.example.revision.Entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);
    Foyer getFoyer( Long idFoyer );
    List<Foyer> getAllFoyers();
    void deleteFoyer(Long idFoyer);
    Foyer updateFoyer(Foyer foyer);
}
