package com.health.benefits.HealthBenefitsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import com.health.benefits.HealthBenefitsApplication.domain.entities.EnrollmentEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.EnrollmentRepository;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController{


        private final EnrollmentRepository enrollmentRepository;

    public EnrollmentController(EnrollmentRepository _enrollmentRepository) {
        this.enrollmentRepository = _enrollmentRepository;
    }


    // Read All
    @GetMapping
    public Iterable<EnrollmentEntity> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<EnrollmentEntity> get_____ById(@PathVariable String id) {
        return enrollmentRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}