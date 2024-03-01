package com.example.revision.controller;

import com.example.revision.Entities.Chambre;
import com.example.revision.Services.ChambreService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ChambreController {
    @Autowired
    ChambreService chambreService;
    @PostMapping("/chambre")
    Chambre addChambre(@RequestBody Chambre chambre)
    {
        return chambreService.addChambre(chambre);
    }
    @GetMapping("/chambre/{id}")
    Chambre retrieveChambre(@PathVariable Long id) {
        return chambreService.getChambre(id);
    }
    @GetMapping("/chambre")
    List<Chambre> retrieveChambres(){
        Chambre chambre;
        return chambreService.getAllChambres();
    }
    @DeleteMapping("/chambre/{id}")
    void deleteChambre(@PathVariable Long id){
        chambreService.deleteChambre(id);
    }
    @PutMapping("/chambre")
    Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }

}