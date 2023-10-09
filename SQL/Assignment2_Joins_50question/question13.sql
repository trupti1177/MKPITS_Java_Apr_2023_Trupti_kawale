-- 13. Get the names of all customers who have rented more than 5 films.

SELECT * FROM customer
SELECT * FROM rental
SELECT * FROM inventory
SELECT * FROM film

SELECT first_name, last_name FROM customer JOIN rental
ON rental.customer_id = customer.customer_id JOIN inventory
ON inventory.inventory_id = rental.inventory_id JOIN film
ON film.film_id = inventory.film_id
WHERE customer.first_name>=5 and customer.last_name>=5