package com.health.benefits.HealthBenefitsApplication.mappers.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.health.benefits.HealthBenefitsApplication.domain.dto.DependentsDTO;
import com.health.benefits.HealthBenefitsApplication.domain.entities.DependentsEntity;
import com.health.benefits.HealthBenefitsApplication.mappers.Mapper;


@Component
public class DependentsMapperImpl implements Mapper<DependentsEntity, DependentsDTO> {

	
	private ModelMapper modelMapper;
	
	public DependentsMapperImpl(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	@Override
	public DependentsDTO mapTo(DependentsEntity a) {
		// TODO Auto-generated method stub
		return  modelMapper.map(a,DependentsDTO.class);
	}

	@Override
	public DependentsEntity mapFrom(DependentsDTO b) {
		// TODO Auto-generated method stub
		return  modelMapper.map(b,DependentsEntity.class);
	}

}
