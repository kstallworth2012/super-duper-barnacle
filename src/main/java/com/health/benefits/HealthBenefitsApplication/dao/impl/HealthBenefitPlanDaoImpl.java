package com.health.benefits.HealthBenefitsApplication.dao.impl;


import com.health.benefits.HealthBenefitsApplication.dao.HealthBenefitPlanDao;
import org.springframework.jdbc.core.JdbcTemplate;




public class HealthBenefitPlanDaoImpl implements HealthBenefitPlanDao{


					private JdbcTemplate jdbcTemplate;


					public HealthBenefitPlanDaoImpl(JdbcTemplate _jdbcTemplate){
						this.jdbcTemplate = _jdbcTemplate;

				}






}
