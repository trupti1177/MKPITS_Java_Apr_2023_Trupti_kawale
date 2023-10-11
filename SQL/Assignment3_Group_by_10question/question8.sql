-- 8. Determine the count of rentals for each film.
use sakila
select * from rental
select * from inventory
select * from film

select film.film_id, count(rental_rate) as "rental count" from rental join inventory on
rental.inventory_id = inventory.inventory_id join film on
inventory.film_id = film.film_id group by film_id

select film.film_id, count(rental_id) as "rental count" from rental join inventory on
rental.inventory_id = inventory.inventory_id join film on
inventory.film_id = film.film_id group by film_id