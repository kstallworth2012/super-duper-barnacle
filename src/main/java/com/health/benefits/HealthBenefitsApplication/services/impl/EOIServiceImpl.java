package com.health.benefits.HealthBenefitsApplication.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EOIEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.EOIRepository;
import com.health.benefits.HealthBenefitsApplication.services.EOIService;


@Service
public class EOIServiceImpl implements EOIService {

	
	
	private EOIRepository eoiRepository;

	public EOIServiceImpl(EOIRepository eoiRepository) {
		super();
		this.eoiRepository = eoiRepository;
	}

	@Override
	public EOIEntity createEOI(EOIEntity _eoi) {
		// TODO Auto-generated method stub
		return eoiRepository.save(_eoi);
	}

	@Override
	public List<EOIEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<EOIEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
