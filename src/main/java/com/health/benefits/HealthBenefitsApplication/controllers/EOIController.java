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

}