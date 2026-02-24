package com.health.benefits.HealthBenefitsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EOIEntity;

public interface EOIService {

	EOIEntity createEOI(EOIEntity _eoi);
	
	EOIEntity save(EOIEntity _eoi);
	
	List<EOIEntity> findAll();
	 	
 	Optional<EOIEntity> findOne(UUID id);
 
 	boolean isExists(UUID id);
 	
 	EOIEntity partialUpdate(UUID eoi_id, EOIEntity _eoi);
 	
 	void delete(UUID id);
}
