package com.example.revision.Services;

import com.example.revision.Entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);
    Bloc getBloc(Long idBloc);
    List<Bloc> getAllBlocs();
    void deleteBloc(Long idBloc);
    Bloc updateBloc(Bloc bloc);

    Bloc affecterChambreToBloc(List<Long> numChambre, String nomBloc);
}
