
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




CREATE TABLE "healthbenefitplan"(

   plan_id text NOT NULL, 
   plan_type text NOT NULL, 
   carrier text NOT NULL, 
   coverage text,
   effective_date date,
   end_date date, 
   premium_an decimal,
   employer_copay decimal, 
   network_type text,

CONSTRAINT healthbenefitplan_pkey PRIMARY KEY(plan_id)


);