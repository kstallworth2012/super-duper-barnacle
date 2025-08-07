package com.health.benefits.HealthBenefitsApplication.services.impl;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.HealthBenefitPlanRepository;
import com.health.benefits.HealthBenefitsApplication.services.EmployeeService;
import com.health.benefits.HealthBenefitsApplication.services.HealthBenefitPlanService;

public class HealthBenefitPlanServiceImpl implements HealthBenefitPlanService {

	
	private HealthBenefitPlanRepository healthBenefitPlanRepository;
	
		public HealthBenefitPlanServiceImpl(HealthBenefitPlanRepository healthBenefitPlanRepository) {
		super();
		this.healthBenefitPlanRepository = healthBenefitPlanRepository;
	}

		@Override
		public HealthBenefitPlanEntity createHealthBenefitPlan(HealthBenefitPlanEntity _healthPlan) {
			// TODO Auto-generated method stub
			return healthBenefitPlanRepository.save(_healthPlan);
		}
		
		

	
	


}
