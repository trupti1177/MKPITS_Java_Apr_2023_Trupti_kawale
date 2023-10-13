use sakila
DROP PROCEDURE PrintFactorial
DELIMITER //
CREATE PROCEDURE PrintFactorial(number int)
BEGIN
declare counter int;
declare fact int ;
set counter=1;
set fact = 1;
forLoop : loop
set fact = fact * counter;
set counter = counter + 1;
if counter > number then 
leave forLoop;
end if;
end loop;
SELECT fact;
END ;
//
DELIMITER ;

-- CALL PROCEDURE 
CALL PrintFactorial(10)