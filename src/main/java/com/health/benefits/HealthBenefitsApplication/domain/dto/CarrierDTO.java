package com.health.benefits.HealthBenefitsApplication.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarrierDTO {
	
	private String carrier_id;
	private String name;
	private String contact;
	private Boolean edi_support;
	private String api_endpoint;

}
