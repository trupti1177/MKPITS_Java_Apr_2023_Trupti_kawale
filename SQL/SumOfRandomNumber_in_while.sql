DELIMITER // 
CREATE PROCEDURE SumOfRandomNumber(num int)
BEGIN
	declare counter int;
    declare sum int;
    set counter = 0;
    set sum = 0;
while counter <= num do
	set sum = sum + counter;
    set counter = counter + 1;
end while;
select sum;
END
//
DELIMITER ;

-- ==================== CALL STORE PROCEDURE ===================
CALL SumOfRandomNumber(10);
