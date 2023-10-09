-- 43.	Get the film titles and rental dates for all rentals made on June 18, 2005.
SELECT * FROM film
SELECT * FROM inventory
SELECT * FROM rental

SELECT title, rental_date FROM film JOIN inventory
ON film.film_id = inventory.film_id JOIN rental
ON inventory.inventory_id = rental.inventory_id 
WHERE DATE(rental_date) = '2005-06-18'