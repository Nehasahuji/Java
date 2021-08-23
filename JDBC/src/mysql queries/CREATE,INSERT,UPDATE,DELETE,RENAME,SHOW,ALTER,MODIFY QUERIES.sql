-- --------------------------------------------------use database testdb -----------------------------------------------------
use testdb;

-- --------------------------------------------------create table ------------------------------------------------------------
CREATE TABLE EMPLOYEES(
id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(25) NOT NULL,
occupation VARCHAR(25) NOT NULL,
age INT,
PRIMARY KEY (id)
);

-- --------------------------------------------------SHOW TABLES----------------------------------------------------------------
SHOW TABLES;

-- --------------------------------------------------SHOW TABLES IN SPECIFIC SHEMA ---------------------------------------------
SHOW TABLES IN testdb;

-- --------------------------------------------------DESCRIPTION ABOUT WHICH TYPE OF TABLE Created----------------------------- 
DESCRIBE TABLE employees;

-- --------------------------------------------------DESCRIBE TABLE  FEATURES--------------------------------------------------
DESCRIBE employees;


-- --------------------------------------------------ALTER TABLE -------------------------------------------------------------- 

-- --------------------------------------------------alter TABLE ADD A COLUMN IN TABLE ----------------------------------------
ALTER TABLE employees ADD emp_group VARCHAR(30);
ALTER TABLE employees ADD dob DATE;

-- --------------------------------------------------MODIFY TABLE LENGTH ------------------------------------------------------
ALTER TABLE employees MODIFY OCCUPATION VARCHAR(50);

-- --------------------------------------------------DROP COLUMN --------------------------------------------------------------
ALTER TABLE employees DROP COLUMN emp_grop; 

-- --------------------------------------------------RENAME COLUMN ------------------------------------------------------------ 
ALTER TABLE employees CHANGE age emp_age INT;

-- --------------------------------------------------REANME TABLE -------------------------------------------------------------
ALTER TABLE employees RENAME TO employee_detail;
 
-- --------------------------------------------------INSERT QUERIES ------------------------------------------------------------
INSERT INTO employees (
 id,name,
 occupation,
 emp_age,
 emp_group)
 values (101,
 "neha",
 "software engineer",
 24,
 "developer"
 ); 
 
 -- --------------------------------------------------multiple records entry --------------------------------------------------   
 
 INSERT INTO employees (
 id,name,
 occupation,
 emp_age,
 emp_group)
 values (102,
 "megha",
 "electrical engineer",
 23,
 "engineer"
 ),(
 103,
 "neha sahu",
 "software developer",
 28,
 "engineer"
 );
 -- --------------------------------------------------partial records entry ----------------------------------------------------   
 INSERT INTO employees (
 id,
 name) 
 values(
 104,
 'astha'
 );
 
-- --------------------------------------------------insert date in the form of string -----------------------------------------
 INSERT INTO employees (
 id,
 name,dob) 
 values(
 105,
 'ayushi','1999-06-16'
 );
 
 -- --------------------------------------------------update queries------------------------------------------------------------ 
 UPDATE employees 
 SET emp_age='21'
 WHERE id='104';
 
 UPDATE employees 
 SET emp_age='21',
 occupation='student'
 WHERE id='104';
 
 UPDATE employees 
 SET emp_age='21',
 occupation='student',
 dob='1999-08-16',
 emp_group='student'
 WHERE id='104';
 
 -- --------------------------------------------------select statement ---------------------------------------------------------
 SELECT * FROM employees;
 
 SELECT * FROM employees
 WHERE DOB IS NOT NULL;
 
 -- FETCH FIRST THREE REORDS USED ALWAYS WITH THE ORDER BY 
 SELECT * FROM employees
 ORDER BY id LIMIT 3;
 
 -- FETCH SPECIFIC FIELDS
 SELECT id,name FROM employees ;
 
 
 
 
 -- ----------------------------------------------DELETE STATEMENT----------------------------------------------------------------------   
 DELETE FROM employees 
 WHERE id=105;
 
 -- --------------------------------------------truncate tABLE  ---- DELETE ONLY STRUCTURE NOT THE TABLE--------------------------------
 TRUNCATE TABLE employees;
 
 -- --------------------------------------------DELETE TABLE  -------- DELETE THE TABLE AlSO ------------------------------------------- 
 DROP TABLE EMPLOYEE;
 DROP TABLE product;
 DROP TABLE product_category;
 
 
  
 

 