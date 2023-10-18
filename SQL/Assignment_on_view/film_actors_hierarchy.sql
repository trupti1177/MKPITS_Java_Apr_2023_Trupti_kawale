-- Assignment 5: Hierarchical View
-- Create a hierarchical view named film_actors_hierarchy that displays the film title and the actors for each film, organized in a hierarchical structure, 
-- using the film and actor tables.

use sakila;

select * from actor;
select * from film_actor;
select * from film;
create view hierarchical_view as
select title, first_name, last_name from film join film_actor on 
film.film_id = film_actor.film_id join actor on
actor.actor_id = film_actor.actor_id;

select * from hierarchical_view;