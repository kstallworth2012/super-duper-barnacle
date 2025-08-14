package com.health.benefits.HealthBenefitsApplication.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.health.benefits.HealthBenefitsApplication.domain.entities.DependentsEntity;
import com.health.benefits.HealthBenefitsApplication.repositories.DependentRepository;
import com.health.benefits.HealthBenefitsApplication.services.DependentsService;

public class DependentsServiceImpl implements DependentsService {

	
	private DependentRepository dependentsRepository;

	public DependentsServiceImpl(DependentRepository _dependentsRepository) {
		super();
		this.dependentsRepository = _dependentsRepository;
	}

	@Override
	public DependentsEntity createDependent(DependentsEntity _dependents) {
		// TODO Auto-generated method stub
		return dependentsRepository.save(_dependents);
	}

	@Override
	public List<DependentsEntity> findAll() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(dependentsRepository.findAll().spliterator(),false).collect(Collectors.toList());
	}

	@Override
	public Optional<DependentsEntity> findOne(String id) {
		// TODO Auto-generated method stub
		return dependentsRepository.findById(id);
	}

	@Override
	public boolean isExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
