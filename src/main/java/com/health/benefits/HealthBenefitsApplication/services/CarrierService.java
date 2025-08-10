package com.health.benefits.HealthBenefitsApplication.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.health.benefits.HealthBenefitsApplication.domain.entities.CarrierEntity;

@Service
public interface CarrierService {
		
		CarrierEntity createCarrier(CarrierEntity _carrier);

		 List<CarrierEntity> findAll();
}
