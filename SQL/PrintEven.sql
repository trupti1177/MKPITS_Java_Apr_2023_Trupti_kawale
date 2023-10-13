DELIMITER //
CREATE PROCEDURE PrintEven(num int)
BEGIN
if(num % 2 = 0) then
select "even number",num;
else 
select "odd number",num;
end if;
END
//
DELIMITER ;

drop procedure PrintEven;
call PrintEven(8)
