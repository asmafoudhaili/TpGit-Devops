package com.example.revision.Services;

import com.example.revision.Entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant getEtudiant(Long idEtudiant);
    List<Etudiant> getAllEtudiants();
    void deleteEtudiant(Long idEtudiant);
    Etudiant updateEtudiant(Etudiant etudiant);

    Etudiant affecterReservationToEtudiant(long idEtudiant, long idReservation);
}
