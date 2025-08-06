package com.health.benefits.HealthBenefitsApplication.mappers.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.health.benefits.HealthBenefitsApplication.domain.dto.EmployeeDTO;
import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.mappers.Mapper;


@Component
public class EmployeeMapperImpl implements Mapper<EmployeeEntity, EmployeeDTO> {

	
	
	private ModelMapper modelMapper;
	
	
	
	public EmployeeMapperImpl(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	@Override
	public EmployeeDTO mapTo(EmployeeEntity a) {
		// TODO Auto-generated method stub
		return  modelMapper.map(a,EmployeeDTO.class);
	}

	@Override
	public EmployeeEntity mapFrom(EmployeeDTO b) {
		// TODO Auto-generated method stub
		return  modelMapper.map(b,EmployeeEntity.class);
	}

}
