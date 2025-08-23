package com.health.benefits.HealthBenefitsApplication.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//This entity represents the available choices for 
//employees during enrollment, 
//linking a BenefitPlan with its specific costs.


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "enrollmentOptions") 
public class EnrollmentOptionEntity {

}
