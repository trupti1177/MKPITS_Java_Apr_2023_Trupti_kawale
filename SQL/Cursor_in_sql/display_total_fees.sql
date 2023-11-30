CREATE TABLE Calculate_rental_fees(Total_rental_fees decimal(5,2));
select * from Calculate_rental_fees;

-- Problem Statement 2: Calculate Total Rental Fees for a Customer
-- Create a cursor to calculate the total rental fees paid by a specific customer in the Sakila database.
select * from customer;
select * from payment;
desc payment;
desc customer;

DELIMITER //
CREATE PROCEDURE display_total_fees()
BEGIN
 declare total_fees decimal(5,2);
 declare done int;
 
 declare MyCursor cursor for
	SELECT SUM(amount) FROM customer JOIN payment ON
	customer.customer_id = payment.customer_id GROUP BY customer.customer_id;
 declare continue handler for not found set done = 1;
 
 open MyCursor ;
	DisplayFees : loop
		fetch MyCursor into total_fees;
        insert into Calculate_rental_fees values(total_fees);
	if done = 1 then
		leave DisplayFees;
	end if;
    end loop;
close MyCursor;
END
//
DELIMITER ;

CAll display_total_fees();
drop procedure display_total_fees;

SELECT CUSTOMER.customer_ID, SUM(AMOUNT) FROM CUSTOMER JOIN PAYMENT ON
CUSTOMER.CUSTOMER_ID = PAYMENT.CUSTOMER_ID GROUP BY customer.CUSTOMER_ID