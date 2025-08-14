package com.health.benefits.HealthBenefitsApplication.services;

import java.util.List;
import java.util.Optional;

import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;

public interface HealthBenefitPlanService {

	
	HealthBenefitPlanEntity createHealthBenefitPlan(HealthBenefitPlanEntity _healthPlan);
	
	List<HealthBenefitPlanEntity> findAll();
	 	
 	Optional<HealthBenefitPlanEntity> findOne(String id);
 
 	boolean isExists(String id);
	
}
