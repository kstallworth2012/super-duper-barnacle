package com.health.benefits.HealthBenefitsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.health.benefits.HealthBenefitsApplication.domain.dto.PayrollDeductionDTO;
import com.health.benefits.HealthBenefitsApplication.domain.entities.PayrollDeductionEntity;
import com.health.benefits.HealthBenefitsApplication.mappers.Mapper;
import com.health.benefits.HealthBenefitsApplication.repositories.PayrollDeductionRepository;
import com.health.benefits.HealthBenefitsApplication.services.PayrollDeductionService;


@RestController
@RequestMapping("/api/payroll-deductions")
public class PayrollDeductionController{


	  private PayrollDeductionService payrollDeductionService;
	  private Mapper<PayrollDeductionEntity, PayrollDeductionDTO> payrollDeductionMapper;

	  
	  
	  
    public PayrollDeductionController(PayrollDeductionService payrollDeductionService,
			Mapper<PayrollDeductionEntity, PayrollDeductionDTO> payrollDeductionMapper) {
		this.payrollDeductionService = payrollDeductionService;
		this.payrollDeductionMapper = payrollDeductionMapper;
	}

	// Read All
    @GetMapping(path="/")
    public Iterable<PayrollDeductionEntity> getAllPayrollDeductions() {
        return payrollDeductionRepository.findAll();
    }

    // Read One
    @GetMapping("/{id}")
    public ResponseEntity<PayrollDeductionEntity> getPayrollDeductionById(@PathVariable String id) {
        return payrollDeductionRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}