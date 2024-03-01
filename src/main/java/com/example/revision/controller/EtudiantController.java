package com.example.revision.controller;

import com.example.revision.Entities.Etudiant;
import com.example.revision.Services.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class EtudiantController {
    @Autowired
    EtudiantService etudiantService;
    @PostMapping("/etudiant")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant)
    {
        return etudiantService.addEtudiant(etudiant);
    }
    @GetMapping("/etudiant/{id}")
    Etudiant retrieveEtudiant(@PathVariable Long id) {
        return etudiantService.getEtudiant(id);
    }
    @GetMapping("/etudiant")
    List<Etudiant> retrieveEtudiants(){
        Etudiant etudiant;
        return etudiantService.getAllEtudiants();
    }
    @DeleteMapping("/etudiant/{id}")
    void deleteEtudiant(@PathVariable Long id){
        etudiantService.deleteEtudiant(id);
    }
    @PutMapping("/etudiant")
    Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(etudiant);
    }

}
