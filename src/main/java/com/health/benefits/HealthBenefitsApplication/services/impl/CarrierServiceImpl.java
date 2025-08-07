package com.health.benefits.HealthBenefitsApplication.services.impl;

import org.springframework.stereotype.Service;

import com.health.benefits.HealthBenefitsApplication.domain.entities.CarrierEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.CarrierRepository;
import com.health.benefits.HealthBenefitsApplication.services.CarrierService;

@Service
public class CarrierServiceImpl implements CarrierService {

	
	private CarrierRepository carrierRepository;

	public CarrierServiceImpl(CarrierRepository carrierRepository) {
		super();
		this.carrierRepository = carrierRepository;
	}

	@Override
	public CarrierEntity createCarrier(CarrierEntity _carrier) {
		// TODO Auto-generated method stub
		return carrierRepository.save(_carrier);
	}

}
