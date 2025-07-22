
DROP TABLE IF EXISTS "employee";
DROP TABLE IF EXISTS "healthbenefitplan";
DROP TABLE IF EXISTS "enrollment";
DROP TABLE IF EXISTS "dependent";
DROP TABLE IF EXISTS "eoi";
DROP TABLE IF EXISTS "payrolldeduction";
DROP TABLE IF EXISTS "carrier";

CREATE TABLE "employee"(
   employee_id text NOT NULL, 
   name text NOT NULL, 
   email text, 
   dateOfBirth text, 
   gender text, 
   jobStatus text, 
   hire_date date, 
   term_date date, 
   work_location text, 
   benefit_eligible boolean,
   CONSTRAINT "employee_pkey" PRIMARY KEY("employee_id")
);

CREATE TABLE "carrier"(

         carrier_id bigint NOT NULL,
         name TEXT NOT NULL,
         contact TEXT,
          edi_support boolean,
         api_endpoint text,
         CONSTRAINT "carrier_pkey" PRIMARY KEY("carrier_id")

);

CREATE TABLE "healthbenefitplan"(

   plan_id text NOT NULL, 
   plan_type text NOT NULL, 
   carrier_id bigint, 
   coverage text,
   effective_date date,
   end_date date, 
   premium_an decimal,
   employer_copay decimal, 
   network_type text,

CONSTRAINT "healthbenefitplan_pkey" PRIMARY KEY("plan_id"),
CONSTRAINT "fk_carrier" FOREIGN KEY("carrier_id")
REFERENCES  carrier(carrier_id)


);
CREATE TABLE "eoi"(

   eoi_id TEXT NOT NULL,
   emp_id TEXT NOT NULL,
   plan_id TEXT ,
   status TEXT ,
   documentArr TEXT ,
   CONSTRAINT "eoi_pkey" PRIMARY KEY("eoi_id"),
   CONSTRAINT "fk_healthbenefitplan1" FOREIGN KEY("plan_id") REFERENCES healthbenefitplan(plan_id),  
   CONSTRAINT "fk_employee1" FOREIGN KEY("emp_id") REFERENCES employee(employee_id)

);

CREATE TABLE "dependent"(
   dependent_id TEXT NOT NULL, 
   name TEXT, 
   relationship TEXT,
   date_of_birth DATE,
   gender TEXT,
   ssn TEXT,
   eligible boolean,
   CONSTRAINT "dependent_pkey" PRIMARY KEY("dependent_id")
);

CREATE TABLE "enrollment"(

   enrollment_id text NOT NULL, 
   linked_employee text,
   plan_id text, 
   coverage text, 
   dependent text, 
   enrollment_date date, 
   enrollment_status text, 
CONSTRAINT "enrollment_pkey" PRIMARY KEY("enrollment_id"),
CONSTRAINT "fk_employee" FOREIGN KEY("linked_employee") REFERENCES employee(employee_id),
CONSTRAINT "fk_dependent" FOREIGN KEY("dependent") REFERENCES dependent(dependent_id),
CONSTRAINT "fk_healthbenefitplan" FOREIGN KEY("plan_id") REFERENCES healthbenefitplan(plan_id)

);



CREATE TABLE "payrolldeduction"(
      deduction_id TEXT NOT NULL,
      emp_id TEXT,
      plan_id TEXT,
      deduction_amount DECIMAL,
      frequency INT,
      start_date DATE,
      end_date DATE, 
   CONSTRAINT "payrolldeduction_pkey" PRIMARY KEY("deduction_id"),
   CONSTRAINT "fk_healthbenefitplan2" FOREIGN KEY("plan_id") REFERENCES healthbenefitplan(plan_id),   
   CONSTRAINT "fk_employee2" FOREIGN KEY("emp_id") REFERENCES employee(employee_id)
);