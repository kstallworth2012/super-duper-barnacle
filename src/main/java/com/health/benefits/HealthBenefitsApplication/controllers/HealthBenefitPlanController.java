package com.health.benefits.HealthBenefitsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.HealthBenefitPlanRepository;


@RestController
@RequestMapping("/api/health-plans")
public class HealthBenefitPlanController{


	  private Service Service;
	  private Mapper<Entity, DTO> Mapper;

    // Read All
    @GetMapping
    public Iterable<HealthBenefitPlanEntity> getAllHealthBenefitPlans() {
        return healthBenefitPlanRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<HealthBenefitPlanEntity> getHealthBenefitPlanById(@PathVariable String id) {
        return healthBenefitPlanRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}