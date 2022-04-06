-- question 1
SELECT
	products.list_price,
    products.discount_percent,
    ROUND(products.list_price/products.discount_percent, 2) AS discount_amount
FROM
	products;
    
-- questions 2
SELECT
	orders.order_date,
    DATE_FORMAT(orders.order_date, "%Y"),
    DATE_FORMAT(orders.order_date, "%b-%d-%Y"),
    DATE_FORMAT(orders.order_date, "%r"),
    DATE_FORMAT(orders.order_date, "%c/%d/%y %k:%S")
FROM
	orders;
    
-- question 3
SELECT
	orders.card_number,
    LENGTH(orders.card_number),
    RIGHT(orders.card_number, 4) AS last_four_digits,
    CONCAT(IF(length(card_number)=15, 'XXXX-XXXX-XXXX-', 'XXXX-XXXX-XXXX-'), RIGHT (card_number,4)) AS formatted_number
FROM
	orders;
    
-- question 4
SELECT
	orders.order_id,
    orders.order_date,
    