-- Assignment 1: Basic View Creation
-- Create a view named film_titles that displays the film_id, title, and release_year for all films in the Sakila database.

use sakila;
select * from film;

create view vw_film_details as
select film_id, title, release_year from film;

select * from vw_film_details