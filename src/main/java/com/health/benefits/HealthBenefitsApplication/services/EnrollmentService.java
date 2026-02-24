package com.health.benefits.HealthBenefitsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EnrollmentEntity;

public interface EnrollmentService {

	
	EnrollmentEntity createEnrollment(EnrollmentEntity _enrollment);
	EnrollmentEntity save(EnrollmentEntity _enrollment);
	List<EnrollmentEntity> findAll();
	 	
 	Optional<EnrollmentEntity> findOne(UUID id);
 
 	boolean isExists(UUID id);
 	
 	EnrollmentEntity partialUpdate(UUID enroll_id,EnrollmentEntity _enrollment);
 	
 	void delete(UUID id);
 	
}
