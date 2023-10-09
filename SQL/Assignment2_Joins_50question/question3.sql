SHOW TABLES

-- 3. List the names of actors who have appeared in the film titled "Chamber Italian".
SELECT * FROM actor
SELECT * FROM film_actor
SELECT * FROM film

SELECT first_name, last_name FROM actor JOIN film_actor 
ON actor.actor_id = film_actor.actor_id JOIN film 
ON film_actor.film_id = film.film_id WHERE title = 'Chamber Italian'