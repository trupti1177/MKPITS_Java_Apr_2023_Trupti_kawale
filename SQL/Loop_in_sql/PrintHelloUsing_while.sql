DELIMITER //
CREATE PROCEDURE PrintHelloUsing_while(num int)
BEGIN
	declare counter int;
    set counter = 1;
while counter <= num do
	set counter = counter + 1;
    select "hello";
end while;
END
//
DELIMITER ;

-- ================ CALL STORE PROCEDURE =====================
call PrintHelloUsing_while(10)