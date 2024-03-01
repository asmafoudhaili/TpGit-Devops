package com.example.revision.Services;

import com.example.revision.Entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    Reservation getReservation( Long idReservation);
    List<Reservation> getAllReservations();
    void deleteReservation(Long idReservation);
    Reservation updateReservation(Reservation reservation);
}
