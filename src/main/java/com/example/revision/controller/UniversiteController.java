package com.example.revision.controller;

import com.example.revision.Entities.Universite;
import com.example.revision.Services.UniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UniversiteController {
    @Autowired
    UniversiteService universiteService;
    @PostMapping("/universite")
    Universite addUniversite(@RequestBody Universite universite)
    {
        return universiteService.addUniversite(universite);
    }
    @GetMapping("/universite/{id}")
    Universite retrieveUniversite(@PathVariable Long id) {
        return universiteService.getUniversite(id);
    }
    @GetMapping("/universite")
    List<Universite> retrieveUniversites(){
        Universite universite;
        return universiteService.getAllUniversites();
    }
    @DeleteMapping("/universite/{id}")
    void deleteUniversite(@PathVariable Long id){
        universiteService.deleteUniversite(id);
    }
    @PutMapping("/universite")
    Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

}