package com.health.benefits.HealthBenefitsApplication.mappers.impl;

import org.modelmapper.ModelMapper;

import com.health.benefits.HealthBenefitsApplication.domain.dto.EnrollmentDTO;
import com.health.benefits.HealthBenefitsApplication.domain.entities.EnrollmentEntity;
import com.health.benefits.HealthBenefitsApplication.mappers.Mapper;

public class EnrollmentMapperImpl implements Mapper<EnrollmentEntity, EnrollmentDTO> {

	
	
	private ModelMapper modelMapper;
	
	
	public EnrollmentMapperImpl(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	@Override
	public EnrollmentDTO mapTo(EnrollmentEntity a) {
		// TODO Auto-generated method stub
		return  modelMapper.map(a,EnrollmentDTO.class);
	}

	@Override
	public EnrollmentEntity mapFrom(EnrollmentDTO b) {
		// TODO Auto-generated method stub
		return  modelMapper.map(b,EnrollmentEntity.class);
	}

}
