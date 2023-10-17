-- Problem Statement 2: Calculate Age from Birthdate
-- Develop a user-defined function that takes a person's birthdate as input and calculates their current age in years.

use sakila
DELIMITER //
CREATE FUNCTION CalculateAge(birth_date date)
RETURNS int
deterministic
BEGIN
declare age int;
set age = datediff(current_date(), birth_date)/365;
return age;
END
//
DELIMITER ;

drop function CalculateAge;

select CalculateAge('2000/08/03') as AGE;

select date()