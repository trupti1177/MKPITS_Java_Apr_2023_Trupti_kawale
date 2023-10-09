SHOW TABLES

-- 4. Get the titles of all films rented by the customer named "William SATTERFIELD".
SELECT * FROM customer
SELECT * FROM rental
SELECT * FROM inventory
SELECT * FROM film

SELECT title FROM customer JOIN rental 
ON customer.customer_id=rental.customer_id JOIN inventory 
ON rental.inventory_id=inventory.inventory_id JOIN film ON inventory.film_id=film.film_id 
WHERE first_name = 'William' and last_name='SATTERFIELD'

SELECT * FROM film
SELECT * FROM inventory
SELECT * FROM rental
SELECT * FROM customer

SELECT title FROM film JOIN inventory 
ON film.film_id=inventory.film_id JOIN rental 
ON inventory.inventory_id=rental.inventory_id JOIN customer
ON rental.customer_id=customer.customer_id
WHERE first_name = 'William' and last_name='SATTERFIELD'