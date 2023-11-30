create table film_info(filmID int,film_title varchar(255),film_description text, film_release year(4));
select * from film_info;
drop table film_info;
-- Problem Statement 4: Retrieve Film Information by Category
-- Create a cursor to retrieve film details for a specific film category from the Sakila database.
select * from film_category;
select * from film;
desc film;

DELIMITER //
CREATE PROCEDURE display_film_info()
BEGIN
 declare f_id int;
 declare filmTitle varchar(255);
 declare filmDescription text;
 declare filmRelease year(4);
 declare done int;
 
 declare MyCursor cursor for
	select film_id, title, description, release_year  from film group by film.film_id;
    
 declare continue handler for not found set done = 1;
 
 Open MyCursor;
	DisplayFilmInfo : loop
    fetch MyCursor into f_id, filmTitle, filmDescription, filmRelease;
    insert into film_info values(f_id, filmTitle, filmDescription, filmRelease);
    if done = 1 then
		leave DisplayFilmInfo;
	end if; 
    end loop;
 close MyCursor;
END
//
DELIMITER ;

call display_film_info();
drop procedure display_film_info;