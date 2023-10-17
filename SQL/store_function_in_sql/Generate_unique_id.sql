-- Problem Statement 5: Generate a Unique Customer ID
-- Design a user-defined function that generates a unique customer ID based on a predefined pattern and the customer's personal details.

DELIMITER //
CREATE FUNCTION Generate_unique_id(f_name varchar(255), mobile_no char(255))
RETURNS varchar(255)
deterministic
BEGIN
return concat(substr(f_name,1,3),substr(mobile_no,4,6),substr(f_name,3,5));
END
//
DELIMITER ;

drop function Generate_unique_id;
select Generate_unique_id("shubham","2374893473");