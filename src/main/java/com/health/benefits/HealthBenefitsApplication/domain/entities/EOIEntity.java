package com.health.benefits.HealthBenefitsApplication.domain.entities;

import java.util.UUID;

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
				private UUID eoi_id;
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
				
				
				
				public UUID getEoi_id() {
					return eoi_id;
				}
				public EOD_Status getStatus() {
					return status;
				}
				public void setStatus(EOD_Status status) {
					this.status = status;
				}
				public void setEoi_id(UUID eoi_id) {
					this.eoi_id = eoi_id;
				}
				public HealthBenefitPlanEntity getPlan_id() {
					return plan_id;
				}
				public void setPlan_id(HealthBenefitPlanEntity plan_id) {
					this.plan_id = plan_id;
				}
				
				
}
