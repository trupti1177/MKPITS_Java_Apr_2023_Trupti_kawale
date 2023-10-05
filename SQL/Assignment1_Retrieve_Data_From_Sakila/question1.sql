USE sakila
SHOW TABLES

/*-- 1. Retrieve all customer names and their email addresses */
SELECT * FROM customer
SELECT first_name, last_name, email  FROM customer 

-- 2. Retrieve the number of distinct films in the inventory
SELECT * FROM inventory
SELECT DISTINCT(film_id) FROM inventory

-- 3. Retrieve the rental details for a specific rental ID
SELECT * FROM rental
SELECT * FROM rental where rental_id=5

-- 4. Retrieve all film titles and their lengths (in minutes)
SELECT * FROM film
SELECT title, length from film

-- 5. Retrieve the staff details for a specific staff ID
SELECT * FROM staff_list
SELECT * FROM staff_list where ID=2

-- 6. Retrieve the customers from a specific city
SELECT * FROM customer_list
SELECT * FROM customer_list where city='Batna'

-- 7. Retrieve the most recent rentals
SELECT * FROM rental
SELECT * FROM rental ORDER BY rental_date DESC

-- 8. Retrieve the distinct film categories available
SELECT * FROM film
SELECT DISTINCT(film_id) FROM film 

-- 9. Retrieve the rental history for a specific customer
SELECT * FROM rental
SELECT * FROM rental WHERE customer_id=10