-- factorial in repeatant loop
DROP PROCEDURE factorial_in_repeatant
DELIMITER //
CREATE PROCEDURE factorial_in_repeatant(num int)
BEGIN
declare counter int;
declare fact int;
set counter = 1;
set fact = 1;

repeat 
set fact = fact * counter;
set counter = counter + 1;
until counter >= num
end repeat;
select fact;
END 
//
DELIMITER ;

-- =============== CALL STORE PROCEDURE =======================
CALL factorial_in_repeatant(7)
 