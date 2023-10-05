USE sakila
SHOW TABLES

-- 2. Retrieve the number of distinct films in the inventory
SELECT * FROM inventory
SELECT DISTINCT(film_id) FROM inventory