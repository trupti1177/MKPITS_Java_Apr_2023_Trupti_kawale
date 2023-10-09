-- 12. Display the film titles rented by the customer with customer_id 300.

SELECT * FROM customer
SELECT * FROM rental
SELECT * FROM inventory
SELECT * FROM film

SELECT title FROM customer JOIN rental 
ON customer.customer_id = rental.customer_id JOIN inventory
ON rental.inventory_id=inventory.inventory_id JOIN film
ON inventory.film_id=film.film_id 
WHERE customer.customer_id=300