package com.health.benefits.HealthBenefitsApplication.domain.entities;



// import com.health.benefits.HealthBenefitsApplication.domain.entities.DependentEntity;
import com.health.benefits.HealthBenefitsApplication.domain.entities.EmployeeEntity;
import com.health.benefits.HealthBenefitsApplication.domain.entities.HealthBenefitPlanEntity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.CascadeType;
import com.health.benefits.HealthBenefitsApplication.enums.CoverageLE;
import com.health.benefits.HealthBenefitsApplication.enums.NetworkType;
import com.health.benefits.HealthBenefitsApplication.enums.EnrollmentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "enrollments")
public class EnrollmentEntity{


					@Id
					private String enrollment_id;
					@OneToOne(cascade = CascadeType.ALL)
					@JoinColumn
					private EmployeeEntity linked_employee;
				   	@OneToOne(cascade = CascadeType.ALL)
				  	@JoinColumn
					private HealthBenefitPlanEntity plan_id;
				    @Enumerated(EnumType.STRING) 
				    private CoverageLE coverage; 
				    private String dependent;
				    private LocalDate enrollment_date;
				    @Enumerated(EnumType.STRING)
				    private EnrollmentStatus enrollment_status;
}