-- Problem Statement 3: String Reversal
-- Design a user-defined function that takes a string as input and returns the reversed string.

DELIMITER //
CREATE FUNCTION Reverse_String(city varchar(255))
RETURNS varchar(255)
deterministic
BEGIN
return reverse(city);
END
//
DELIMITER ;

drop function Reverse_String;
select Reverse_String("Pune");