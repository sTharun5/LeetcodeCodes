select (select salary from
(
select  distinct salary, dense_rank() over(order by salary desc) as t
from Employee
)th
where t = 2) as SecondHighestSalary;