USE sakila
SHOW TABLES

-- 4. Find the total revenue generated for each month.
SELECT * FROM payment
SELECT MONTH(payment_date), SUM(amount) FROM payment
GROUP BY MONTH(payment_date)