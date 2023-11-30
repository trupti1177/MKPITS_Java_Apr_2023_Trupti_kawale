CREATE TABLE Calculate_Average_rental_duration(average_rental_duration int);
select * from Calculate_Average_rental_duration;
-- Problem Statement 5: Calculate Average Film Rental Duration
-- Create a cursor to calculate the average rental duration for all films in the Sakila database.
select * from film;
desc film;

DELIMITER //
CREATE PROCEDURE Display_Average_of_Rental_duration()
BEGIN
 -- declare filmId int;
 declare avg_rental_duration int;
 declare done int;
 declare MyCursor cursor for
	select avg(rental_duration) from film group by film_id;
    
declare continue handler for not found set done = 1; 
 open MyCursor;
	displayAvgRentalDuration : loop
     fetch MyCursor into avg_rental_duration;
     insert into Calculate_Average_rental_duration values(avg_rental_duration);
     if done = 1 then
		leave displayAvgRentalDuration;
	 end if;
     end loop;
 close MyCursor;
END
//
DELIMITER ;
call Display_Average_of_Rental_duration();
drop procedure Display_Average_of_Rental_duration;

select film_id,avg(rental_duration) from film group by film_id


-- 0	112	20:05:19	call Display_Average_of_Rental_duration()	
-- Error Code: 1136. Column count doesn't match value count at row 1	0.000 sec