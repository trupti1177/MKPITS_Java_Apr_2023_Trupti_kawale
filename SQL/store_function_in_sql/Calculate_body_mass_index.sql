-- Problem Statement 4: Calculate BMI (Body Mass Index)
-- Create a user-defined function that takes a person's weight (in kilograms) and height (in meters) as input and calculates their BMI.

DELIMITER //
CREATE FUNCTION Calculate_BMI(weight decimal(5,2), height decimal(5,2))
RETURNS DECIMAL(5,2)
deterministic
BEGIN
 declare BMI decimal(4,2);
 set BMI = weight / height;
 return BMI;
END
//
DELIMITER ;

select Calculate_BMI(56.50,5.5) as Body_mass_index;