package com.health.benefits.HealthBenefitsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;

public interface HealthBenefitPlanService {

	
	HealthBenefitPlanEntity createHealthBenefitPlan(HealthBenefitPlanEntity _healthPlan);
	
	HealthBenefitPlanEntity save(HealthBenefitPlanEntity hbp);
	
	List<HealthBenefitPlanEntity> findAll();
	 	
 	Optional<HealthBenefitPlanEntity> findOne(UUID id);
 
 	boolean isExists(UUID id);
 	
 	HealthBenefitPlanEntity partialUpdate(UUID id, HealthBenefitPlanEntity hbp);
 	
 	void delete(UUID id);
 	
	
}
