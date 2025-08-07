package com.health.benefits.HealthBenefitsApplication.services.impl;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.domain.entities.EnrollmentEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.EnrollmentRepository;
import com.health.benefits.HealthBenefitsApplication.services.EmployeeService;
import com.health.benefits.HealthBenefitsApplication.services.EnrollmentService;

public class EnrollmentServiceImpl implements EnrollmentService {

	
	private EnrollmentRepository enrollmentRepository;

	public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository) {
		super();
		this.enrollmentRepository = enrollmentRepository;
	}

	@Override
	public EnrollmentEntity createEnrollment(EnrollmentEntity _enrollment) {
		// TODO Auto-generated method stub
		return enrollmentRepository.save(_enrollment);

	}



}
