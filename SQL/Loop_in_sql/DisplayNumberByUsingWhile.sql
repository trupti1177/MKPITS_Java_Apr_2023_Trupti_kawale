use sakila
DELIMITER //
CREATE PROCEDURE PrintNumberString(num int)
BEGIN
	declare counter int default 1;
	declare result varchar(255) default '';
    -- set counter = 1;
    -- set result = "";
while(counter <= num) do
	set result = concat(result,counter,',');
	set counter = counter + 1;
end while;
	SELECT result;
END
//
DELIMITER ;
drop procedure PrintNumberString;

-- ==================== CALL STORE PROCEDURE ================================
CALL PrintNumberString(10)