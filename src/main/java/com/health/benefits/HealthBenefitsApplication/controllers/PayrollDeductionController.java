package com.health.benefits.HealthBenefitsApplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import com.health.benefits.HealthBenefitsApplication.domain.entities.PayrollDeductionEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.PayrollDeductionRepository;


@RestController
@RequestMapping("/api/payroll-deductions")
public class PayrollDeductionController{


	private final PayrollDeductionRepository payrollDeductionRepository;

    public PayrollDeductionController(PayrollDeductionRepository _payrollDeductionRepository) {
        this.payrollDeductionRepository = _payrollDeductionRepository;
    }


    // Read All
    @GetMapping
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