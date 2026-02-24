package com.health.benefits.HealthBenefitsApplication.repositories;


import com.health.benefits.HealthBenefitsApplication.domain.entities.EOIEntity;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EOIRepository extends CrudRepository<EOIEntity,UUID>{}