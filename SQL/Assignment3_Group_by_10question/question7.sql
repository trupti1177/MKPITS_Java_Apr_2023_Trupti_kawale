-- 7. Compute the average rental rate for each film category
use sakila

select * from film
select * from film_category

select film.film_id, avg(rental_rate) as "average rental rate" from film JOIN film_category on
film.film_id = film_category.film_id group by film_id