DELIMITER //
CREATE TRIGGER insert_data_trigger 
after insert on purchase for each row
BEGIN
	update Product 
    set quantity = quantity + new.quantity
    where product_id = new.product_id;
END
//
DELIMITER ;