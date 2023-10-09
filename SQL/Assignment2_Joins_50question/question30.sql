-- 30.	Display the first name, last name, and email of customers who have rented the film titled "Squad Fisherman".

SELECT * FROM customer
SELECT * FROM rental
SELECT * FROM inventory
SELECT * FROM film

SELECT first_name, last_name, email FROM customer JOIN rental
ON rental.customer_id = customer.customer_id JOIN inventory
ON inventory.inventory_id = rental.inventory_id JOIN film
ON film.film_id = inventory.film_id
WHERE title = 'Squad Fisherman'