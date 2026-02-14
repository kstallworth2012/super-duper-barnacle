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

import com.health.benefits.HealthBenefitsApplication.domain.dto.EoiDTO;
import com.health.benefits.HealthBenefitsApplication.domain.entities.EOIEntity;
import com.health.benefits.HealthBenefitsApplication.mappers.Mapper;
import com.health.benefits.HealthBenefitsApplication.repositories.EOIRepository;
import com.health.benefits.HealthBenefitsApplication.services.EOIService;

@RestController
@RequestMapping("/api/eoi")
public class EOIController{


	  private EOIService eoiService;
	  private Mapper<EOIEntity, EoiDTO> eoiMapper;


    public EOIController(EOIService eoiService, Mapper<EOIEntity, EoiDTO> eoiMapper) {
		this.eoiService = eoiService;
		this.eoiMapper = eoiMapper;
	}

   
    @PostMapping(path="/new-eoi")
	public ResponseEntity<EoiDTO> createEOI(@RequestBody EoiDTO _app) {
			EOIEntity eoiEntity = eoiMapper.mapFrom(_app);
			EOIEntity savedEOIEntity = eoiService.createEOI(null, eoiEntity);
			
			return new ResponseEntity<>(eoiMapper.mapTo(savedEOIEntity), HttpStatus.CREATED);
	}
    
    
    
    
	// Read All
    @GetMapping(path = "/")
    public List<EoiDTO> listEOI(){
   	 List<EOIEntity> eoi = eoiService.findAll();
   	 return eoi.stream().map(eoiMapper::mapTo).collect(Collectors.toList());
   			 }

    // Read One
    @GetMapping(path = "/{eoi_id}")
    public ResponseEntity<EoiDTO> getEOIById(@PathVariable("eoi_id") String id) {
       	Optional<EOIEntity> foundEOI = eoiService.findOne(id);
   	    return foundEOI.map(eoiEntity ->{
   	    	EoiDTO eoiDTO = eoiMapper.mapTo(eoiEntity);
   		 return new ResponseEntity<>(eoiDTO, HttpStatus.OK);
   	 
   	 }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
       }
    
    
    
    	//PAGEABLE
	@GetMapping(path="/")
	public Page<EoiDTO> listEOIs(Pageable page){
		Page<EOIEntity> eois = eoiService.findAll(page);
		return eois.map(eoiMapper::mapTo);
	}
     
@PutMapping(path="/{id}")
public ResponseEntity<EoiDTO> fullUpdateEOI(@PathVariable("id") String id, @RequestBody EoiDTO eoiDto){
	
	if(!eoiService.isExists(id)) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	eoiDto.setId(id);
	EOIEntity eoiEntity = eoiMapper.mapFrom(eoiDto);
	EOIEntity savedEOIEntity = eoiService.save(eoiEntity);
	
	return new ResponseEntity<>(eoiMapper.mapTo(savedEOIEntity), HttpStatus.OK); 
	
}	

    
    
    	

@PatchMapping(path ="{/id}")
public ResponseEntity<EoiDTO> partialUpdate(@PathVariable("id") String id, @RequestBody EoiDTO eoiDto){
	
	if(!eoiService.isExists(id)) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	EOIEntity EOIEntity = eoiMapper.mapFrom(eoiDto);
	EOIEntity updatedEOI = eoiService.partialUpdate(id, EOIEntity);
	
	return new ResponseEntity<>(eoiMapper.mapTo(updatedEOI), HttpStatus.OK);
	
	
	
}
    
    
    
    
    
    
    
    
    
	@DeleteMapping(path="/{id}")
	public ResponseEntity<EoiDTO> deleteEOI(@PathVariable("id") String id) {
		
		eoiService.delete(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
     
    
    
    
    
    
    
    
    
    
    
    

}