package com.health.benefits.HealthBenefitsApplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.health.benefits.HealthBenefitsApplication.domain.entities.CarrierEntity;


public interface CarrierService {
		
		CarrierEntity save(CarrierEntity _carrier);

		 List<CarrierEntity> findAll();
		 
		 Optional<CarrierEntity> findOne(String id);
		 
		 boolean isExists(String id);
}
