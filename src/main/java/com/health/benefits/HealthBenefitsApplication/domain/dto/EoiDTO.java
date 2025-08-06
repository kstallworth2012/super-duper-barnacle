package com.health.benefits.HealthBenefitsApplication.domain.dto;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;
import com.health.benefits.HealthBenefitsApplication.enums.EOD_Status;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EoiDTO {

	
	
	
	private String eod_id;
	private EmployeeEntity emp_id;
	private HealthBenefitPlanEntity plan_id;
	private EOD_Status status;
	private String DocumentArr;
}
