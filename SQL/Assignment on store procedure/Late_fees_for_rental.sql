-- Problem Statement 2: 
-- Generate a Rental Receipt
-- Create a stored procedure that generates a rental receipt for a given rental ID. 
-- The receipt should include rental details, customer information, and total cost. 
-- The procedure should output the receipt to the console.

use sakila;
select * from payment;
select * from customer;
select * from rental;

DELIMITER //
CREATE PROCEDURE Create_rental_receipt(renntalID int)
BEGIN
select rental.rental_id, first_name, last_name, customer.customer_id, return_date, sum(amount) 
AS "TOTAL_COST" from rental join payment on
rental.rental_id = payment.rental_id join customer on
customer.customer_id = rental.customer_id where rental.rental_id = renntalID;
END
//
DELIMITER ;

drop procedure Create_rental_receipt;
call Create_rental_receipt(10)