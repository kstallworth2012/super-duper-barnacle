package com.health.benefits.HealthBenefitsApplication.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.benefits.HealthBenefitsApplication.domain.dto.CarrierDTO;
import com.health.benefits.HealthBenefitsApplication.domain.dto.DependentsDTO;
import com.health.benefits.HealthBenefitsApplication.domain.entities.CarrierEntity;
import com.health.benefits.HealthBenefitsApplication.domain.entities.DependentsEntity;
import com.health.benefits.HealthBenefitsApplication.mappers.Mapper;
import com.health.benefits.HealthBenefitsApplication.services.DependentsService;

@RestController
@RequestMapping("/api/dependents")
public class DependentController{


	
	private DependentsService dependentService;
	private Mapper<DependentsEntity,DependentsDTO> dependentsMapper;


    public DependentController(DependentsService dependentService,
			Mapper<DependentsEntity, DependentsDTO> dependentsMapper) {
		this.dependentService = dependentService;
		this.dependentsMapper = dependentsMapper;
	}

	// Read All
    @GetMapping(path="/")
    public List<DependentsDTO> getAllDependents() {
    	List<DependentsEntity> dependents = dependentService.findAll();
   	 return dependents.stream().map(dependentsMapper::mapTo).collect(Collectors.toList());
    }
    
	//PAGEABLE
	@GetMapping(path="/")
	public Page<DependentsDTO> listDependents(Pageable page){
		Page<DependentsEntity> dependents = dependentService.findAll(page);
		return dependents.map(dependentsMapper::mapTo);
	}

    // Read One
    @GetMapping("/{dependent_id}")
    public ResponseEntity<DependentsDTO> getDependentById(@PathVariable("dependent_id") Long id) {
    	Optional<DependentsEntity> foundDependent = dependentService.findOne(id);
   	 return foundDependent.map(dependentsEntity ->{
   		DependentsDTO dependentsDTO = dependentsMapper.mapTo(dependentsEntity);
		 return new ResponseEntity<>(dependentsDTO, HttpStatus.OK);
	 
	 }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    
    @PostMapping(path = "/new-dependent")
    public ResponseEntity<DependentsDTO> createDependent(@RequestBody DependentsDTO _dependentDTO){
         
    	DependentsEntity dependentEntity = dependentsMapper.mapFrom(_dependentDTO);
    	DependentsEntity savedDependentEntity = dependentService.createDependent(dependentEntity);
    	     	return new ResponseEntity<>(dependentsMapper.mapTo(savedDependentEntity), HttpStatus.CREATED);
    }
    
    
    
    

@PutMapping(path="/{id}")
public ResponseEntity<DependentsDTO> fullUpdateDependent(@PathVariable("id") String id, @RequestBody DependentsDTO dependentsDto){
	
	if(!dependentService.isExists(id)) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	dependentsDto.setId(id);
	DependentsEntity dependentsEntity = dependentsMapper.mapFrom(dependentsDto);
	DependentsEntity savedDependentsEntity = dependentService.save(dependentsEntity);
	
	return new ResponseEntity<>(dependentsMapper.mapTo(savedDependentsEntity), HttpStatus.OK); 
	
}	

    
    
    	

@PatchMapping(path ="{/id}")
public ResponseEntity<DependentsDTO> partialUpdate(@PathVariable("id") String id, @RequestBody DependentsDTO dependentDto){
	
	if(!dependentService.isExists(id)) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	DependentsEntity dependentEntity = dependentsMapper.mapFrom(dependentDto);
	DependentsEntity updatedDependent = dependentService.partialUpdate(id, dependentEntity);
	
	return new ResponseEntity<>(dependentsMapper.mapTo(updatedDependent), HttpStatus.OK);
	
	
	
}
    
    
    
    
    
 	@DeleteMapping(path="/{id}")
 	public ResponseEntity<DependentsDTO> deleteDependent(@PathVariable("id") String id) {
 		
 		dependentService.delete(id);
 		
 		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
 	}
      
    
    

}