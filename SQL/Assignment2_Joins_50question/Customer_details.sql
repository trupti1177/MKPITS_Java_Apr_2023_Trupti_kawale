CREATE DATABASE Customer_details
USE Customer_details

CREATE TABLE customer(CustomerID CHAR(10) PRIMARY KEY,
					  FirstName VARCHAR(50),
                      LastName VARCHAR(50),
                      Email VARCHAR(50),
                      Phone CHAR(15),
                      Address VARCHAR(100)
                      );
                      
SELECT * FROM Customer

INSERT INTO Customer VALUES('101','Sanket','Parate','sanket@gmail.com','2343423432','Lalganj khairipura'),
						   ('103','Aniket','khapre','aniket@gmail.com','2343545343','jhade chowk'),
                           ('105','Rohit','Rahate','rohit@gmail.com','353423423','Narayan peth'),
                           ('102','Mohit','watile','mohit@gmail.com','34535767632','Prem nagar'),
                           ('104','Shivam','kohale','shivam@gmail.com','563573565','pimpla phata'),
                           ('106','Raj','chawatkar','rajchawatkar@gmail.com','4565445432','Rameshwari');
                           
CREATE TABLE Products(ProductID CHAR(20) PRIMARY KEY,
					  ProductName CHAR(50),
                      Description VARCHAR(50),
                      Price INT,
                      Category CHAR(50));
                      
SELECT * FROM Products

INSERT INTO Products VALUES('11','Salt','taste purpose','100','Glocery'),
					('12','Pulses','Essential need','1000','Food'),
                    ('13','Rice','Essential need','2000','Food'),
                    ('14','Soyabean','Food','500','Glocery'),
                    ('15','Milk','Dairy Product','200','Dairy product');
                    
CREATE TABLE Orders(OrderID CHAR(10) PRIMARY KEY,
					CustomerID CHAR(10),
                    OrderDate VARCHAR(20),
                    TotalAmount VARCHAR(50),
                    CONSTRAINT fK_Customer FOREIGN KEY(CustomerID) REFERENCES Customer(CustomerID));

SELECT * FROM ORDERS

INSERT INTO Orders VALUES('1','101','05/06/2023','50'),
						 ('2','102','08/06/2023','40'),
                         ('3','104','12/06/23',30);
                         
INSERT INTO Orders VALUES('4','105','18/06/23',90);
                         
	