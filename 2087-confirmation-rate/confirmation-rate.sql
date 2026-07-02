# Write your MySQL query statement below
select s.user_id , round(sum(CASE
        WHEN action = 'confirmed' THEN 1
        ELSE 0
    END ) / count(s.user_id),2) as confirmation_rate 
from Signups as s
left join Confirmations as c
on s.user_id = c.user_id
group by s.user_id
