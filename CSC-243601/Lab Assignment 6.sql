-- question 1
SELECT
	FORMAT(list_price, 1)
FROM Products;

SELECT
	CONVERT(list_price, UNSIGNED)
FROM Products;

SELECT
	CAST(list_price AS UNSIGNED)
FROM Products;

-- question 2
SELECT
	CAST(date_added AS DATE)
FROM products;

SELECT
	CAST(date_added AS DATE)
FROM products;

SELECT
	DATE_FORMAT(CAST(date_added AS DATE), '%m/%Y')
FROM products;

SELECT
	CAST(date_added AS TIME)
FROM products;