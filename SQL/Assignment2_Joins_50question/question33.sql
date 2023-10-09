-- 33.	List the rental date and return date for all rentals made by customer "Barbara Taylor".
SELECT * FROM customer
SELECT * FROM rental


SELECT rental_date, return_date FROM customer JOIN rental
ON customer.customer_id = rental.customer_id 
WHERE first_name = 'Barbara' and last_name = 'Taylor'