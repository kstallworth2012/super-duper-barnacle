package com.health.benefits.HealthBenefitsApplication.domain.entities;

import com.health.benefits.HealthBenefitsApplication.domain.entities.Employee;
import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitsPlan;
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
				private Employee emp_id;
				private HealthBenefitPlan plan_id;
				private EOD_Status status;
				private String DocumentArr[];
}
