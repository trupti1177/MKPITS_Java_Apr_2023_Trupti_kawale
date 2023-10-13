use sakila
DELIMITER //
CREATE PROCEDURE DisplayNumberByUsingforloop(num int)
BEGIN
declare counter int;
declare str varchar(255);
set counter = 1;
set str = "";

forloop : loop
    set str = concat(str,counter,",");
    set counter = counter + 1;
    if(counter >= num) then
    leave forloop;
end if;
end loop;
	select str;
END
//
DELIMITER ;

drop procedure DisplayNumberByUsingforloop;
-- ==================== CALL STORE PROCEDURE ==========================
CALL DisplayNumberByUsingforloop(4)