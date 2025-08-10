package com.health.benefits.HealthBenefitsApplication.services.impl;

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

}
