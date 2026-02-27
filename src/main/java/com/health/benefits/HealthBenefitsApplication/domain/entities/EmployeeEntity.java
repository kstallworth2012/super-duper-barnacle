package com.health.benefits.HealthBenefitsApplication.domain.entities;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import com.health.benefits.HealthBenefitsApplication.enums.CoverageLE;
import com.health.benefits.HealthBenefitsApplication.enums.NetworkType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "employees") 
public class EmployeeEntity{


			@Id
			private UUID emp_id;
			private String plan_id; 
			private String plan_type; 
			private String carrier; // should be Carrier entity
			@Enumerated(EnumType.STRING)
			private CoverageLE coverage;
			// private LocalDate effective_date;
			// private LocalDate end_date; 
			// private Double premium_an;
			// private Double employer_copay; 
			// @Enumerated(EnumType.STRING)
			// private NetworkType network_type;
			
			
			
			public String getPlan_id() {
				return plan_id;
			}
			public UUID getEmp_id() {
				return emp_id;
			}
			public void setEmp_id(UUID emp_id) {
				this.emp_id = emp_id;
			}
			public String getPlan_type() {
				return plan_type;
			}
			public void setPlan_type(String plan_type) {
				this.plan_type = plan_type;
			}
			public CoverageLE getCoverage() {
				return coverage;
			}
			public void setCoverage(CoverageLE coverage) {
				this.coverage = coverage;
			}
			public void setPlan_id(String plan_id) {
				this.plan_id = plan_id;
			}
			public String getCarrier() {
				return carrier;
			}
			public void setCarrier(String carrier) {
				this.carrier = carrier;
			}
			
			
			
			
			
			
			
}


