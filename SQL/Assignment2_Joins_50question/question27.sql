-- 27.	Get the names of customers who have rented the film titled "Murder Antitrust".

SELECT * FROM customer
SELECT * FROM rental
SELECT * FROM inventory
SELECT * FROM film

SELECT first_name, last_name FROM customer JOIN rental
ON rental.customer_id = customer.customer_id JOIN inventory
ON inventory.inventory_id = rental.inventory_id JOIN film
ON film.film_id = inventory.film_id
WHERE title = 'Murder Antitrust'