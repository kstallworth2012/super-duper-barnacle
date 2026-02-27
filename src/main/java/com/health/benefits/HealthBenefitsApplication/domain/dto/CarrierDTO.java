package com.health.benefits.HealthBenefitsApplication.domain.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarrierDTO {
	
	private UUID carrier_id;
	private String name;
	private String contact;
	private Boolean edi_support;
	private String api_endpoint;
	
	
	
	public UUID getCarrier_id() {
		return carrier_id;
	}
	public void setCarrier_id(UUID carrier_id) {
		this.carrier_id = carrier_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Boolean getEdi_support() {
		return edi_support;
	}
	public void setEdi_support(Boolean edi_support) {
		this.edi_support = edi_support;
	}
	public String getApi_endpoint() {
		return api_endpoint;
	}
	public void setApi_endpoint(String api_endpoint) {
		this.api_endpoint = api_endpoint;
	}
	
	
	
	

}
