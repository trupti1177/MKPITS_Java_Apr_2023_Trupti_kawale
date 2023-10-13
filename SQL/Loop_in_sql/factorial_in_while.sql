-- factorial in while loop
DROP PROCEDURE factorial_in_while
DELIMITER //
CREATE PROCEDURE factorial_in_while(num int)
BEGIN
	declare counter int;
    declare fact int;
    set counter=1;
    set fact=1;
    while counter <=num do -- loop will excute whenever the condition true
    set fact = fact * counter;
    set counter = counter + 1;
    end while;
    select fact;
END
//
DELIMITER ;
-- CALL PROCEDURE 
CALL factorial_in_while(5)