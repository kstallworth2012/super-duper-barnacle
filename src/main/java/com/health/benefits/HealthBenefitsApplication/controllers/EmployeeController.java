package com.health.benefits.HealthBenefitsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

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
    
    
    /*
    	//PAGEABLE
	@GetMapping(path="/")
	public Page<ApplicantDto> listApplicants(Pageable page){
		Page<Applicant> applicants = appService.findAll(page);
		return applicants.map(applicantMapper::mapTo);
	}
    
    */
    
    
    
    // Read One
    @GetMapping(path = "/{emp_id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("emp_id") Long id) {
       	Optional<EmployeeEntity> foundEmployee = employeeService.findOne(id);
   	    return foundEmployee.map(employeeEntity ->{
   	    	EmployeeDTO employeeDTO = employeeMapper.mapTo(employeeEntity);
   		 return new ResponseEntity<>(employeeDTO, HttpStatus.OK);
   	 
   	 }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
       }

    
    
    

    @PutMapping(path="/{id}")
    public ResponseEntity<EmployeeDTO> fullUpdateEmployee(@PathVariable("id") String id, @RequestBody EmployeeDTO empDto){
	
			if(!employeeService.isExists(id)) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				
			}
			
			empDto.setId(id);
			EmployeeEntity employeeEntity = employeeMapper.mapFrom(empDto);
			EmployeeEntity savedEmployeeEntity = employeeService.save(employeeEntity);
			
			return new ResponseEntity<>(employeeMapper.mapTo(savedEmployeeEntity), HttpStatus.OK); 
			
}	

    
    	

@PatchMapping(path ="{/id}")
public ResponseEntity<EmployeeDTO> partialUpdate(@PathVariable("id") String id, @RequestBody EmployeeDTO employeeDto){
	
	if(!employeeService.isExists(id)) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	EmployeeEntity employeeEntity = employeeMapper.mapFrom(employeeDto);
	EmployeeEntity updatedEmployee = employeeService.partialUpdate(id, employeeEntity);
	
	return new ResponseEntity<>(employeeMapper.mapTo(updatedEmployee), HttpStatus.OK);
	
	
	
}
    
    
    
    
    
    
 	@DeleteMapping(path="/{id}")
 	public ResponseEntity<EmployeeDTO> deleteEmployee(@PathVariable("id") String id) {
 		
 		employeeService.delete(id);
 		
 		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
 	}
      
    
}