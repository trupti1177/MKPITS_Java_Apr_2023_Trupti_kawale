use sakila
DELIMITER //
CREATE PROCEDURE DisplayNumberByRepeat(num int)
BEGIN
	declare counter int;
    declare str varchar(255);
    set counter = 1;
    set str = "";

repeat 
	set str = concat(str,counter,",");
    set counter = counter + 1;
until counter >= num
end repeat;
	select str;
END
//
DELIMITER ;

-- First, declare two variables counter and result and set their initial values to 1 and blank.
-- The counter variable is used for counting from 1 to 9 in the loop. And the result variable is used for storing the concatenated string after each loop iteration.
-- Second, append counter value to the result variable using the CONCAT() function until the counter is greater than or equal to num.

drop procedure DisplayNumberByRepeat;
-- ======================= CALL STORE PROCEDURE =================================
CALL DisplayNumberByRepeat(10)
