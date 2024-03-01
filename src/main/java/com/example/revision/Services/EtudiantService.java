package com.example.revision.Services;

import com.example.revision.Entities.Etudiant;
import com.example.revision.Entities.Reservation;
import com.example.revision.Repositories.EtudiantRepository;
import com.example.revision.Repositories.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService implements IEtudiantService{
    EtudiantRepository etudiantRepository;
    ReservationRepository reservationRepository;
    public EtudiantService(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant) ;
    }

    @Override
    public Etudiant getEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {

        return etudiantRepository.findAll();
    }

    @Override
    public void deleteEtudiant(Long idEtudiant) {
         etudiantRepository.deleteById( idEtudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant) ;
    }
    @Override
    public Etudiant affecterReservationToEtudiant(long idEtudiant, long idReservation) {
        Etudiant etudiant=etudiantRepository.findById(idEtudiant).orElse(null) ;
        Reservation reservation = reservationRepository.findById(idReservation).orElse(null);
        etudiant.getReservation().add(reservation);
        return etudiantRepository.save(etudiant);
    }
}
