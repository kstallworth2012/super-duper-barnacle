package com.health.benefits.HealthBenefitsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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

	@Override
	public List<CarrierEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(carrierRepository.findAll().spliterator(),false).collect(Collectors.toList());
	}

	@Override
	public Optional<CarrierEntity> findOne(UUID id) {
		// TODO Auto-generated method stub
		return carrierRepository.findById(id);
	}

	@Override
	public boolean isExists(UUID id) {
		// TODO Auto-generated method stub
		return carrierRepository.existsById(id);
	}

	@Override
	public CarrierEntity createCarrierUpdate(CarrierEntity _carrier) {
		// TODO Auto-generated method stub
		return carrierRepository.save(_carrier);
	}




	@Override
	public CarrierEntity partialUpdate(UUID id, CarrierEntity _carrier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UUID _id) {
		// TODO Auto-generated method stub
		carrierRepository.deleteById(_id);
	}

	@Override
	public CarrierEntity save(CarrierEntity carrierEntity) {
		// TODO Auto-generated method stub
		return null;
	}

}
