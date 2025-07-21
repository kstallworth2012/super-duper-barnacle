package com.health.benefits.HealthBenefitsApplication.domain.entities;



import com.health.benefits.HealthBenefitsApplication.domain.entities.DependentEntity;
import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.health.benefits.HealthBenefitsApplication.enums.CoverageLE;
import com.health.benefits.HealthBenefitsApplication.enums.NetworkType;
import com.health.benefits.HealthBenefitsApplication.enums.EnrollmentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnrollmentEntity{



				private String enrollment_id;
				private EmployeeEntity linked_employee;
				private HealthBenefitPlanEntity plan_id; 
				private CoverageLE coverage; 
				private DependentEntity dependent;
				private LocalDate enrollment_date;
				private EnrollmentStatus enrollment_status;
}