DELIMITER //
CREATE PROCEDURE PrintHello(num int)
BEGIN
	declare counter int;
	set counter = 1;
repeat 
	set counter = counter + 1;
	select "hello",counter+1;
	until (counter > num) 
end repeat;
END
//
DELIMITER ;

drop procedure PrintHello;
-- ===================== CALL STORE PROCEDURE ===================
call PrintHello(10)