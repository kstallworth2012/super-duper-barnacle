package com.health.benefits.HealthBenefitsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
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
	public Optional<EOIEntity> findOne(UUID id) {
		// TODO Auto-generated method stub
		return eoiRepository.findById(id);
	}

	@Override
	public boolean isExists(UUID id) {
		// TODO Auto-generated method stub
		return eoiRepository.existsById(id);
	}

	@Override
	public EOIEntity save(EOIEntity _eoi) {
		// TODO Auto-generated method stub
		return eoiRepository.save(_eoi);
	}

	@Override
	public EOIEntity partialUpdate(UUID eoi_id, EOIEntity _eoi) {
		// TODO Auto-generated method stub
		_eoi.getEoi_id();
		
		return eoiRepository.findById(eoi_id).map(existingEOI -> {
			
			Optional.ofNullable(_eoi.getStatus()).ifPresent(existingEOI::setStatus);
			return eoiRepository.save(existingEOI);
		}).orElseThrow(() -> new RuntimeException("EOI is not there!"));
		
	
	}

	@Override
	public void delete(UUID id) {
		// TODO Auto-generated method stub
		eoiRepository.deleteById(id);
	}

}
