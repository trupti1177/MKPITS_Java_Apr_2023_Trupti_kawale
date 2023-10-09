USE sakila
SHOW TABLES

-- 1. Retrieve the names of all customers and the titles of the films they have rented.
SELECT * FROM customer
SELECT * FROM rental
SELECT * FROM inventory
SELECT * FROM film

SELECT first_name, last_name, title FROM customer JOIN rental 
ON customer.customer_id = rental.customer_id JOIN inventory 
ON rental.inventory_id = inventory.inventory_id JOIN film ON inventory.film_id = film.film_id