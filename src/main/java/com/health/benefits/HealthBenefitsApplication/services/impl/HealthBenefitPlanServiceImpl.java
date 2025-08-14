package com.health.benefits.HealthBenefitsApplication.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.HealthBenefitPlanRepository;
import com.health.benefits.HealthBenefitsApplication.services.EmployeeService;
import com.health.benefits.HealthBenefitsApplication.services.HealthBenefitPlanService;


@Service
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

		@Override
		public List<HealthBenefitPlanEntity> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Optional<HealthBenefitPlanEntity> findOne(String id) {
			// TODO Auto-generated method stub
			return Optional.empty();
		}

		@Override
		public boolean isExists(String id) {
			// TODO Auto-generated method stub
			return false;
		}
		
		

	
	


}
