package com.health.benefits.HealthBenefitsApplication.mappers.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.health.benefits.HealthBenefitsApplication.domain.dto.HealthBenefitPlanDTO;
import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;
import com.health.benefits.HealthBenefitsApplication.mappers.Mapper;



@Component
public class HealthBenefitPlanMapperImpl implements Mapper<HealthBenefitPlanEntity, HealthBenefitPlanDTO> {

	
	
	private ModelMapper modelMapper;
	
	
	public HealthBenefitPlanMapperImpl(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	@Override
	public HealthBenefitPlanDTO mapTo(HealthBenefitPlanEntity a) {
		// TODO Auto-generated method stub
		return  modelMapper.map(a,HealthBenefitPlanDTO.class);
	}

	@Override
	public HealthBenefitPlanEntity mapFrom(HealthBenefitPlanDTO b) {
		// TODO Auto-generated method stub
		return modelMapper.map(b,HealthBenefitPlanEntity.class);

		}
}
