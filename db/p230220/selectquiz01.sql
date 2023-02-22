# d005 부서 매니저의 사원번호, 부서번호 추출
select emp_no,dept_no
from dept_manager
where dept_no = "d005";

# d003 부서 소속(담당)이 아닌 매니저들의 사원번호, 부서번호 추출
select emp_no,dept_no
from dept_manager
where dept_no <> "d003";

# 연봉이 150,000 이상인 사원들의 사원번호, 연봉 추출
select emp_no, salary
from salaries
where salary >= 150000;

# 1986년 이후에 입사한 사원의 사원번호, 입사일, 이름 추출
select emp_no, hire_date, first_name, last_name
from employees
where hire_date > "1985-12-31";

# 1990년 이후부터 매니저로 근무하고 있는 사원들의 사원번호, 부서번호, 매니저 시작날짜 추출
select emp_no, dept_no, from_date
from dept_manager
where from_date > "1989-12-31";

# 1990년 이전 입사한 사원들의 사원번호, 입사일 추출
select emp_no, hire_date
from employees
where hire_date < "1991-01-01";