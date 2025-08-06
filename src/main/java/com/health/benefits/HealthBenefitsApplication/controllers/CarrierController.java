package com.health.benefits.HealthBenefitsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import com.health.benefits.HealthBenefitsApplication.domain.entities.CarrierEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.CarrierRepository;

@RestController
@RequestMapping("/api/carriers")
public class CarrierController{

	//private CarrierService carrierService;
	//private Mapper<CarrierEntity, CarrierDTO> carrierMapper;
	/*
	     public CarrierController(CarrierService _carrierService,Mapper<CarrierEntity, CarrierDTO> _carrierMapper){
	           this.carrierService = _carrierService;
	           this.carrierMapper = _carrierMapper;
	     }
	     
	     
	     @PostMapping
	     public CarrierDTO(@RequestBody CarrierDTO _carrierDTO){
	          
	     			CarrierEntity carrierEntity = carrierMapper.mapFrom(_carrierDTO);
	     	     	CarrierEntity savedCarrierEntity = carrierService.createCarrier(carrierEntity);
	     	     	return carrierMapper.mapTo(savedCarrierEntity);
	     }
	 */
	
	
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

}