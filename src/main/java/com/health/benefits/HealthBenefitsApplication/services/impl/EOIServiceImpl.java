package com.health.benefits.HealthBenefitsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
		return StreamSupport.stream(eoiRepository.findAll().spliterator(),false).collect(Collectors.toList());
	}

	@Override
	public Optional<EOIEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return eoiRepository.findById(id);
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return eoiRepository.existsById(id);
	}

}
