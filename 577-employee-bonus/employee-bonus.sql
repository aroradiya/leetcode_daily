# Write your MySQL query statement below
select Employee.name,Bonus.bonus
from Employee
left join Bonus
on Employee.empId=Bonus.empId
group by Employee.empId
having bonus<1000 or bonus is null;
