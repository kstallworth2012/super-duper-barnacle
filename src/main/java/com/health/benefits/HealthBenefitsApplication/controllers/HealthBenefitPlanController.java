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

import com.health.benefits.HealthBenefitsApplication.domain.dto.HealthBenefitPlanDTO;
import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;
import com.health.benefits.HealthBenefitsApplication.mappers.Mapper;
import com.health.benefits.HealthBenefitsApplication.repositories.HealthBenefitPlanRepository;
import com.health.benefits.HealthBenefitsApplication.services.HealthBenefitPlanService;


@RestController
@RequestMapping("/api/health-plans")
public class HealthBenefitPlanController{


	  private HealthBenefitPlanService healthBenefitPlanService;
	  private Mapper<HealthBenefitPlanEntity, HealthBenefitPlanDTO> healthBenefitPlanMapper;

	  public HealthBenefitPlanController(HealthBenefitPlanService healthBenefitPlanService,
			Mapper<HealthBenefitPlanEntity, HealthBenefitPlanDTO> healthBenefitPlanMapper) {
		this.healthBenefitPlanService = healthBenefitPlanService;
		this.healthBenefitPlanMapper = healthBenefitPlanMapper;
	}

	// Read All
	  @GetMapping(path = "/")
	  public List<HealthBenefitPlanDTO> listHealthBenefitPlans(){
	    	 List<HealthBenefitPlanEntity> healthbenefitplans = healthBenefitPlanService.findAll();
	    	 return healthbenefitplans.stream().map(healthBenefitPlanMapper::mapTo).collect(Collectors.toList());
	    			 }

    // Read One
	  @GetMapping(path = "/{plan_id}")
	  public ResponseEntity<HealthBenefitPlanDTO> getHealthBenefitPlanById(@PathVariable("plan_id") String id) {
	     	Optional<HealthBenefitPlanEntity> foundHealthBenefitPlan = healthBenefitPlanService.findOne(id);
	 	    return foundHealthBenefitPlan.map(healthBenefitPlanEntity ->{
	 	    	HealthBenefitPlanDTO healthBenefitPlanDTO = healthBenefitPlanMapper.mapTo(healthBenefitPlanEntity);
	 		 return new ResponseEntity<>(healthBenefitPlanDTO, HttpStatus.OK);
	 	 
	 	 }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	     }

}