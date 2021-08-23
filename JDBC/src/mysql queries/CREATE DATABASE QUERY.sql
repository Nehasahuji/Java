-- sql queries

-- 1.create database
CREATE DATABASE IF NOT EXISTS testdb;

-- 2.show databse details
SHOW CREATE DATABASE testdb; 

-- 3. show all databasees
SHOW DATABASES;  

-- 4.use database 
USE testdb; 

-- 5.drop database
DROP DATABASE IF EXISTS test; 


-- 6. copy one database to other
              -- * create database
              CREATE DATABASE IF NOT EXISTS Testdb_backup;
			  -- * Run above command of show databases
              -- * copy the databse to the path
			  -- * create a table to copy 
              CREATE TABLE employee (id int );
              -- * copy database data to the backup file using cmd going to the path C:\Windows\System32\cmd.exe
              --   mysqldump -u root -p testdb > D:\Database_backup\testdb.sql
              -- * copy data from file to the database again
              -- mysql -u root -p testdb_copy < D:\Database_backup\testdb.sql  
			  -- data will gets copy to the new database
              
               
             




