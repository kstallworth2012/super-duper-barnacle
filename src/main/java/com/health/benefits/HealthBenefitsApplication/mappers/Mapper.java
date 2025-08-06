package com.health.benefits.HealthBenefitsApplication.mappers;

public interface Mapper<A, B> {

	
	
	B mapTo(A a);
	
	A mapFrom(B b);
	
}
