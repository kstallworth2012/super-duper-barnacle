package com.health.benefits.HealthBenefitsApplication.dao.impl;




import com.health.benefits.HealthBenefitsApplication.dao.DependentDao;
import org.springframework.jdbc.core.JdbcTemplate;


public class DependentDaoImpl implements DependentDao {

					private JdbcTemplate jdbcTemplate;

		public DependentDaoImpl(JdbcTemplate _jdbcTemplate){
						this.jdbcTemplate = _jdbcTemplate;

				}

}

