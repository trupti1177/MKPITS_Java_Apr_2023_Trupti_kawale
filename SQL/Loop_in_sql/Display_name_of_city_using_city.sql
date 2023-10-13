use sakila;
select * from city; -- city_id
select * from address; -- city_id, address_id
select * from customer; -- address_id

DELIMITER //
CREATE PROCEDURE displayNameOfCustomer(IN v_city varchar(255))
BEGIN
-- declare customer_city char(255);
-- set customer_city = v_city;
	select first_name,last_name,city from customer join address on
    customer.address_id = address.address_id join city on
    address.city_id = city.city_id where city=v_city;
END 
//
DELIMITER ;

drop procedure displayNameOfCustomer;
call displayNameOfCustomer("Abu Dhabi");