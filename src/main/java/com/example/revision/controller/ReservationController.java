package com.example.revision.controller;

import com.example.revision.Entities.Reservation;
import com.example.revision.Services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationController {
    @Autowired
    ReservationService reservationService;
    @PostMapping("/reservation")
    Reservation addReservation(@RequestBody Reservation reservation)
    {
        return reservationService.addReservation(reservation);
    }
    @GetMapping("/reservation/{id}")
    Reservation retrieveReservation(@PathVariable Long id) {
        return reservationService.getReservation(id);
    }
    @GetMapping("/reservation")
    List<Reservation> retrieveReservations(){
        Reservation reservation;
        return reservationService.getAllReservations();
    }
    @DeleteMapping("/reservation/{id}")
    void deleteReservation(@PathVariable Long id){
        reservationService.deleteReservation(id);
    }
    @PutMapping("/reservation")
    Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

}
