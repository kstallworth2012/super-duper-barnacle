package com.health.benefits.HealthBenefitsApplication.repositories;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EnrollmentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EnrollmentRepository extends CrudRepository<EnrollmentEntity,String>{}