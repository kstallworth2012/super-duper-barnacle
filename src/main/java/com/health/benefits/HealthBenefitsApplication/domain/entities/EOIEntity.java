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
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.CascadeType;

//EvidenceOfInsurability
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "eoi") 
public class EOIEntity{

				@Id
				private String eoi_id;
				@OneToOne(cascade = CascadeType.ALL)
				@JoinColumn
				private EmployeeEntity emp_id;
				@OneToOne(cascade = CascadeType.ALL)
				@JoinColumn
				private HealthBenefitPlanEntity plan_id;
				@Enumerated(EnumType.STRING)
				private EOD_Status status;
				private String DocumentArr;  //need a list of documents here 
				//is it this 
				// List<String> documents; 
}
