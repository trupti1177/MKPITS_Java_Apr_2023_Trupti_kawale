-- Assignment 4: Conditional View
-- Create a view named new_release_films that displays the film_id, title, and release_year for films released after the year 2005.

use sakila;
select * from film;
create view new_release_films as
select film_id, title, release_year from film where year(2006-01-01);

drop view new_release_films;
select * from new_release_films;