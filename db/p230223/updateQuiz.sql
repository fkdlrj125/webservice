# [문제] salaries의 로우 100개를 복사한 copy_salaries 테이블 생성
# key 복사 없이, 모든 컬럼과 로우 복사 
# 입사일이 1986년도인 직원의 현재 연봉을 10% 인상

# employees db에 있는 salaries테이블의 row 100개를 복사해서 copy_salaries 생성
create table copy_salaries
as
select *
from employees.salaries
limit 100;

# 입사년도가 1986이고 현재 재직중인 직원의 봉급을 10% 증가
update copy_salaries
set salary = salary*1.1
where emp_no in (select emp_no
				 from  employees.employees
				 where year(hire_date) = 1986) and year(to_date) = 9999; 
                 
select * from copy_salaries where to_date='9999-01-01';
