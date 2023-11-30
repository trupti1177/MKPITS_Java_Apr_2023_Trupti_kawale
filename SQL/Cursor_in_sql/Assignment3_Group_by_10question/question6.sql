use sakila
select * from staff
select * from payment
select * from rental

-- 6. Calculate the count of rentals handled by each staff member.
select staff_id,count(rental_id) as rental_handled
from rental group by staff_id