package com.health.benefits.HealthBenefitsApplication.repositories;

import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface HealthBenefitPlanRepository extends CrudRepository<HealthBenefitPlanEntity,String>{}