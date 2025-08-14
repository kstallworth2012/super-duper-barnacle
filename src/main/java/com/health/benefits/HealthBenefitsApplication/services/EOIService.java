package com.health.benefits.HealthBenefitsApplication.services;

import java.util.List;
import java.util.Optional;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EOIEntity;

public interface EOIService {

	EOIEntity createEOI(EOIEntity _eoi);
	
	List<EOIEntity> findAll();
	 	
 	Optional<EOIEntity> findOne(String id);
 
 	boolean isExists(String id);
}
