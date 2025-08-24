package com.health.benefits.HealthBenefitsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.health.benefits.HealthBenefitsApplication.domain.dto.EmployeeDTO;
import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.mappers.Mapper;
import com.health.benefits.HealthBenefitsApplication.repositories.EmployeeRepository;
import com.health.benefits.HealthBenefitsApplication.services.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController{


	  private EmployeeService employeeService;
	  private Mapper<EmployeeEntity, EmployeeDTO> employeeMapper;

   
  
	    public EmployeeController(EmployeeService employeeService, Mapper<EmployeeEntity, EmployeeDTO> employeeMapper) {
		this.employeeService = employeeService;
		this.employeeMapper = employeeMapper;
}

	// Read All
    @GetMapping(path="/")
    public List<EmployeeDTO> getAllEmployees(){
   	 List<EmployeeEntity> employees = employeeService.findAll();
   	 return employees.stream().map(employeeMapper::mapTo).collect(Collectors.toList());
   			 }
    
    
    
    
    
    // Read One
    @GetMapping(path = "/{emp_id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("emp_id") Long id) {
       	Optional<EmployeeEntity> foundEmployee = employeeService.findOne(id);
   	    return foundEmployee.map(employeeEntity ->{
   	    	EmployeeDTO employeeDTO = employeeMapper.mapTo(employeeEntity);
   		 return new ResponseEntity<>(employeeDTO, HttpStatus.OK);
   	 
   	 }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
       }

    
    
    
}