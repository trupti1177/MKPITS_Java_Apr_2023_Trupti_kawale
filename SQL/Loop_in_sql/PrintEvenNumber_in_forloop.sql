DELIMITER //
CREATE PROCEDURE PrintEvenNumber_in_forloop(num int)
BEGIN
	declare counter int;
	declare str varchar(255);

	set counter = 1;
	set str = "";

forloop : loop
	if counter > num then  
		leave forloop;
    end if;

    set counter = counter + 1;
    if (counter mod 2) then
		iterate forloop;
    else 
		set str = concat(str,counter,",");
    end if;
    end loop;
		select str;
END
//
DELIMITER ;

-- The stored procedure constructs a string from the even numbers e.g., 2, 4, and 6....
-- The forloop  before the LOOP statement for using with the ITERATE and LEAVE statements.
-- If the value of  counter is greater than num, the loop is terminated because of the LEAVE statement.
-- If the value of the counter is an odd number, the ITERATE ignores everything below it and starts a new loop iteration.
-- If the value of the counter is an even number, the block in the ELSE statement will build the result string from even numbers.

-- ======================== CALL STORE PROCEDURE ==============================
CALL PrintEvenNumber_in_forloop(20)
