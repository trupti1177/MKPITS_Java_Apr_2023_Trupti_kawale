-- 1. High revenue categories:
-- Find categories with an average rental revenue greater than $10.
select * from rental
select * from payment

select rental.rental_id, sum(amount) as "rental_revenue" from rental join payment on
rental.rental_id = payment.rental_id group by rental_id having rental_revenue>10