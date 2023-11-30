CREATE TABLE Customer_details(cust_fName varchar(45),cust_lName varchar(45), cust_address varchar(50));
select * from Customer_details;

-- Problem Statement 1: Retrieve Customer Names and Addresses
-- Create a cursor to retrieve the names and addresses of all customers from the Sakila database.
select * from customer; -- address_id
select * from address; -- address_id
desc customer
desc address

DELIMITER //
CREATE PROCEDURE Display_name_address_of_Customer()
BEGIN
 declare f_name varchar(45);
 declare l_name varchar(45);
 declare customer_address varchar(50);
 declare done int;
 
 declare MyCursor cursor for
	select first_name, last_name, address from customer join address on
    customer.address_id = address.address_id;

 declare continue handler for not found set done = 1;
 
 open MyCursor ;
 displayCustomerDetails : loop
	fetch MyCursor into f_name, l_name, customer_address;
    insert into Customer_details values(f_name,l_name,customer_address);
    if done = 1 then 
		leave displayCustomerDetails;
	end if;
    end loop;
close MyCursor;
END
//
DELIMITER ;

call Display_name_address_of_Customer();