package com.health.benefits.HealthBenefitsApplication.services.impl;

import org.springframework.stereotype.Service;

import com.health.benefits.HealthBenefitsApplication.domain.entities.PayrollDeductionEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.PayrollDeductionRepository;
import com.health.benefits.HealthBenefitsApplication.services.PayrollDeductionService;


@Service
public class PayrollDeductionServiceImpl implements PayrollDeductionService {

	
	
	private PayrollDeductionRepository payrollDeductionRepository;
	
	
	
	public PayrollDeductionServiceImpl(PayrollDeductionRepository payrollDeductionRepository) {
		super();
		this.payrollDeductionRepository = payrollDeductionRepository;
	}



	@Override
	public PayrollDeductionEntity createPayrollDeduction(PayrollDeductionEntity _payrollDeduction) {
		// TODO Auto-generated method stub
		return payrollDeductionRepository.save(_payrollDeduction);
	}

}
