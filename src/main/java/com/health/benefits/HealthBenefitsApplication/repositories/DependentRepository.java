package com.health.benefits.HealthBenefitsApplication.repositories;

import com.health.benefits.HealthBenefitsApplication.domain.entities.DependentsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DependentRepository extends CrudRepository<DependentsEntity,String>{}