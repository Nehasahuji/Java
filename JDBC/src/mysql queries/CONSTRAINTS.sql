-- *****************************************************************CONSTRAINTS***************************************************************************
-- USED TO SPECIFY THE RULES THAT ALLOWS OR RESTRICT WHAT VALUES OR DATA WILL BE STORED 
-- *****************************************************************TYPES OF CONSTRAINS***************************************************************************
-- 1.COLUMN LEVEL => APPLIED ON SINGLE COLUMN
-- 2.TABLE LEVEL =>  APPLIED ON WHOLE TABLE


-- *****************************************************************COMONLY USED CONSTRAINS***************************************************************************
-- 1. NOT ALL => COLUMN  CANANOT HAVE NULL OR EMPTY VALUE
-- 2.UNIQUE =>VALUES INSERTED IN THE COLUMN MUST BE UNIQUE
-- 3. CHECK =>IT CONTROLES THE VALUES INSERTED IN A COLUMN
-- 4. DEFAULT => IF WE WILL NOT SPECIFY VALUE FOR ANY COLUMN IT WILL TAKE DEFAULT VALUE
-- 5. PRIMARY KEY => NOT NULL + UNIQUE (USED FOR UNIQUE IDENTIFICATION OF VALUE FOR ANY COLUMN ) 
-- 6. AUTO INCREMEMNT =>AUTOMATICALLY GENRATE A UNIQUE NUMBER WHENEVER INSERT A RECORD MOSTLY USED WITH THE PRIMARY KEY
-- 7.ENUM =>STRING OBJECT ,IT ALLOWS US TO VALUE CHOOSEN FROM A LUIST OF PERMITED VALUE IN COLUMN SPECIFICATION AT THE TIME OF CREATION
-- 8.INDEX => CREATE AND RETURN VALUES FROM TABLE VERY QUICKLY AND EASILY IT ASSIGNS ROW ID FOR EACH ROW
-- 9 .fOREIGN KEY =>USED TO LINK TWO TABLES THAT'S WHY IST IS ALSO CALLED REFRENCE KEY A FOREIGN KEY COLUMN MATCHES THE PRIMARY KEY COLUMN OF ANOTHER TABLE

-- *******************************************************************************************************************************************************************
-- 1 --NOT NULL

CREATE TABLE student
(
id INTEGER,
first_name VARCHAR(30) NOT NULL,
last_name VARCHAR(30),
city VARCHAR(35)
);

 INSERT INTO Student VALUES(1, 'Hanks', 'Peter', 'New York');  
 INSERT INTO Student VALUES(2, NULL, 'Amanda', 'Florida');  -- AS first_name CANANOT BE NULL  
 
 -- MODIFY TABLE ADD CONSTARINT NOT NULL TO LAST NAME 
 ALTER TABLE student 
 MODIFY 
 last_name VARCHAR(30) NOT NULL;
 
 INSERT INTO Student VALUES(3, 'DAMON', NULL, 'Florida');  -- AS LAST_name CANANOT BE NULL  
 
 -- ****************************************************************************
 -- 2. UNIQUE
 CREATE TABLE shirtbrands
 (
 id INTEGER,
 brand_name VARCHAR(40) UNIQUE,
 size FLOAT
 );

 INSERT INTO ShirtBrands(Id, brand_name, Size) VALUES(1, 'Raymond', 38), (2, 'Cantabil', 40);  -- DUPLICATE NAMES NOT ALLOWED AS brand-name HAS UNIQUE CONSTRAINTS  
 INSERT INTO ShirtBrands(Id, brand_name, Size) VALUES(1, 'Pantaloons', 38), (2, 'Cantabil', 40);  
 
 -- ALTER CONSTRAINTS 
 ALTER TABLE shirtbrands
 MODIFY id INTEGER UNIQUE;
 
INSERT INTO ShirtBrands(Id, brand_name, Size) VALUES(1, 'JOCKEY', 38);

-- ****************************************************************************
-- 3. CHECK
 
CREATE TABLE people
(
id INTEGER NOT NULL,
name VARCHAR(40) NOT NULL,
AGE INTEGER CHECK(AGE>=18)
);

INSERT INTO people(Id, Name, Age)   
VALUES (1,'Robert', 28), (2, 'Joseph', 35), (3, 'Peter', 40);  

INSERT INTO people(Id, Name, Age) VALUES (1,'Robert', 15); --  (DOES NOT ALLOW TO INSERT AS AGE IS SMALLER THAN 18)

-- CONSTRAINT IN ALTER 
ALTER TABLE people ADD CHECK(ID IN (1,2,3));

INSERT INTO people(Id, Name, Age) VALUES (4,'Robert', 25); -- DOES NOT ALLOW AS ID IS NOT 1,2,3

-- ****************************************************************************
 -- 4. DEFAULT
 
 CREATE TABLE persons
(
id INTEGER NOT NULL,
name VARCHAR(40) NOT NULL,
age INTEGER ,
city VARCHAR(50) DEFAULT 'new york'
);

 INSERT INTO Persons(Id, Name, Age, City)   
VALUES (1,'Robert', 15, 'Florida'),   
(2, 'Joseph', 35, 'California'),   
(3, 'Peter', 40, 'Alaska');  

 INSERT INTO Persons(Id, Name, Age) VALUES (1,'Brayan', 15);  
 
 SELECT * FROM persons;
 
 -- ****************************************************************************
-- 5. PRIMARY KEY

CREATE TABLE person
(
id INTEGER PRIMARY KEY,
name VARCHAR(40) NOT NULL,
age INTEGER ,
city VARCHAR(50)
);

INSERT INTO Person(Id, Name, Age, City)   
VALUES (1,'Robert', 15, 'Florida') ,   
(2, 'Joseph', 35, 'California'),   
(3, 'Peter', 40, 'Alaska');  
  
INSERT INTO Person(Id, Name, Age, City)   
VALUES (1,'Stephen', 15, 'Florida');  -- (THROWS EXCEPTION DUPLICATE PRIMARY KEY)

-- ALTER TABLE
CREATE TABLE worker
(
id INTEGER,
name VARCHAR(40) NOT NULL,
age INTEGER ,
company VARCHAR(50)
);

-- ADD CONSTRAINT PRIMARY KEY USING ALTER QUERY 
ALTER TABLE worker ADD CONSTRAINT  primary_id PRIMARY KEY(id);

INSERT INTO worker(Id, Name, Age, company)   
VALUES (1,'Robert', 15, 'IBM Florida') ,   
(2, 'Joseph', 35, 'ITC California'),   
(3, 'Peter', 40, 'CTZ Alaska');  
  
INSERT INTO worker(Id, Name, Age, company)   
VALUES (1,'Stephen', 15, ' CTZ Florida');  -- (THROWS EXCEPTION DUPLICATE PRIMARY KEY)

 -- ****************************************************************************
-- 6. AUTO INCREMENT

CREATE TABLE animal 
( Id INTEGER AUTO_INCREMENT,
  Name VARCHAR(50),
  PRIMARY KEY(Id)
  );
  
  
INSERT INTO animal (name) VALUES   
('Tiger'),('Dog'),('Penguin'),   
('Camel'),('Cat'),('Ostrich');

SELECT * FROM ANIMAL;

-- ****************************************************************************
-- 7. ENUM
CREATE TABLE Shirts
( Id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  Name VARCHAR(50),
  Size ENUM('small', 'medium', 'large', 'x-large')
  );
  
 INSERT INTO Shirts(id, name, size)     
VALUES (1,'t-shirt', 'medium'),     
(2, 'casual-shirt', 'small'),     
(3, 'formal-shirt', 'large');

INSERT INTO Shirts(id, name, size)       
VALUES  (4,'OFFICAL-shirt', 'NULL');  -- NOT ALLOW TO INSERT AS  VALUE IUS OUT OF THE RANGENB  

SELECT * FROM Shirts;


-- ****************************************************************************
-- 8.INDEX
CREATE INDEX name_idx ON shirts(name);
 SELECT * FROM Shirts USE INDEX(name_idx);  

-- ****************************************************************************
-- 9. FOREIGN KEY

CREATE TABLE labours
(
labour_id INTEGER NOT NULL PRIMARY KEY,
name VARCHAR(40),
age LONG,
recidential_city VARCHAR(100)
);

CREATE TABLE orders
(
order_id INT NOT NULL PRIMARY KEY,
oder_name VARCHAR(50),
person_id INTEGER,
FOREIGN KEY(person_id) REFERENCES labours(labour_id)
);

-- DROP FOREIGN KEY  
ALTER TABLE table_name DROP FOREIGN KEY fk_constraint_name;  









 

  
  

