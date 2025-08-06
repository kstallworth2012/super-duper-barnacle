package com.health.benefits.HealthBenefitsApplication.services.impl;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.EmployeeRepository;
import com.health.benefits.HealthBenefitsApplication.services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	
	private EmployeeRepository employeeRepository;
	
	
	

	public EmployeeServiceImpl(EmployeeRepository _employeeRepository) {
		super();
		this.employeeRepository = _employeeRepository;
	}




	@Override
	public EmployeeEntity createEmployee(EmployeeEntity _employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
