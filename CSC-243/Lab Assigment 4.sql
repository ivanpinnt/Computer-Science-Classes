-- question 1
SELECT COUNT(order_id)
FROM orders;

SELECT SUM(tax_amount)
FROM orders;

-- question 2
SELECT 
	c.category_name,
    COUNT(p.product_id) AS product_count,
    MAX(p.list_price) AS max_list_price 
FROM categories c
LEFT JOIN products p
	ON c.category_id=p.category_id
GROUP BY c.category_name;

-- question 3
SELECT
	c.email_address,
    sum(oi.item_price * oi.quantity) AS item_price_sum,
    sum(oi.discount_amount * oi.quantity) AS discount_amount_total
FROM customers c
LEFT JOIN orders o
	ON c.customer_id=o.customer_id
LEFT JOIN order_items oi
	ON oi.order_id=o.order_id
    GROUP BY c.email_address
    ORDER BY item_price_sum DESC;
    
    
-- question 4
WITH 
step_1 AS (
SELECT 
	c.email_address,
    -- COUNT(o.order_id) AS final_count_order_id,
    (oi.item_price - oi.discount_amount) * oi.quantity AS total_amount
FROM customers c
LEFT JOIN orders o
	ON c.customer_id=o.customer_id
LEFT JOIN order_items oi
	ON oi.order_id=o.order_id
)
, step_2 AS (
SELECT 
    c.email_address,
    COUNT(o.order_id) AS final_count_order_id
    
    -- (oi.item_price - oi.discount_amount) * oi.quantity AS total_amount
FROM customers c
LEFT JOIN orders o
	ON c.customer_id=o.customer_id
LEFT JOIN order_items oi
	ON oi.order_id=o.order_id
    GROUP BY c.email_address
)
SELECT
	s1.email_address,
    s2.final_count_order_id,
    s1.total_amount
FROM step_1 s1
JOIN step_2 s2
	ON s1.email_address=s2.email_address
    HAVING final_count_order_id > 1
    ORDER BY total_amount DESC;
    
-- question 5
WITH 
step_1 AS (
SELECT 
	c.email_address,
    -- COUNT(o.order_id) AS final_count_order_id,
    (oi.item_price - oi.discount_amount) * oi.quantity AS total_amount
FROM customers c
LEFT JOIN orders o
	ON c.customer_id=o.customer_id
LEFT JOIN order_items oi
	ON oi.order_id=o.order_id
    WHERE oi.item_price > 400
)
, step_2 AS (
SELECT 
    c.email_address,
    COUNT(o.order_id) AS final_count_order_id
    
    -- (oi.item_price - oi.discount_amount) * oi.quantity AS total_amount
FROM customers c
LEFT JOIN orders o
	ON c.customer_id=o.customer_id
LEFT JOIN order_items oi
	ON oi.order_id=o.order_id
    GROUP BY c.email_address
)
SELECT
	s1.email_address,
    s2.final_count_order_id,
    s1.total_amount
FROM step_1 s1
JOIN step_2 s2
	ON s1.email_address=s2.email_address;

-- question 6
SELECT 
	p.product_name,
    (oi.item_price - oi.discount_amount) * oi.quantity AS total_amount
FROM products p
LEFT JOIN order_items oi
	ON oi.product_id=p.product_id
    GROUP BY p.product_name WITH ROLLUP;
    
-- queston 7
SELECT
	c.email_address,
    COUNT(c.customer_id) AS distinct_product
FROM customers c
GROUP BY c.email_address
ORDER BY c.email_address ASC;

-- question 8
SELECT 
	IF(GROUPING(c.category_name)=1,'Category name', c.category_name) AS Category, 
	IF(GROUPING(p.product_name)=1, 'All Employees', p.product_name) AS Employees, 
    SUM(oi.quantity) AS total
    FROM categories c
    LEFT JOIN products p
		ON p.category_id=c.category_id
	LEFT JOIN order_items oi
		ON oi.product_id=p.product_id
    GROUP BY c.category_name,p.product_name WITH ROLLUP;
    
-- question 9
SELECT
	oi.order_id,
    (oi.item_price - oi.discount_amount) * oi.quantity AS item_amount,
    sum((oi.item_price - oi.discount_amount) * oi.quantity) OVER(PARTITION BY order_id) total_amount
FROM order_items oi
-- GROUP BY oi.order_id
ORDER BY oi.order_id ASC;

-- question 10
WITH
step_1 AS (
SELECT
	oi.order_id,
    (oi.item_price - oi.discount_amount) * oi.quantity AS total_amount
    -- sum(total_amount) OVER() AS sum_total,
    -- sum(total_amount) OVER(PARTITION BY oi,order_id) AS order_total
FROM order_items oi
)
, step_2 AS (
SELECT
	oi.order_id,
    -- (oi.item_price - oi.discount_amount) * oi.quantity AS total_amount,
    sum(total_amount) OVER() AS sum_total,
    sum(total_amount) OVER(PARTITION BY oi,order_id) AS order_total
FROM order_items oi
)

SELECT 
	sum_total,
    order_total
FROM step_1 s1
JOIN step_2 s2
	ON s1.order_id=s2.order_id;

-- question 11
SELECT 
	o.customer_id,
    o.order_date,
    oi.order_id,
    c.customer_id,
    sum(oi.order_id) OVER () AS total_orders,
    sum(oi.order_id) OVER (PARTITION BY c.customer_id) AS total_customer_items
FROM orders o
LEFT JOIN order_items oi
	ON oi.order_id=o.order_id
LEFT JOIN customers c
	ON c.customer_id=o.customer_id;
    