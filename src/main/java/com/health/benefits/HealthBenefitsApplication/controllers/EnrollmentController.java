package com.health.benefits.HealthBenefitsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.health.benefits.HealthBenefitsApplication.domain.dto.EnrollmentDTO;
import com.health.benefits.HealthBenefitsApplication.domain.entities.EnrollmentEntity;
import com.health.benefits.HealthBenefitsApplication.mappers.Mapper;
import com.health.benefits.HealthBenefitsApplication.repositories.EnrollmentRepository;
import com.health.benefits.HealthBenefitsApplication.services.EnrollmentService;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController{


	private EnrollmentService enrollmentService;
    private Mapper<EnrollmentEntity, EnrollmentDTO> enrollmentMapper;

      
    public EnrollmentController(EnrollmentService enrollmentService,
			Mapper<EnrollmentEntity, EnrollmentDTO> enrollmentMapper) {
		this.enrollmentService = enrollmentService;
		this.enrollmentMapper = enrollmentMapper;
	}
    
    
    
    
	@PostMapping(path="/new-enrollment")
	public ResponseEntity<EnrollmentDTO> createEnrollment(@RequestBody EnrollmentDTO _app) {
			EnrollmentEntity enrollmentEntity = enrollmentMapper.mapFrom(_app);
			EnrollmentEntity savedEnrollmentEntity = enrollmentService.createEnrollment(null, enrollmentEntity);
			
			return new ResponseEntity<>(enrollmentMapper.mapTo(savedEnrollmentEntity), HttpStatus.CREATED);
	}



   

	// Read All
    @GetMapping(path = "/")
    public List<EnrollmentDTO> listEnrollments(){
   	 List<EnrollmentEntity> enrollments = enrollmentService.findAll();
   	 return enrollments.stream().map(enrollmentMapper::mapTo).collect(Collectors.toList());
   			 }

    // Read One
    @GetMapping(path = "/{enrollment_id}")
    public ResponseEntity<EnrollmentDTO> getEnrollmentById(@PathVariable("enrollment_id") String id) {
       	Optional<EnrollmentEntity> foundEnrollment = enrollmentService.findOne(id);
   	    return foundEnrollment.map(enrollmentEntity ->{
   	    	EnrollmentDTO enrollmentDTO = enrollmentMapper.mapTo(enrollmentEntity);
   		 return new ResponseEntity<>(enrollmentDTO, HttpStatus.OK);
   	 
   	 }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
       }

    
    
    	//PAGEABLE
	@GetMapping(path="/")
	public Page<EnrollmentDTO> listEnrollments(Pageable page){
		Page<EnrollmentEntity> enrollments = enrollmentService.findAll(page);
		return enrollments.map(enrollmentMapper::mapTo);
	}
    
    
    

@PutMapping(path="/{id}")
public ResponseEntity<EnrollmentDTO> fullUpdateEnrollment(@PathVariable("id") String id, @RequestBody EnrollmentDTO enrollmentDto){
	
	if(!enrollmentService.isExists(id)) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	enrollmentDto.setId(id);
	EnrollmentEntity enrollmentEntity = enrollmentMapper.mapFrom(enrollmentDto);
	EnrollmentEntity savedEnrollmentEntity = enrollmentService.save(enrollmentEntity);
	
	return new ResponseEntity<>(enrollmentMapper.mapTo(savedEnrollmentEntity), HttpStatus.OK); 
	
}	

    
    
    	

@PatchMapping(path ="{/id}")
public ResponseEntity<EnrollmentDTO> partialUpdate(@PathVariable("id") String id, @RequestBody EnrollmentDTO enrollmentDto){
	
	if(!enrollmentService.isExists(id)) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	EnrollmentEntity enrollmentEntity = enrollmentMapper.mapFrom(enrollmentDto);
	EnrollmentEntity updatedEnrollment = enrollmentService.partialUpdate(id, applicantEntity);
	
	return new ResponseEntity<>(enrollmentMapper.mapTo(updatedApplicant), HttpStatus.OK);
	
	
	
}
    
    
    
    
    
    
    
    
    
    
 	@DeleteMapping(path="/{id}")
 	public ResponseEntity<EnrollmentDTO> deleteEnrollment(@PathVariable("id") String id) {
 		
 		enrollmentService.delete(id);
 		
 		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
 	}
      
    
    
    
    
    
    
    
    
    
    
}