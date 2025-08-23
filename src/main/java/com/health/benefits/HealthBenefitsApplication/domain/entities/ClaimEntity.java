package com.health.benefits.HealthBenefitsApplication.domain.entities;
/*
 * 
 * This entity is used to track and display claims submitted to the insurance provider, 
 * including status and payment information. 
 */

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "claims") 
public class ClaimEntity {

}
