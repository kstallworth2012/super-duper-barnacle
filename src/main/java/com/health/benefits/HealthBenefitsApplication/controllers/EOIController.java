package com.health.benefits.HealthBenefitsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

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
    @GetMapping("/{id}")
    public ResponseEntity<EOIEntity> getEOIById(@PathVariable String id) {
        return eoiRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}