package com.health.benefits.HealthBenefitsApplication.dao.impl;



import com.health.benefits.HealthBenefitsApplication.dao.PayrollDeductionDao;
import org.springframework.jdbc.core.JdbcTemplate;


public class PayrollDeductionDaoImpl implements PayrollDeductionDao{

private JdbcTemplate jdbcTemplate;


public PayrollDeductionDaoImpl(JdbcTemplate _jdbcTemplate){
	this.jdbcTemplate = _jdbcTemplate;
	}


}

