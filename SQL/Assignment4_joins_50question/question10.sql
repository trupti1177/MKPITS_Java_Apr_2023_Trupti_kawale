USE sakila

-- 60.	Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 400.
SELECT * FROM customer
SELECT * FROM rental
SELECT * FROM inventory
SELECT * FROM film

SELECT title, rental_date FROM customer JOIN rental ON
customer.customer_id = rental.customer_id JOIN inventory ON
rental.inventory_id = inventory.inventory_id JOIN film ON
inventory.film_id = film.film_id WHERE customer.customer_id = 400