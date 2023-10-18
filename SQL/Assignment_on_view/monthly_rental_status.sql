-- Assignment 3: Aggregated View
-- Create a view named monthly_rental_stats that displays the month, year, and the total number of rentals for each month in the rental table.

use sakila;
select * from rental;
create view vw_monthly_rental_status as
select month('2005-05-24'), year('2005-05-24'),count(month('2005-05-24')) from rental;

create view vw1_monthly_rental_status as
select month('2005-05-24'), year('2005-05-24'),count(rental_id) from rental;

drop view vw_monthly_rental_status;
select * from vw_monthly_rental_status;
select * from vw1_monthly_rental_status