package com.health.benefits.HealthBenefitsApplication.repositories;


import com.health.benefits.HealthBenefitsApplication.domain.entities.CarrierEntity;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CarrierRepository extends CrudRepository<CarrierEntity,UUID>{}