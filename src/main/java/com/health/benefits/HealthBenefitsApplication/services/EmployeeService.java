package com.health.benefits.HealthBenefitsApplication.services;

import java.util.List;
import java.util.Optional;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;

public interface EmployeeService {

	
	EmployeeEntity createEmployee(EmployeeEntity _employee);
	
	List<EmployeeEntity> findAll();
	 	
 	Optional<EmployeeEntity> findOne(String id);
 
 	boolean isExists(String id);
}
