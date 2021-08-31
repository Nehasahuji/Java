-- ----------------------------------------------Aggregate function-------------------------------------------------------------
-- ----------------------------------------------count function-----------------------------------------------------------------
SELECT COUNT(ID) FROM PRODUCT ;
SELECT COUNT(*) FROM PRODUCT ;
SELECT COUNT(DISTINCT(name)) FROM PRODUCT;

SELECT category_name,
category_id,
COUNT(*)
FROM PRODUCT JOIN product_category 
ON product.category_id=product_category.id 
GROUP BY(category_id) 
HAVING COUNT(*)>=0 
ORDER BY(category_id) ;


-- ----------------------------------------------SUM---------------------------------------------------------------------------
SELECT SUM(id) FROM product_category;

SELECT category_name,
category_id,
SUM(unit_price) FROM product 
 JOIN product_category
 ON product.category_id=product_category.id 
 GROUP BY(category_id) 
 ORDER BY(unit_price);









