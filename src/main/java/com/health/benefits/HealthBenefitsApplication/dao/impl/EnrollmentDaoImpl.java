package com.health.benefits.HealthBenefitsApplication.dao.impl;



import com.health.benefits.HealthBenefitsApplication.dao.EnrollmentDao;
import org.springframework.jdbc.core.JdbcTemplate;




public class EnrollmentDaoImpl implements EnrollmentDao{


					private JdbcTemplate jdbcTemplate;
					public EnrollmentDaoImpl(JdbcTemplate _jdbcTemplate){
						this.jdbcTemplate = _jdbcTemplate;

				}

}
