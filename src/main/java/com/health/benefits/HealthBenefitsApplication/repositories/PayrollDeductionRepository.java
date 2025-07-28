package com.health.benefits.HealthBenefitsApplication.repositories;

import com.health.benefits.HealthBenefitsApplication.domain.entities.PayrollDeductionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PayrollDeductionRepository extends CrudRepository<PayrollDeductionEntity,String>{}