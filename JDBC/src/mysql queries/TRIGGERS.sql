-- ***************************************************************** TRIGGERS***************************************************************************
-- *****************************************************************CREATE TRIGGER ***************************************************************
 
 
 -- ---------------------------------------------------------------- SYNTAX -------------------------------------------------------------------
 CREATE TRIGGER trigger_name -- trigger_time trigger_event  
-- ON table_name FOR EACH ROW  
-- BEGIN  
    -- variable declarations  
    -- trigger code  
-- END;  
 
 -- **************************************************************BEFORE INSERT TRIGGER************************************************************
 
 DELIMITER //
 CREATE TRIGGER before_insert_emp_working_hours
 BEFORE INSERT ON employee FOR EACH ROW
 BEGIN
 IF 
 NEW.working_hours<0
 THEN SET NEW.working_hours=0;
 END IF;
 END//
 
 INSERT INTO employee(
 name,
 occupation,
 working_hours,
 working_date,
 salary
 )
 VALUES(
 'Markus',
 'Former',
 14,
 '2020-10-08',
 20000
 );
 
 INSERT INTO employee(
 name,
 occupation,
 working_hours,
 working_date,
 salary
 )
 VALUES(
 'Markus',
 'Former',
 -16,
 '2020-10-08',
 20000
 );
 
 SELECT * FROM employee;
 -- **************************************************************SHOW ALL TRIGGER*******************************************************************
 SHOW TRIGGERS; 
 
SHOW TRIGGERS 
WHERE EVENT IN('DELETE');

-- **************************************************************DROP TRIGGER IF EXSIT*******************************************************************
 
 DROP TRIGGER IF EXISTS before_insert_emp_working_hours;
-- **************************************************************INSERT AFTER TRIGGER*******************************************************************
 DELIMITER //  
 CREATE TRIGGER insert_student_details
 AFTER INSERT ON student_info 
 FOR EACH ROW
 BEGIN 
 INSERT INTO student_detail 
 VALUES(NEW.stud_id,NEW.stud_code,NEW.stud_name,
 NEW.stud_name,NEW.marks,NEW.phone,CURTIME());
 END;//
  
INSERT INTO student_info VALUES   
(2, 110, 'Alexandar', 'Biology', 67, '2347346438'); 

-- **************************************************************CREATE TRIGGER BEFOR UPDATE****************************************************************** 
DELIMITER //  
CREATE TRIGGER befor_update_sales_info
BEFORE UPDATE
 ON sales_info FOR EACH ROW
BEGIN
    DECLARE err_msg VARCHAR(255);
    SET err_msg=("The new quantity cannot be greater than 2 times the current quantity");
    IF NEW.quantity > OLD.quantity *2
    THEN
    SIGNAL SQLSTATE '45000'
    SET MESSAGE_TEXT=err_msg;
    END IF;
END; //

SELECT * FROM SALES_info;

 UPDATE sales_info SET quantity = 125 WHERE id = 2;   
 UPDATE sales_info SET quantity = 600 WHERE id = 2; 

-- **************************************************************AFTER UPDATE TRIGGER****************************************************************** 

 DELIMITER //
 CREATE TRIGGER after_update_student_info
 AFTER UPDATE ON students 
 FOR EACH ROW
   BEGIN
   INSERT into students_log VALUES (user(),   
    CONCAT('Update Student Record ', OLD.name, ' Previous Class :',  
    OLD.class, ' Present Class ', NEW.class)); 
END;//


UPDATE students SET class = class + 1; 
-- **************************************************************CREATE TRIGGER BEFOR DELETE******************************************************************
 
DELIMITER //
CREATE TRIGGER before_delete_salaries
BEFORE DELETE 
ON salaries FOR EACH ROW
BEGIN
   INSERT INTO salary_archives(emp_num, valid_from, amount)  
    VALUES(OLD.emp_num, OLD.valid_from, OLD.amount);  
END;//

DELETE FROM salaries WHERE emp_num = 105; 

SELECT * FROM salary_archives;

-- **************************************************************AFTER DELETE TRIGGER*****************************************************************

DELIMITER //
CREATE TRIGGER after_delete_salaries
AFTER DELETE ON salaries
FOR EACH ROW
BEGIN
  UPDATE total_salary_budget SET total_budget = total_budget - old.amount;  
END;//


DELETE FROM salaries WHERE emp_num = 103;  
 
SELECT * FROM total_salary_budget;  


