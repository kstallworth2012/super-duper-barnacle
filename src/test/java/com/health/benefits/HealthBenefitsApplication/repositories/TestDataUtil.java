package com.health.benefits.HealthBenefitsApplication.repositories;

import com.health.benefits.HealthBenefitsApplication.domain.entities.CarrierEntity;

public final class TestDataUtil {

	
	private TestDataUtil() {}
	
	public static CarrierEntity createTestCarrierEntityA() {
		 CarrierEntity carrier = CarrierEntity.builder()
				.name("hif5").build();
				return carrier;
	}
}
