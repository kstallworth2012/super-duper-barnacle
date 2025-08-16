package com.health.benefits.HealthBenefitsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.domain.entities.EnrollmentEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.EnrollmentRepository;
import com.health.benefits.HealthBenefitsApplication.services.EmployeeService;
import com.health.benefits.HealthBenefitsApplication.services.EnrollmentService;


@Service
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

	@Override
	public List<EnrollmentEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(enrollmentRepository.findAll().spliterator(),false).collect(Collectors.toList());
	}

	@Override
	public Optional<EnrollmentEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return enrollmentRepository.findById(id);
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return enrollmentRepository.existsById(id);
	}



}
