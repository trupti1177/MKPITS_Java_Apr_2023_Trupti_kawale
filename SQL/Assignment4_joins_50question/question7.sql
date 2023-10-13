USE sakila

-- 57.	List the rental date and return date for all rentals made by customer "MELISSA KING".
SELECT * FROM rental 
SELECT * FROM customer

SELECT rental_date, return_date FROM rental JOIN customer ON
rental.customer_id = customer.customer_id WHERE first_name = "MELISSA" AND last_name = "KING"