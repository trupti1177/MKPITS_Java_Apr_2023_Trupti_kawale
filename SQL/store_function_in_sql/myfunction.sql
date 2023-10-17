use sakila
drop function myfunction

DELIMITER $$
CREATE FUNCTION myfunction(cust_id int)
RETURNS decimal(5,2) -- width and decimal place we need to pass in case of decimal
DETERMINISTIC
BEGIN
 declare amt int;
 select sum(amount) into amt from payment where customer_id = cust_id;
 RETURN amt;
END $$
DELIMITER ;

select myfunction(3)