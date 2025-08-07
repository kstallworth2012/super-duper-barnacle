package com.health.benefits.HealthBenefitsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	     
	     @GetMapping(path = "/all")
	     public List<CarrierDTO> listCarriers(){
	    	 List<CarrierEntity> carriers = carrierService.findAll();
	    	 return carriers.stream().map(carrierMapper::mapTo).collect(Collectors.toList());
	    			 }
	     
	     @PostMapping(path = "/new-carrier")
	     public ResponseEntity<CarrierDTO> createCarrier(@RequestBody CarrierDTO _carrierDTO){
	          
	     			CarrierEntity carrierEntity = carrierMapper.mapFrom(_carrierDTO);
	     	     	CarrierEntity savedCarrierEntity = carrierService.createCarrier(carrierEntity);
	     	     	return new ResponseEntity<>(carrierMapper.mapTo(savedCarrierEntity), HttpStatus.CREATED);
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