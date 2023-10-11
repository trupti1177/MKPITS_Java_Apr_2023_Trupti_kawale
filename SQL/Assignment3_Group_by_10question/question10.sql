-- 10. Calculate the count of rentals for each film language.
use sakila
show tables

select * from rental -- inventory_id
select * from inventory -- inventory_id, film_id
select * from film -- film_id, language_id
select * from language -- language_id

select language.language_id,name, count(rental_id) as "count of rental" from rental join inventory on
rental.inventory_id = inventory.inventory_id join film on
inventory.film_id = film.film_id join language on
film.language_id = language.language_id group by language_id