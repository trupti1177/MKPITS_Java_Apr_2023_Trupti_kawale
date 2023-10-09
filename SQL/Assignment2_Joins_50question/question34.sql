-- 34.	Display the names of customers who have rented the film titled "Riders Zorro"
SELECT * FROM customer
SELECT * FROM rental
SELECT * FROM inventory
SELECT * FROM film

SELECT first_name, last_name FROM customer JOIN rental 
ON customer.customer_id=rental.customer_id JOIN inventory 
ON rental.inventory_id=inventory.inventory_id JOIN film
ON inventory.film_id = film.film_id WHERE title='Riders Zorro'