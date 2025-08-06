package com.health.benefits.HealthBenefitsApplication.mappers.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.health.benefits.HealthBenefitsApplication.domain.dto.EoiDTO;
import com.health.benefits.HealthBenefitsApplication.domain.entities.EOIEntity;
import com.health.benefits.HealthBenefitsApplication.mappers.Mapper;


@Component
public class EOIMapperImpl implements Mapper<EOIEntity, EoiDTO> {

	
	
	private ModelMapper modelMapper;
	
	
	public EOIMapperImpl(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	@Override
	public EoiDTO mapTo(EOIEntity a) {
		// TODO Auto-generated method stub
		return  modelMapper.map(a,EoiDTO.class);
	}

	@Override
	public EOIEntity mapFrom(EoiDTO b) {
		// TODO Auto-generated method stub
		return  modelMapper.map(b,EOIEntity.class);
	}

}
