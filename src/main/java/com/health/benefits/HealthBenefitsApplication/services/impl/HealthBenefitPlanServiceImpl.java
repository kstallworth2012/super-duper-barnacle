package com.health.benefits.HealthBenefitsApplication.services.impl;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.HealthBenefitPlanRepository;
import com.health.benefits.HealthBenefitsApplication.services.EmployeeService;

public class HealthBenefitPlanServiceImpl implements EmployeeService {

	
	private HealthBenefitPlanRepository healthBenefitPlanRepository;
	
		public HealthBenefitPlanServiceImpl(HealthBenefitPlanRepository healthBenefitPlanRepository) {
		super();
		this.healthBenefitPlanRepository = healthBenefitPlanRepository;
	}
		
		
	@Override
	public EmployeeEntity createEmployee(EmployeeEntity _employee) {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
