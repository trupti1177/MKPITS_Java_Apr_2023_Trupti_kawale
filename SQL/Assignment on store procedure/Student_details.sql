create table Student_details(name varchar(255), city varchar(255));
drop table Student_details;

select * from Student_details;
select * from address;
select * from customer;

DELIMITER //
CREATE PROCEDURE Insert_name_city()
BEGIN
declare f_name varchar(255);
declare city_name varchar(255);
declare mycursor CURSOR for 
select first_name, city from citty join address on
city.city_id = address.city_id join customer on
address.address_id =customer.address_id;
declare continue handler for not found set done = 1;
open myCursor;
   Insertdetails : Loop
   fetch myCursor into f_name, city_name;
   insert into Student_details values(f_name, city_name);
if done = 1 then
    leave insertDetails;
   end if;
   end loop;
close myCursor;   
END
//
DELIMITER ;

call Insert_name_city();