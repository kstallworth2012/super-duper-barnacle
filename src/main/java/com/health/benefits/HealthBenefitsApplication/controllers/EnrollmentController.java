package com.health.benefits.HealthBenefitsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.health.benefits.HealthBenefitsApplication.domain.dto.EnrollmentDTO;
import com.health.benefits.HealthBenefitsApplication.domain.entities.EnrollmentEntity;
import com.health.benefits.HealthBenefitsApplication.mappers.Mapper;
import com.health.benefits.HealthBenefitsApplication.repositories.EnrollmentRepository;
import com.health.benefits.HealthBenefitsApplication.services.EnrollmentService;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController{


	private EnrollmentService enrollmentService;
    private Mapper<EnrollmentEntity, EnrollmentDTO> enrollmentMapper;

      
    public EnrollmentController(EnrollmentService enrollmentService,
			Mapper<EnrollmentEntity, EnrollmentDTO> enrollmentMapper) {
		this.enrollmentService = enrollmentService;
		this.enrollmentMapper = enrollmentMapper;
	}

	// Read All
    @GetMapping
    public Iterable<EnrollmentEntity> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<EnrollmentEntity> getEnrollmentById(@PathVariable String id) {
        return enrollmentRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}