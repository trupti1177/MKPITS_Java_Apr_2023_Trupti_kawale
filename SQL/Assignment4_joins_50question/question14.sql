USE sakila

-- 64.	Retrieve the rental date and return date for each rental made by customer "HELEN Harris".
SELECT * FROM customer
SELECT * FROM rental
SELECT * FROM inventory

SELECT rental_date, return_date FROM customer JOIN rental ON
customer.customer_id = rental.customer_id JOIN inventory ON
rental.inventory_id = inventory.inventory_id WHERE 
first_name = "HELEN" AND last_name = "Harris"