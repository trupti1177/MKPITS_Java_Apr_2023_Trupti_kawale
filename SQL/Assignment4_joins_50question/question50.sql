USE sakila

-- 100.	Retrieve the rental date and return date for each rental made by customer "MARIE TURNER".
SELECT * FROM customer
SELECT * FROM rental
SELECT * FROM inventory 
SELECT * FROM film

SELECT rental_date, return_date FROM customer JOIN rental ON
customer.customer_id = rental.customer_id JOIN inventory ON
inventory.inventory_id = inventory.inventory_id JOIN film ON
inventory.film_id = film.film_id WHERE first_name = "MARIE" AND last_name = "TURNER"