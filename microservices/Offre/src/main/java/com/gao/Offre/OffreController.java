package com.gao.Offre;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/offres")
@RequiredArgsConstructor
public class OffreController {
private final OffreService service;
@PostMapping
@ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Offre offre)
{
    service.saveOffre(offre);
}
@GetMapping
    public ResponseEntity<List<Offre>> findAllOffres()
{
    return ResponseEntity.ok(service.findAllOffres());
}
}
