-- 3. Calculate the average rental duration (in days) for each film.
use sakila
select * from rental
select * from inventory
select * from film

select film.film_id, avg(datediff(return_date,rental_date)) as "average rental duration for each film" from rental join inventory on
rental.inventory_id = inventory.inventory_id join film on
inventory.inventory_id = film.film_id group by film_id