-- 47.	Get the first name, last name, and email of customers who have rented more than 12 films.
SELECT * FROM customer
SELECT * FROM rental
SELECT * FROM inventory
SELECT * FROM film

SELECT first_name, last_name, email FROM customer JOIN rental
ON rental.customer_id = customer.customer_id JOIN inventory
ON inventory.inventory_id = rental.inventory_id JOIN film
ON film.film_id = inventory.film_id
WHERE customer.first_name>12 and customer.last_name>12