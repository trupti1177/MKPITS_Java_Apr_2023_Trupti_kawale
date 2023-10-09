SHOW TABLES

-- 2. Display the rental date and return date for each rental along with the customer's first name and last name.
SELECT * FROM rental
SELECT * FROM customer

SELECT rental_date, return_date, first_name, last_name FROM rental JOIN customer 
ON rental.customer_id = customer.customer_id