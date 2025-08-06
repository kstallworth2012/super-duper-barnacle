package com.health.benefits.HealthBenefitsApplication.services.impl;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.EnrollmentRepository;
import com.health.benefits.HealthBenefitsApplication.services.EmployeeService;

public class EnrollmentServiceImpl implements EmployeeService {

	
	private EnrollmentRepository enrollmentRepository;

	public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository) {
		super();
		this.enrollmentRepository = enrollmentRepository;
	}

	@Override
	public EmployeeEntity createEmployee(EmployeeEntity _employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
