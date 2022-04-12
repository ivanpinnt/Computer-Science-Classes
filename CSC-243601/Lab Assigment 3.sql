-- question 1
INSERT INTO categories
    (category_name)

VALUES 
	('Brass');
    
-- question 2
UPDATE categories
	SET category_name = 'Woodwinds'
		WHERE category_id = 5;
    
-- question 3
DELETE FROM categories
	WHERE category_id = 5;
    
-- question 4
INSERT INTO products
	(category_id,
    product_code,
    product_name,
    description,
    list_price,
    discount_percent,
    date_added)
    
VALUES
	(4,
    'dgx_640',
    'Yamaha DGX 640 88-Key Digital Piano',
    'Long description to come.',
    799.99,
    0,
    "2022-2-23 14:38:13");
    
-- question 5
UPDATE products
	SET discount_percent = 35
		WHERE product_id = 11;
        
-- question 6
DELETE FROM categories
	WHERE category_id = 4;
    
DELETE FROM products
	WHERE category_id =4;

-- question 7
INSERT INTO customers
	(email_address,
    password,
    first_name,
    last_name)
    
VALUES
	('rick@raven.com',
    '',
    'Rick',
    'Raven');
    
-- question 8
UPDATE customers
	SET password = 'secret'
		WHERE email_address = 'rick@raven.com';
        
-- question 9
UPDATE customers
	SET password = 'reset'
		LIMIT 100;
        
-- question 10 
-- i ran the script and reset the database
