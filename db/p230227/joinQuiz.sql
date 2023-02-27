select *
from customer c left join order_list o on c.id = o.id
union
select *
from customer c right join order_list o on c.id = o.id;

select *
from customer c left join order_list o on c.id = o.id
where o.id is null
union
select *
from customer c right join order_list o on c.id = o.id
where c.id is null;