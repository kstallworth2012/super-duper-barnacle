package com.health.benefits.HealthBenefitsApplication.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.health.benefits.HealthBenefitsApplication.domain.entities.DependentsEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.DependentRepository;

@RestController
@RequestMapping("/api/dependents")
public class DependentController{


        private final DependentRepository dependentRepository;

    public DependentController(DependentRepository _dependentRepository) {
        this.dependentRepository = _dependentRepository;
    }


    // Read All
    @GetMapping
    public Iterable<DependentsEntity> getAllDependents() {
        return dependentRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<DependentsEntity> getDependentById(@PathVariable Long id) {
        return dependentRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}