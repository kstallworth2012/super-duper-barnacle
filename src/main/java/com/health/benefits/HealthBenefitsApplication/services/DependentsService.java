package com.health.benefits.HealthBenefitsApplication.services;

import java.util.List;
import java.util.Optional;

import com.health.benefits.HealthBenefitsApplication.domain.entities.DependentsEntity;

public interface DependentsService {

	
	DependentsEntity createDependent(DependentsEntity _dependents);
	
	List<DependentsEntity> findAll();
	 	
 	Optional<DependentsEntity> findOne(String id);
 
 	boolean isExists(String id);
}
