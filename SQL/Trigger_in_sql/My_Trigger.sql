DELIMITER //
CREATE TRIGGER MY_Trigger 
after insert on sale for each row
BEGIN
 update Product
 set quantity = quantity - new.quantity
 where product_id = new.product_id;
END
//
DELIMITER ;
