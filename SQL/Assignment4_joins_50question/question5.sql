USE sakila

-- 55.	Get the film titles and rental dates for all rentals made on September 26, 2005.
SELECT * FROM rental 
SELECT * FROM inventory
SELECT * FROM film

SELECT title, rental_date FROM rental JOIN inventory ON
rental.inventory_id = inventory.inventory_id JOIN film ON
inventory.film_id = film.film_id WHERE DATE(rental_date) = '2005-05-26'