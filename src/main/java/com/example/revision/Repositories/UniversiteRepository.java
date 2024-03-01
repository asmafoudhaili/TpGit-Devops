package com.example.revision.Repositories;

import com.example.revision.Entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
    Universite retrieveByNom(String nomUniversite);
}
