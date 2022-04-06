-- question 1
SELECT 
	c.category_name
FROM categories c 
WHERE c.category_id IN 
	(SELECT DISTINCT 
		p.category_id
	FROM products p)
ORDER BY category_name;
    
-- question 2
SELECT 
	product_name,
    list_price
FROM products
WHERE list_price > (SELECT AVG(list_price) FROM products);

-- question 3
SELECT 
	c.category_name
FROM categories c 
WHERE NOT EXISTS
	(SELECT 
		c.category_name
	FROM products p
	WHERE c.category_id=p.category_id);
    
-- question 4
SELECT
	c.email_address,
    oi.order_id,
    (oi.item_price - oi.discount_amount) * oi.quantity AS order_total
FROM customers c
JOIN orders o
	ON o.customer_id=c.customer_id
JOIN order_items oi
	ON oi.order_id=o.order_id;
	
SELECT
	c.email_address,
    (oi.item_price - oi.discount_amount) * oi.quantity AS order_total
FROM customers c
JOIN orders o
	ON o.customer_id=c.customer_id
JOIN order_items oi
	ON oi.order_id=o.order_id
ORDER BY order_total DESC;

-- question 5
SELECT DISTINCT
	p.product_name,
    p.dicount_percent
FROM products p; -- LIMIT 0, 1000

SELECT
	p.product_name,
    (SELECT DISTINCT p.discount_percent FROM products) AS dicountPercent
FROM products p; -- its taking out most duplicates except for 30

-- question 6
SELECT DISTINCT
	c.email_address,
    oi.order_id,
    o.order_date
FROM customers c
JOIN orders o
	ON o.customer_id=c.customer_id
JOIN order_items oi
	ON oi.order_id=o.order_id
WHERE o.order_date =
	(SELECT MIN(order_date)
    FROM orders
    WHERE order_id=oi.order_id)
ORDER BY o.order_date, oi.order_id ASC;
	

-- using where clause
SELECT DISTINCT 
	v.vendor_name
FROM vendors v
WHERE v.vendor_id IN 
	(SELECT DISTINCT 
		i.vendor_id
	FROM invoices i)
ORDER BY v.vendor_name;