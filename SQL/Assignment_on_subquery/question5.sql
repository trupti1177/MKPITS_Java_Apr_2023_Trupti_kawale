-- 5. Find films with rental counts above average:
-- Retrieve films with rental counts greater than the average number of rentals across all films.
select * from film; -- film_id 
select * from inventory; -- film_id, inventory_id
select * from rental; -- inventory_id, customer_id

SELECT film_id, title, rental_count FROM
(SELECT film.film_id, film.title, COUNT(rental.rental_id) AS
rental_count FROM film JOIN inventory ON 
film.film_id = inventory.film_id JOIN rental on
inventory.inventory_id=rental.inventory_id GROUP BY film.film_id, film.title)
AS film_rental_counts 
WHERE rental_count > (SELECT AVG(rental_count) FROM 
(SELECT film.film_id, film.title, COUNT(rental.rental_id) AS rental_count
FROM film JOIN inventory on film.film_id = inventory.inventory_id 
JOIN rental on inventory.inventory_id = rental.inventory_id GROUP BY film.film_id) AS 
avg_rental_counts);