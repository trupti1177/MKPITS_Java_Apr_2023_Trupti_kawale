-- 15. Retrieve the rental date and return date for each rental made by customer "Richard Davis".
SELECT * FROM inventory
SELECT * FROM rental
SELECT * FROM customer

SELECT rental_date, return_date FROM inventory LEFT JOIN rental
ON inventory.inventory_id = rental.inventory_id JOIN customer
ON rental.customer_id = customer.customer_id
WHERE first_name = 'Richard' and last_name = 'Davis'