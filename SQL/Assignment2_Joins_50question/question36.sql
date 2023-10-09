-- 36.	Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 900.
USE sakila
SELECT * FROM customer
SELECT * FROM rental
SELECT * FROM inventory
SELECT * FROM film

SELECT title, rental_date FROM customer JOIN rental 
ON customer.customer_id = rental.customer_id JOIN inventory
ON inventory.inventory_id = rental.inventory_id JOIN film
ON inventory.film_id = film.film_id 
WHERE customer.customer_id=900