CREATE DATABASE Bank_Details

USE Bank_Details

CREATE TABLE Employee(EmployeeID CHAR(10) NOT NULL PRIMARY KEY,
                      Emplyoee_Name CHAR(20),
                      Age INT,
                      Mobile_No VARCHAR(20),
                      Address VARCHAR(50),
                      city CHAR(10));

SELECT * FROM Employee

INSERT INTO Employee VALUES('101','shubham',20,'5465651888','itwari','Nagpur'),
						   ('104','Aniket',21,'3548448784','mahal','Pune'),
                           ('102','sanket',22,'8715745871','Mehandibagh','Mumbai'),
                           ('106','sanket',22,'8715745871','dharampeth','gondia'),
                           ('107','sanket',22,'8715745871','Gayatri nagar','Banglore'),
                           ('105','sanket',22,'8715745871','Bajaj nagar','Hyderabad'),
                           ('103','shivam',23,'8715141168','Dharampeth','Amravati');

SELECT * FROM Employee

CREATE TABLE Salary_details(EmployeeId CHAR(10), 
							salary VARCHAR(10), 
                            FOREIGN KEY(EmployeeId) REFERENCES Employee(EmployeeID)
                            );
                       
SELECT * FROM Salary_details

INSERT INTO Salary_details VALUES('101','20000'),
						          ('103','25000'),
                                  ('102','30000');
						
SELECT * FROM Employee WHERE age = '22'

SELECT * FROM Employee WHERE City IN ('Nagpur','Amravati')

SELECT * FROM Employee WHERE age BETWEEN 21 AND 23

UPDATE Employee SET city = 'Amravati' WHERE EmployeeID = 103
                           