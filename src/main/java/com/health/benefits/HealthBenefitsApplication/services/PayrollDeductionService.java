package com.health.benefits.HealthBenefitsApplication.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.health.benefits.HealthBenefitsApplication.domain.entities.PayrollDeductionEntity;

public interface PayrollDeductionService {

	PayrollDeductionEntity createPayrollDeduction(PayrollDeductionEntity _payrollDeduction);
	
	PayrollDeductionEntity save(PayrollDeductionEntity _payrollDeduct);
	
	List<PayrollDeductionEntity> findAll();
	 	
 	Optional<PayrollDeductionEntity> findOne(UUID id);
 
 	boolean isExists(UUID id);
 	
 	PayrollDeductionEntity partialUpdate(UUID payroll_id, PayrollDeductionEntity payrollDeduct);
	
 	void delete(UUID payroll_id);
}
