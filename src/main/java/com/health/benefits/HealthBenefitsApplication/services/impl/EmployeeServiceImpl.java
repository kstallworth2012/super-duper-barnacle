package com.health.benefits.HealthBenefitsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.EmployeeRepository;
import com.health.benefits.HealthBenefitsApplication.services.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	private EmployeeRepository employeeRepository;
	
	
	

	public EmployeeServiceImpl(EmployeeRepository _employeeRepository) {
		super();
		this.employeeRepository = _employeeRepository;
	}




	@Override
	public EmployeeEntity createEmployee(EmployeeEntity _employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(_employee);
	}




	@Override
	public List<EmployeeEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(employeeRepository.findAll().spliterator(),false).collect(Collectors.toList());
	}




	@Override
	public Optional<EmployeeEntity> findOne(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}




	@Override
	public boolean isExists(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.existsById(id);
	}

}
