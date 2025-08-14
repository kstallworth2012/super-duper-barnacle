package com.health.benefits.HealthBenefitsApplication.services;

import java.util.List;
import java.util.Optional;

import com.health.benefits.HealthBenefitsApplication.domain.entities.PayrollDeductionEntity;

public interface PayrollDeductionService {

	PayrollDeductionEntity createPayrollDeduction(PayrollDeductionEntity _payrollDeduction);
	
	List<PayrollDeductionEntity> findAll();
	 	
 	Optional<PayrollDeductionEntity> findOne(String id);
 
 	boolean isExists(String id);
	
}
