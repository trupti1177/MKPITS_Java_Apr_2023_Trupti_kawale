USE sakila
SHOW TABLES

-- 2. Determine the count of rentals for each customer.

SELECT * FROM rental
SELECT * FROM customer
SELECT customer.customer_id, first_name, last_name, COUNT(rental_id) as number_of_rentals
FROM rental join customer ON rental.customer_id=customer.customer_id
GROUP BY customer_id