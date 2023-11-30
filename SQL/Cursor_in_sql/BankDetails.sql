create database BankDeatails
use BankDeatails
create table CustomerDeatails(User_id varchar(255), Customer_Name varchar(255),Customer_Address varchar(255),Customer_City varchar(255),
 Customer_Mobile varchar(255),Customer_Email varchar(255),Customer_Balance int)
select * from CustomerDeatails

alter table CustomerDeatails
add constraint pk_userid  Primary key(User_id)
alter table CustomerDeatails
add column UserPassword varchar(25)

create table Transactions(User_Id varchar(20),Transaction_date date,Amount int ,Transaction_type varchar(20),
foreign key (User_Id ) references CustomerDeatails(User_id))

select * from Transactions
drop table Transactions

use sakila
show tables
select * from total_details

