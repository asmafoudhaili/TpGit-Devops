package com.example.revision.controller;

import com.example.revision.Entities.Bloc;
import com.example.revision.Entities.Bloc;
import com.example.revision.Services.BlocService;
import com.example.revision.Services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlocController {
    @Autowired
    BlocService blocService;
    @PostMapping("/bloc")
    Bloc addBloc(@RequestBody Bloc bloc)
    {
        return blocService.addBloc(bloc);
    }
    @GetMapping("/bloc/{id}")
    Bloc retrieveBloc(@PathVariable Long id) {
        return blocService.getBloc(id);
    }
    @GetMapping("/bloc")
    List<Bloc> retrieveBlocs(){
        Bloc bloc;
        return blocService.getAllBlocs();
    }
    @DeleteMapping("/bloc/{id}")
    void deleteBloc(@PathVariable Long id){
        blocService.deleteBloc(id);
    }
    @PutMapping("/bloc")
    Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }

}