# [문제] salaries의 로우 100개를 복사한 copy_salaries 테이블 생성
# key 복사 없이, 모든 컬럼과 로우 복사 
# 입사일이 1986년도인 직원의 현재 연봉을 10% 인상

create table copy_salaries
as
select *
from employees.salaries
limit 100;

update copy_salaries
set salary = salary*1.1
where emp_no in(select a.emp_no
				from(select emp_no
			  from copy_salaries
			  where year(from_date)='1986') a where a.emp_no and year(to_date) = '9999');

select * from copy_salaries where to_date='9999-01-01';
