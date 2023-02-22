/*
	[join]
    - 수평 join : from 절에 테이블명을 ,로 구분하여 여러 개 / 관계설정(외래키로 연결된)이 된 관계로 하는게 일반적
*/

select * from dept_manager;	# 24row
select * from departments;	# 9row

# 다대다 조인	/ dept_manager의 로우 하나당 departments의 모든 로우를 하나씩 붙임
select emp_no, dept_manager.dept_no, departments.dept_no, dept_name	# 필드명 앞에 테이블명을 적어줘서 구분
from dept_manager,departments;

# 부서번호가 같은 로우 수평 조인 
select emp_no, dept_manager.dept_no, departments.dept_no, dept_name	
from dept_manager,departments
where dept_manager.dept_no like departments.dept_no;				# where을 통해 조건에 해당하는 row만 조인 = 조인 조건 

select emp_no, dm.dept_no, dept_name								
from dept_manager as dm,departments dp							# alias를 통해 간결화 가능
where dm.dept_no like dp.dept_no;

# [문제] 현재 재직 중인 사원 번호, 이름, 연봉 조회
select em.emp_no, concat(first_name,' ',last_name) name, salary
from employees em, salaries sa
where to_date = '9999-01-01' and sa.emp_no = em.emp_no;

# [문제] 현재 재직 중인 사원의 직책 조회(사번, 직책)
select emp_no, title
from titles t
where to_date = '9999-01-01';

select e.emp_no, first_name, t.title
from employees e, titles t
where t.emp_no = e.emp_no and t.to_date = '9999-01-01';

