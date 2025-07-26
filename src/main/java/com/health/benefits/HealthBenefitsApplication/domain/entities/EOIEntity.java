package com.health.benefits.HealthBenefitsApplication.domain.entities;

import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;
import com.health.benefits.HealthBenefitsApplication.enums.EOD_Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

//EvidenceOfInsurability
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "eoi") 
public class EOIEntity{

				@Id
				private String eod_id;
				private EmployeeEntity emp_id;
				private HealthBenefitPlanEntity plan_id;
				private EOD_Status status;
				private String DocumentArr[];
}
