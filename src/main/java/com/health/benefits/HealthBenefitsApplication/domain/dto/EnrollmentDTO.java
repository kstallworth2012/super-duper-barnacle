package com.health.benefits.HealthBenefitsApplication.domain.dto;

import java.time.LocalDate;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;
import com.health.benefits.HealthBenefitsApplication.enums.CoverageLE;
import com.health.benefits.HealthBenefitsApplication.enums.EnrollmentStatus;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnrollmentDTO {

	
	
			
					private String enrollment_id;
					private EmployeeEntity linked_employee;
					private HealthBenefitPlanEntity plan_id;
				    @Enumerated(EnumType.STRING) 
				    private CoverageLE coverage; 
				    private String dependent;
				    private LocalDate enrollment_date;
				    @Enumerated(EnumType.STRING)
				    private EnrollmentStatus enrollment_status;
	
}
