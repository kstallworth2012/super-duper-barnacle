package com.health.benefits.HealthBenefitsApplication.domain.entities;




import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "carrier") 
public class CarrierEntity{

		@Id
//		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carrier_id_seq")
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}