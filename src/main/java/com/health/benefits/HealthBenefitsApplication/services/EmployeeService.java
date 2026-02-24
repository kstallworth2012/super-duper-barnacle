package com.health.benefits.HealthBenefitsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;

public interface EmployeeService {

	
	EmployeeEntity createEmployee(EmployeeEntity _employee);
	
	EmployeeEntity save(EmployeeEntity _employee);
	
	
	List<EmployeeEntity> findAll();
	 	
 	Optional<EmployeeEntity> findOne(UUID id);
 
 	boolean isExists(UUID id);
 	
 	EmployeeEntity partialUpdate(UUID _id, EmployeeEntity _employee);
 	
 	void delete(UUID _id);
 	
 	
 	
 	
 	
}
