-- 1)
SELECT COUNT(order_id) as order_count, SUM(tax_amount) AS tax_total
FROM orders;

-- 2)
SELECT category_name, COUNT(*) AS product_count,
       MAX(list_price) AS most_expensive_product
FROM categories c JOIN products p
  ON c.category_id = p.category_id
GROUP BY category_name
ORDER BY product_count DESC;

-- 3)
SELECT email_address, SUM(item_price * quantity) AS item_price_total, 
  SUM(discount_amount * quantity) AS discount_amount_total
FROM customers c
  JOIN orders o ON c.customer_id = o.customer_id
  JOIN order_items oi ON o.order_id = oi.order_id
GROUP BY email_address
ORDER BY item_price_total DESC;

-- 4)
SELECT email_address, COUNT(o.order_id) AS order_count, 
  SUM((item_price - discount_amount) * quantity) AS order_total
FROM customers c
  JOIN orders o ON c.customer_id = o.customer_id
  JOIN order_items oi ON o.order_id = oi.order_id
GROUP BY email_address
HAVING order_count > 1
ORDER BY order_total DESC;

-- 5)
SELECT email_address, COUNT(o.order_id) AS order_count, 
  SUM((item_price - discount_amount) * quantity) AS order_total
FROM customers c
  JOIN orders o ON c.customer_id = o.customer_id
  JOIN order_items oi ON o.order_id = oi.order_id
WHERE item_price > 400 
GROUP BY email_address
HAVING order_count > 1
ORDER BY order_total DESC;

-- 6)
SELECT product_name, SUM((item_price - discount_amount) * quantity) AS product_total
FROM products p
  JOIN order_items oi ON p.product_id = oi.product_id
GROUP BY product_name WITH ROLLUP;

-- 7)
SELECT email_address, 
       COUNT(DISTINCT oi.product_id) AS number_of_products
FROM customers c
  JOIN orders o ON c.customer_id = o.customer_id
  JOIN order_items oi ON o.order_id = oi.order_id
GROUP BY email_address
HAVING number_of_products > 1
ORDER BY email_address;

-- 8)
SELECT IF(GROUPING(category_name)=1, 'Grand Total', category_name) AS category_name, 
	   IF(GROUPING(product_name)=1, 'Category Total', product_name) AS product_name, 
       SUM(quantity) AS qty_purchased
FROM categories c JOIN products p
  ON c.category_id = p.category_id JOIN order_items oi 
  ON p.product_id=oi.product_id
GROUP BY category_name, product_name WITH ROLLUP;

-- 9)
SELECT order_id, (item_price - discount_amount) * quantity AS item_amount,
    SUM((item_price - discount_amount) * quantity) OVER(PARTITION BY order_id) AS order_amount 
FROM order_items
ORDER BY order_id;

-- 10)
SELECT order_id, (item_price - discount_amount) * quantity AS item_amount,
    SUM((item_price - discount_amount) * quantity) OVER(o_window ORDER BY (item_price - discount_amount) * quantity) AS order_amount, 
    ROUND(AVG((item_price - discount_amount) * quantity) OVER(o_window), 2) AS avg_order_amount
FROM order_items
WINDOW o_window AS (PARTITION BY order_id)
ORDER BY order_id;

-- 11)
SELECT customer_id, order_date, (item_price - discount_amount) * quantity AS item_total,
       SUM((item_price - discount_amount) * quantity) OVER(PARTITION BY customer_id) AS customer_total,
       SUM((item_price - discount_amount) * quantity) OVER(PARTITION BY customer_id ORDER BY order_date
           RANGE BETWEEN UNBOUNDED PRECEDING AND CURRENT ROW)
               AS customer_total_by_date
FROM orders JOIN order_items ON orders.order_id = order_items.order_id;