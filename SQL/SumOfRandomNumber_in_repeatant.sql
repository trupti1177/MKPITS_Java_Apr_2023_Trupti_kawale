DELIMITER //
CREATE PROCEDURE SumOfRandomNumber_in_repeatant(num int)
BEGIN
	declare counter int;
	declare sum int;
	set counter = 0;
	set sum = 0;
repeat
	set sum = sum + counter;
    set counter = counter + 1;
    until counter > num
    end repeat;
    select sum;
END
//
DELIMITER ;

-- ===================== CALL STORE PROCEDURE =========================
CALL SumOfRandomNumber_in_repeatant(5)