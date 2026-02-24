package com.health.benefits.HealthBenefitsApplication.repositories;

import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface HealthBenefitPlanRepository extends CrudRepository<HealthBenefitPlanEntity,UUID>{}