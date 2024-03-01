package com.example.revision.Services;

import com.example.revision.Entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    Chambre getChambre(Long idChambre);
    List<Chambre> getAllChambres();
    void deleteChambre(Long idChambre);
    Chambre updateChambre(Chambre chambre);
}
