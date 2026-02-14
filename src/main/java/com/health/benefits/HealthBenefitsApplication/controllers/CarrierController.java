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
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.health.benefits.HealthBenefitsApplication.domain.dto.CarrierDTO;
import com.health.benefits.HealthBenefitsApplication.domain.entities.CarrierEntity;
import com.health.benefits.HealthBenefitsApplication.mappers.Mapper;
import com.health.benefits.HealthBenefitsApplication.repositories.CarrierRepository;
import com.health.benefits.HealthBenefitsApplication.services.CarrierService;

@RestController
@RequestMapping("/api/carriers")
public class CarrierController{

	private CarrierService carrierService;
	private Mapper<CarrierEntity, CarrierDTO> carrierMapper;
	
	     public CarrierController(CarrierService _carrierService,Mapper<CarrierEntity, CarrierDTO> _carrierMapper){
	           this.carrierService = _carrierService;
	           this.carrierMapper = _carrierMapper;
	     }
	     
	     @GetMapping(path = "/")
	     public List<CarrierDTO> listCarriers(){
	    	 List<CarrierEntity> carriers = carrierService.findAll();
	    	 return carriers.stream().map(carrierMapper::mapTo).collect(Collectors.toList());
	    			 }
	     
	     @GetMapping(path = "/{carrier_id}")
	     public ResponseEntity<CarrierDTO> getCarrier(@PathVariable("carrier_id") Long id){
	    	 Optional<CarrierEntity> foundCarrier = carrierService.findOne(id);
	    	 return foundCarrier.map(carrierEntity ->{
	    		 CarrierDTO carrierDTO = carrierMapper.mapTo(carrierEntity);
	    		 return new ResponseEntity<>(carrierDTO, HttpStatus.OK);
	    	 
	    	 }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	     }
	     
	 	//PAGEABLE
	 	@GetMapping(path="/")
	 	public Page<CarrierDTO> listCarriers(Pageable page){
	 		Page<CarrierEntity> Carriers = carrierService.findAll(page);
	 		return Carriers.map(carrierMapper::mapTo);
	 	}
	 	
	     
	     
	     
	     
	     @PostMapping(path = "/new-carrier")
	     public ResponseEntity<CarrierDTO> createCarrier(@RequestBody CarrierDTO _carrierDTO){
	          
	     			CarrierEntity carrierEntity = carrierMapper.mapFrom(_carrierDTO);
	     	     	CarrierEntity savedCarrierEntity = carrierService.createCarrier(carrierEntity);
	     	     	return new ResponseEntity<>(carrierMapper.mapTo(savedCarrierEntity), HttpStatus.CREATED);
	     }
	 
	     @PutMapping(path = "/{carrier_id}")
	     public ResponseEntity<CarrierDTO> fullUpdateCarrier(@PathVariable("carrier_id") Long id,
	    		 @RequestBody CarrierDTO carrierDTO){
	    	 
//	    	 CarrierEntity carrierEntity = carrierMapper.mapFrom(carrierDTO);
//	         boolean carrierExists = carrierService.isExists(id);
//	         CarrierEntity savedCarrierEntity = carrierService.createCarrierUpdate(carrierEntity);
//	         CarrierDTO savedUpdatedCarrierDTO = carrierMapper.mapTo(savedCarrierEntity);

	         
	         /*
	          * alternative 
	          */
	           if(!carrierService.isExists(id){
	           		return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
	           }
	           carrierDTO.setId(id); 
	           CarrierEntity carrierEntity = carrierMapper.mapFrom(carrierDTO); 
	           CarrierEntity savedCarrierEntity = carrierService.save(carrierEntity); 
	           return new ResponseEntity<>(carrierMapper.mapTo(savedCarrierEntity), HttpStatus.OK);    
	          
	     }
	     
	     
	/*
	 	@PutMapping(path="/{id}")
	public ResponseEntity<ApplicantDto> fullUpdateApplicant(@PathVariable("id") String id, @RequestBody ApplicantDto appDto){
		
		if(!appService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		appDto.setId(id);
		Applicant applicantEntity = applicantMapper.mapFrom(appDto);
		Applicant savedApplicantEntity = appService.save(applicantEntity);
		
		return new ResponseEntity<>(applicantMapper.mapTo(savedApplicantEntity), HttpStatus.OK); 
		
	}	
	 */
	     
	     	
	
	@PatchMapping(path ="{/id}")
	public ResponseEntity<CarrierDTO> partialUpdate(@PathVariable("id") String id, @RequestBody CarrierDTO carrierDto){
		
		if(!carrierService.isExists(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		
		CarrierEntity carrierEntity = carrierMapper.mapFrom(carrierDto);
		CarrierEntity updatedCarrier = carrierService.partialUpdate(id, carrierEntity);
		
		return new ResponseEntity<>(carrierMapper.mapTo(updatedCarrier), HttpStatus.OK);
		
		
		
	}
	     
	     
	     
	     
	     
	     
	     
	 	@DeleteMapping(path="/{id}")
	 	public ResponseEntity<CarrierDTO> deleteCarrier(@PathVariable("id") String id) {
	 		
	 		carrierService.delete(id);
	 		
	 		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	 	}
	      
	     
	
	/*
	private final CarrierRepository carrierRepository;

    public CarrierController(CarrierRepository _carrierRepository) {
        this.carrierRepository = _carrierRepository;
    }


    // Read All
    @GetMapping
    public Iterable<CarrierEntity> getAllCarriers() {
        return carrierRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<CarrierEntity> getCarrierById(@PathVariable String id) {
        return carrierRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
*/
}