use sakila
DELIMITER //
CREATE FUNCTION CalculateGST(amt decimal(5,2))
RETURNS decimal(5,2)
deterministic
BEGIN
 declare gst int;
 set gst = amt * 0.15;
 return gst;
END
//
DELIMITER ;

drop function CalculateGST;

select calculateGST(40.65);
select payment_id, amount, calculateGST(amount) as GST, 
amount+calculateGST(amount) as Total from payment;