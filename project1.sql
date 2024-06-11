show databases

use practice

desc Employee;

Alter table Employee Drop Employee_Father_Name;

desc Employee;

CREATE TABLE emp (
  emp_name VARCHAR(50),
  emp_salary DECIMAL(10,2)
);

CREATE TABLE emp (
  emp_name VARCHAR(50),
  emp_salary DECIMAL(10,2)
);
INSERT INTO emp (emp_name, emp_salary) VALUES
('Shubham Thakur', 50000.00),
('Aman Chopra', 60000.50),
('Naveen Tulasi', 75000.75),
('Bhavika uppala', 45000.25),
('Nishant jain', 80000.00);

select emp_salary from emp
ORDER By emp_salary Desc
LIMIT 4,1
;