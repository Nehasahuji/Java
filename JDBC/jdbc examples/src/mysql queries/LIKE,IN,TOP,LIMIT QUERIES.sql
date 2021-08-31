-- ---------------------------------------------- LIKE -------------------------------------------------------------------- 
-- ---------------------------------------------- % WILDCARD --------------------------------------------------------------
SELECT * FROM product 
WHERE description 
LIKE 'learn%';

SELECT sku FROM 
product WHERE 
sku LIKE '%1000';

SELECT sku FROM
product WHERE 
sku LIKE '%tech%';

-- ---------------------------------------------- _ WILDCARD --------------------------------------------------------------
SELECT id FROM
product_category WHERE 
category_name LIKE 'bo_ks';

-- ---------------------------------------------- NOT OPERAND--------------------------------------------------------------

SELECT * FROM product 
WHERE description NOT
LIKE 'learn%';


-- ---------------------------------------------- IN OPERAND--------------------------------------------------------------
SELECT * FROM PRODUCT 
WHERE SKU IN (
'LUGGAGETAG-1024',
'COFFEEMUG-1000',
'COFFEEMUG-1001',
'COFFEEMUG-1000'
);

-- ---------------------------------------------- between condition -------------------------------------------------------
SELECT id, name 
FROM PRODUCT 
WHERE id 
BETWEEN 1 AND 5;

-- ---------------------------------------------- is null -----------------------------------------------------------------
SELECT * FROM 
product_category
WHERE 
category_name IS NULL;

-- ---------------------------------------------- is NOT null---------------------------------------------------------------
SELECT * FROM 
product_category
WHERE 
category_name IS NOT NULL;

-- ---------------------------------------------- TOP ----------------------------------------------------------------------
SELECT ID,NAME TOP  FROM PRODUCT; 

-- ---------------------------------------------- LIMIT ----------------------------------------------------------------------
SELECT ID,NAME TOP  FROM PRODUCT LIMIT 4; 





