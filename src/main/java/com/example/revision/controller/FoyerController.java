package com.example.revision.controller;

import com.example.revision.Entities.Foyer;
import com.example.revision.Services.FoyerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class FoyerController {
    @Autowired
    FoyerService foyerService;
    @PostMapping("/foyer")
    Foyer addFoyer(@RequestBody Foyer foyer)
    {
        return foyerService.addFoyer(foyer);
    }
    @GetMapping("/foyer/{id}")
    Foyer retrieveFoyer(@PathVariable Long id) {
        return foyerService.getFoyer(id);
    }
    @GetMapping("/foyer")
    List<Foyer> retrieveFoyers(){
        Foyer foyer;
        return foyerService.getAllFoyers();
    }
    @DeleteMapping("/foyer/{id}")
    void deleteFoyer(@PathVariable Long id){
        foyerService.deleteFoyer(id);
    }
    @PutMapping("/foyer")
    Foyer updateFoyer(@RequestBody Foyer foyer) {
        return foyerService.updateFoyer(foyer);
    }

}