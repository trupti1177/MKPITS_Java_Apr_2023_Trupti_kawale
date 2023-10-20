use sakila;
create table Product(product_id char(20), product_name char(20), price integer, quantity integer);
insert into Product values('101','Mobile',10000,40),
						  ('102','Laptop',40000,30),
                          ('103','showcase',8000,25),
                          ('104','watch',2000,50);
select * from Product;