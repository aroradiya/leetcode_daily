# Write your MySQL query statement below
select*
from Patients
where conditions like 'DIAB1%'  #either start with DIAB1% or 
or conditions like '% DIAB1%';   # %-> any other word followed by space with prefix DIAB1
