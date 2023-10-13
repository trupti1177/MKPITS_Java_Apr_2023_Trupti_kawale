USE sakila

-- 93.	List the rental date and return date for all rentals made by customer "LAURA RODRIGUEZ".
SELECT * FROM customer
SELECT * FROM rental
SELECT * FROM inventory 
SELECT * FROM film

SELECT rental_date, return_date FROM customer JOIN rental ON
customer.customer_id = rental.customer_id JOIN inventory ON
inventory.inventory_id = inventory.inventory_id JOIN film ON
inventory.film_id = film.film_id WHERE first_name = "LAURA" AND last_name = "RODRIGUEZ"