-- Problem Statement 1: Calculate Total Order Value
-- Design a user-defined function that takes order quantity and unit price as input and calculates the total order value for each order.
use sakila
DELIMITER //
CREATE FUNCTION CalculateTotalOrder(quantity int, price int)
RETURNS int 
deterministic
BEGIN
 declare total int;
 set total = quantity * price;
 return total;
END
//
DELIMITER ;

drop function CalculateTotalOrder;
select CalculateTotalOrder(4,500) as Total;

