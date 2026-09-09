# Write your MySQL query statement below
Select *
from Users 
where email REGEXP '^[A-Za-z0-9_]+@[a-z]+[.]com$'
ORDER BY user_id asc;