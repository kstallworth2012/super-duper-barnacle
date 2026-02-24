package com.health.benefits.HealthBenefitsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.health.benefits.HealthBenefitsApplication.domain.entities.DependentsEntity;

public interface DependentsService {

	
	DependentsEntity createDependent(DependentsEntity _dependents);
	
	DependentsEntity save(DependentsEntity _dependents);
	
	List<DependentsEntity> findAll();
	 	
 	Optional<DependentsEntity> findOne(UUID id);
 
 	boolean isExists(UUID id);
 	
 	DependentsEntity partialUpdate(UUID _id, DependentsEntity _dependents);
 	
 	void delete(UUID _id);
 	
 	
 	
}
