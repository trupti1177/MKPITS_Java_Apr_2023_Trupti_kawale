USE sakila

-- 54.	Display the first name, last name, and email of customers who have rented the film titled "Spice Sorcerer".
SELECT * FROM film
SELECT * FROM inventory
SELECT * FROM rental
SELECT * FROM customer

SELECT first_name, last_name, email FROM film JOIN inventory ON
film.film_id = inventory.film_id JOIN rental ON 
inventory.inventory_id = rental.inventory_id JOIN customer ON
rental.customer_id = customer.customer_id WHERE title = "ALASKA PHANTOM"