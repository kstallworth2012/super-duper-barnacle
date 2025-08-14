package com.health.benefits.HealthBenefitsApplication.services;

import java.util.List;
import java.util.Optional;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EnrollmentEntity;

public interface EnrollmentService {

	
	EnrollmentEntity createEnrollment(EnrollmentEntity _enrollment);
	
	List<EnrollmentEntity> findAll();
	 	
 	Optional<EnrollmentEntity> findOne(String id);
 
 	boolean isExists(String id);
}
