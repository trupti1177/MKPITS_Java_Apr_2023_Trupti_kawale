USE sakila
SHOW TABLES

-- 7. Retrieve the most recent rentals
SELECT * FROM rental
SELECT * FROM rental ORDER BY rental_date DESC