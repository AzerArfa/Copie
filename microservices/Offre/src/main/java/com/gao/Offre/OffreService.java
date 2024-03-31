package com.gao.Offre;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OffreService {
    private final OffreRepository repository;
    public void saveOffre(Offre offre)
    {
        repository.save(offre);
    }
    public List<Offre> findAllOffres(){
        return repository.findAll();
    }
}
