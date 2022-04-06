-- excercise
SELECT DISTINCT 
	vendor_name
FROM vendors 
JOIN invoices
	ON vendors.vendor_id=invoices.vendor_id;
    
-- using where clause
SELECT DISTINCT 
	v.vendor_name
FROM vendors v
WHERE v.vendor_id IN 
	(SELECT DISTINCT 
		i.vendor_id
	FROM invoices i)
ORDER BY v.vendor_name;