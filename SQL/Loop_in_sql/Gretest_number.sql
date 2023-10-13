use sakila
drop procedure Greatest_number
DELIMITER //
CREATE PROCEDURE Greatest_number(number1 int, number2 int, number3 int)
BEGIN
declare greater int;
if number1>number2 then
	if number1>number3 then
        select number1;
	else
        select number3;
	end if;
else
	if number2>number3 then
        select number2;
	else
        select number3;
	end if;
end if;
END ;
//
DELIMITER ;

-- CALL PROCEDURE
CALL Greatest_number(5,6,7)