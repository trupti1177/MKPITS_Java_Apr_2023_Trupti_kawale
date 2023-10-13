DELIMITER //
CREATE PROCEDURE sp_getTotalAmountOfCustomer(cust_id int)
BEGIN
	select customer_id, sum(amount) from payment where customer_id = cust_id;
END
//
DELIMITER ;

drop procedure sp_getTotalAmountOfCustomer;
CALL sp_getTotalAmountOfCustomer(2)