-- 9. Retrieve the total revenue generated for each city.
use sakila
show tables
select * from city -- city_id
select * from address -- city_id, address_id
select * from customer -- address_id, customer_id
select * from payment -- customer_id

select city.city_id, sum(amount) as "total revenue generate on city" from city join address on
city.city_id = address.city_id join customer on
address.address_id = customer.address_id join payment on
customer.customer_id = payment.customer_id group by city_id