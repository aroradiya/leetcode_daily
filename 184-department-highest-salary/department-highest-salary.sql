# Write your MySQL query statement below

select Employee.name as Employee,Employee.salary as Salary,Department.name as Department
from Employee
left join Department
on Employee.departmentId=Department.id
where (Employee.departmentId,Employee.salary) in(
    select departmentId,max(salary)
    from Employee
    group by departmentId
);
