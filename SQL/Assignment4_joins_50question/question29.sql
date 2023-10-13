USE sakila

-- 79.	Get the film titles and rental dates for all rentals made on December 12, 2005.
SELECT * FROM customer
SELECT * FROM rental
SELECT * FROM inventory 
SELECT * FROM film 

SELECT title, rental_date FROM customer JOIN rental ON
customer.customer_id = rental.customer_id JOIN inventory ON
rental.inventory_id = inventory.inventory_id JOIN film ON
inventory.film_id = film.film_id WHERE DATE(rental_date) = "2005-12-12"