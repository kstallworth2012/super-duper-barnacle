package com.health.benefits.HealthBenefitsApplication.domain.entities;



import com.health.benefits.HealthBenefitsApplication.domain.entities.Dependent;
import com.health.benefits.HealthBenefitsApplication.domain.entities.Employee;
import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitsPlan;
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
				private Employee linked_employee;
				private HealthBenefitPlan plan_id; 
				private CoverageLE coverage; 
				private Dependent dependent;
				private LocalDate enrollment_date;
				private EnrollmentStatus enrollment_status;
}