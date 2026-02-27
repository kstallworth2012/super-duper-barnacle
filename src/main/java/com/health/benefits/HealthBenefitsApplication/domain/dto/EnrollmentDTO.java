package com.health.benefits.HealthBenefitsApplication.domain.dto;

import java.time.LocalDate;
import java.util.UUID;

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

	
	
			
					private UUID enrollment_id;
					private EmployeeEntity linked_employee;
					private HealthBenefitPlanEntity plan_id;
				    @Enumerated(EnumType.STRING) 
				    private CoverageLE coverage; 
				    private String dependent;
				    private LocalDate enrollment_date;
				    @Enumerated(EnumType.STRING)
				    private EnrollmentStatus enrollment_status;
					public UUID getEnrollment_id() {
						return enrollment_id;
					}
					public void setEnrollment_id(UUID enrollment_id) {
						this.enrollment_id = enrollment_id;
					}
					public EmployeeEntity getLinked_employee() {
						return linked_employee;
					}
					public void setLinked_employee(EmployeeEntity linked_employee) {
						this.linked_employee = linked_employee;
					}
					public HealthBenefitPlanEntity getPlan_id() {
						return plan_id;
					}
					public void setPlan_id(HealthBenefitPlanEntity plan_id) {
						this.plan_id = plan_id;
					}
					public CoverageLE getCoverage() {
						return coverage;
					}
					public void setCoverage(CoverageLE coverage) {
						this.coverage = coverage;
					}
					public String getDependent() {
						return dependent;
					}
					public void setDependent(String dependent) {
						this.dependent = dependent;
					}
					public LocalDate getEnrollment_date() {
						return enrollment_date;
					}
					public void setEnrollment_date(LocalDate enrollment_date) {
						this.enrollment_date = enrollment_date;
					}
					public EnrollmentStatus getEnrollment_status() {
						return enrollment_status;
					}
					public void setEnrollment_status(EnrollmentStatus enrollment_status) {
						this.enrollment_status = enrollment_status;
					}
				    
				    
				    
	
}
