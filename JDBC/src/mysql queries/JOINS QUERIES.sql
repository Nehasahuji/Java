-- --------------------------------------------------------- Joins -----------------------------------------------------------------------------

-- ---------------------------------------------------------INNER JOIN --------------------------------------------------------
-- --------------------------------RETURN THE RESULT FROM BOTH THE TABLES WHERE CONDITION IS SATISFIED------------------------- 

SELECT  *  FROM product 
INNER JOIN product_category 
ON 
product.id=product_category.id;

-- ---------------------------------------------LEFT JOIN----------------------------------------------------------------------
-- The LEFT OUTER JOIN returns all rows from the left hand table specified in the 
-- ON condition and only those rows from the other table where the join condition is fulfilled.  

SELECT product.id, product.name  ,product_category.category_name
FROM product 
LEFT JOIN product_category 
ON product.id=product_category.id;

-- ----------------------------------------------RIGHT JOIN ---------------------------------------------------------------------
-- The MySQL Right Outer Join returns all rows from the RIGHT-hand table specified 
-- in the ON condition and only those rows from the other table where he join condition is fulfilled.

SELECT product.id, product.name ,
product_category.category_name
FROM product RIGHT JOIN product_category 
ON product.id=product_category.id;


-- ---------------------------------------------CROSS JOIN ----------------------
SELECT * FROM product CROSS JOIN product_category GROUP BY category_id;


-- -------------------------------------------- SELF JOIN ------------------------------------------------------------
SELECT * FROM product AS p1 
INNER JOIN  product AS p2 
ON p1.id=p2.id;


 -- -------------------------------------NEED TO PERFORM ALIAS BEFORE APPLYING SELF JOIN---------------------------------------------
SELECT * FROM product
INNER JOIN  product
ON p1.id=p2.id;



-- --------------------------------------DELETE JOIN ----------------------------------------
use testdb;
DELETE product, product_category FROM 
product  LEFT JOIN 
product_category ON 
product.category_id=product_category.id
WHERE product.category_id=1;

-- ------------------------------------SELECT QUERY-------------------------------------
SELECT * FROM product WHERE product.category_id=1;
SELECT * FROM product_category;





