SHOW TABLES

-- 7. Display the film titles and rental durations for all rentals made on May 15, 2005.
SELECT * FROM film
SELECT * FROM inventory
SELECT * FROM rental

SELECT title, rental_duration FROM film JOIN inventory
ON film.film_id = inventory.film_id JOIN rental
ON inventory.inventory_id = rental.inventory_id 
WHERE DATE(rental_date) = '2005-05-15'