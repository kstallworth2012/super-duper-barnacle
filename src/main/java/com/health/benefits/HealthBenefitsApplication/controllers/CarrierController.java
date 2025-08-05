package com.health.benefits.HealthBenefitsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mega.parts.MegaPartsApplication.domain.entities._____Entity;
import com.mega.parts.MegaPartsApplication.repositories._____Repository;

@RestController
@RequestMapping("/api/warehouse")
public class CarrierController{


		private final _______Repository ____Repository;

    public _______Controller(____Repository _Repository) {
        this._____Repository = ____Repository;
    }


    // Read All
    @GetMapping
    public Iterable<_____Entity> getAll_____() {
        return _____Repository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<_____Entity> get_____ById(@PathVariable Long id) {
        return inventoryRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}