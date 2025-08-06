package com.health.benefits.HealthBenefitsApplication.mappers.impl;

import org.modelmapper.ModelMapper;

import com.health.benefits.HealthBenefitsApplication.domain.dto.PayrollDeductionDTO;
import com.health.benefits.HealthBenefitsApplication.domain.entities.PayrollDeductionEntity;
import com.health.benefits.HealthBenefitsApplication.mappers.Mapper;

public class PayrollDeductionMapperImpl implements Mapper<PayrollDeductionEntity, PayrollDeductionDTO> {

	private ModelMapper modelMapper;
	
	
	
	
	
	public PayrollDeductionMapperImpl(ModelMapper modelMapper) {
			this.modelMapper = modelMapper;
	}

	@Override
	public PayrollDeductionDTO mapTo(PayrollDeductionEntity a) {
		// TODO Auto-generated method stub
		return modelMapper.map(a, PayrollDeductionDTO.class);
	}

	@Override
	public PayrollDeductionEntity mapFrom(PayrollDeductionDTO b) {
		// TODO Auto-generated method stub
		return modelMapper.map(b, PayrollDeductionEntity.class);
	}

}
