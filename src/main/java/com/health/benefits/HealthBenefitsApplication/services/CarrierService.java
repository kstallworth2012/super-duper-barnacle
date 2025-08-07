package com.health.benefits.HealthBenefitsApplication.services;

import java.util.List;

import com.health.benefits.HealthBenefitsApplication.domain.entities.CarrierEntity;

public interface CarrierService {
		
		CarrierEntity createCarrier(CarrierEntity _carrier);

		 List<CarrierEntity> findAll();
}
