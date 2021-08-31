-- -----------------------------------------------STORED PROCEDURES-----------------------------------------------------------

-- -----------------------------------------------CREATE PROCEDURES--------------------------------------------------------

-- PROCEDURE WITH NO PARAMETER

DELIMITER // 
CREATE PROCEDURE display_books()
BEGIN
SELECT * FROM book;
END ;//

-- CALL PROCEDURE 
CALL display_book(); 


-- PROCEDURE WITH INPUT(IN) PARAMETER

DELIMITER // 
CREATE PROCEDURE update_price(IN temp_isbn VARCHAR(30), IN new_price INTEGER)
BEGIN
SELECT * FROM BOOK WHERE isbn=temp_isbn;
UPDATE book SET price= price+new_price WHERE isbn=temp_isbn;
SELECT * FROM BOOK WHERE isbn=temp_isbn;
END;//

CALL update_price('001',600);

-- PROCEDURE WITH AN OUTPUT(OUT) PARAMETER
DELIMITER//
CREATE PROCEDURE dis_max(OUT highest_price INTEGER,OUT minimum_price integer)
BEGIN
SELECT MAX(price) INTO highest_price FROM BOOK;
SELECT MIN(price) INTO minimum_price FROM BOOK;
END;//

CALL dis_max(@max,@min);//
SELECT @max, @min;

 -- Procedure with IN-OUT parameter:
 
DELIMITER//
CREATE PROCEDURE display_gender(
INOUT male_female_gender INTEGER,
IN author_gender VARCHAR(30)
)
BEGIN

SELECT COUNT(gender) INTO male_female_gender
FROM AUTHOR 
WHERE  
author_gender=gender;

END;//

CALL display_gender(@M,"Male");
SELECT @M;
CALL display_gender(@F,"Female");
SELECT @F;


-- SHOW PROCEDURE
SHOW PROCEDURE STATUS WHERE DB="testdb"; 

-- DROP PROCEDURE
DROP PROCEDURE IF EXISTS DISPLAY_BOOK; 
 



 
