package com.health.benefits.HealthBenefitsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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



	@Override
	public List<PayrollDeductionEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(payrollDeductionRepository.findAll().spliterator(),false).collect(Collectors.toList());
	}



	@Override
	public Optional<PayrollDeductionEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return payrollDeductionRepository.findById(id);
	}



	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
