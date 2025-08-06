package com.health.benefits.HealthBenefitsApplication.mappers.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.health.benefits.HealthBenefitsApplication.domain.dto.CarrierDTO;
import com.health.benefits.HealthBenefitsApplication.domain.entities.CarrierEntity;
import com.health.benefits.HealthBenefitsApplication.mappers.Mapper;


@Component
public class CarrierMapperImpl implements Mapper<CarrierEntity, CarrierDTO> {

	
	
	private ModelMapper modelMapper;
	
	
	public CarrierMapperImpl(ModelMapper modelMapper) {
		
		this.modelMapper = modelMapper;
	}

	@Override
	public CarrierDTO mapTo(CarrierEntity a) {
		// TODO Auto-generated method stub
		return  modelMapper.map(a,CarrierDTO.class);
	}

	@Override
	public CarrierEntity mapFrom(CarrierDTO b) {
		// TODO Auto-generated method stub
		return  modelMapper.map(b,CarrierEntity.class);
	}

}
