package com.health.benefits.HealthBenefitsApplication.services.impl;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EOIEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.EOIRepository;
import com.health.benefits.HealthBenefitsApplication.services.EOIService;

public class EOIServiceImpl implements EOIService {

	
	
	private EOIRepository eoiRepository;

	public EOIServiceImpl(EOIRepository eoiRepository) {
		super();
		this.eoiRepository = eoiRepository;
	}

	@Override
	public EOIEntity createEOI(EOIEntity _eoi) {
		// TODO Auto-generated method stub
		return null;
	}

}
