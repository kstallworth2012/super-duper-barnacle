package com.health.benefits.HealthBenefitsApplication.domain.entities;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;
import com.health.benefits.HealthBenefitsApplication.enums.EOD_Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//EvidenceOfInsurability
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EOIEntity{


				private String eod_id;
				private EmployeeEntity emp_id;
				private HealthBenefitPlanEntity plan_id;
				private EOD_Status status;
				private String DocumentArr[];
}
