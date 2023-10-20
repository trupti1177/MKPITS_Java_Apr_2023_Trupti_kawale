DELIMITER //
CREATE TRIGGER insert_Total_marks
after insert on student_marks for each row
BEGIN
	insert into Total_marks values(NEW.Roll_no,NEW.physics+NEW.science+NEW.Maths);
END
//
DELIMITER ;

drop trigger insert_Total_marks;