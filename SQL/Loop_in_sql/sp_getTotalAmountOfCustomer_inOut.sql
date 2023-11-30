DELIMITER //
CREATE PROCEDURE sp_getTotalAmountOfCustomer_inOut(in cust_id int, out total_amount int)
BEGIN
	select sum(amount) into total_amount from payment where customer_id = cust_id;
END
//
DELIMITER ;

drop procedure sp_getTotalAmountOfCustomer_inOut;
CALL sp_getTotalAmountOfCustomer_inOut(4,@total_amount);
select @total_amount