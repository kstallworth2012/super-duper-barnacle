package com.health.benefits.HealthBenefitsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EOIEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.EOIRepository;

@RestController
@RequestMapping("/api/eoi")
public class EOIController{


		private final EOIRepository eoiRepository;

    public EOIController(EOIRepository _eoiRepository) {
        this.eoiRepository = _eoiRepository;
    }


    // Read All
    @GetMapping
    public Iterable<EOIEntity> getAllEOI() {
        return eoiRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<EOIEntity> getEOIById(@PathVariable String id) {
        return eoiRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}