USE sakila

-- 59.	Get the first name, last name, and email of customers who have rented more than 15 films.
SELECT * FROM customer
SELECT * FROM rental
SELECT * FROM inventory
SELECT * FROM film

SELECT first_name, last_name, email, count(rental_id) FROM customer JOIN rental ON
customer.customer_id = rental.customer_id GROUP BY customer.customer_id HAVING 
count(rental_id)>15