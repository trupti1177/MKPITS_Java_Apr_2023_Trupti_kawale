USE sakila
SHOW TABLES

-- 8. Retrieve the distinct film categories available
SELECT * FROM film
SELECT DISTINCT(film_id) FROM film 