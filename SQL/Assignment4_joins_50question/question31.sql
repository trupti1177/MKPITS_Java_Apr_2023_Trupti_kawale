USE sakila

-- 81.	List the rental date and return date for all rentals made by customer "KENNETH GOODEN".
SELECT * FROM customer
SELECT * FROM rental
SELECT * FROM inventory 
SELECT * FROM film 

SELECT rental_date, return_date FROM customer JOIN rental ON
customer.customer_id = rental.customer_id JOIN inventory ON
inventory.inventory_id = inventory.inventory_id JOIN film ON
inventory.film_id = film.film_id WHERE first_name = "KENNETH" AND last_name = "GOODEN"