DELIMITER //
CREATE PROCEDURE randomNumber()
BEGIN
declare counter int;
set counter=0;
forloop : loop
	set counter = counter + 1;
    select counter;
if counter>=10 then
    leave forloop;
    end if;
    end loop;
END
//
DELIMITER ;

-- CALL PROCEDURE 
CALL randomNumber()