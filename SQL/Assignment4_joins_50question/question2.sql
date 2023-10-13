USE sakila

-- 52.	Retrieve the rental date and return date for each rental made by customer "Laura Martinez".
SELECT * FROM customer
SELECT * FROM rental

SELECT rental_date, return_date FROM customer JOIN rental ON
customer.customer_id = rental.customer_id WHERE first_name="Laura" and last_name = "Martinez"