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