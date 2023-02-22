# [문제1] 남자 사원의 수
select count(gender) '남자 사원 수'
from employees
where gender like 'm';

# [문제2] d005부서의 현재 근무하고 있는 사원 수
select count(*) 'd005부서의 사원 수'
from dept_emp
where dept_no like 'd005' and to_date='9999-01-01';

# [문제3] 부서별 현재 재직자 수
select dept_no '부서', count(*) '재직자 수'
from dept_emp
where to_date='9999-01-01'
group by dept_no ;

# [문제4] 각 부서의 과거 매니저 수 
select dept_no '부서', count(*) '과거 매니저 수'
from dept_manager
where to_date <> '9999-01-01'
group by dept_no;

# [문제5] 직책에 공백이 있는 데이터의 길이를 구하시오. 단 중복을 제거하여 하나의 데이터만 조회
select distinct title '직책', length(title) '직책 문자열 길이'
from titles
where instr(title,' ') <> 0;

# [문제6] 부서명, 부서번호, 부서 총 직원수 조회(현재와 기존 직원 포함한 수)
select dp.dept_name '부서명', dp.dept_no '부서번호', count(*) '부서 총 직원수'
from departments dp, dept_emp de
where dp.dept_no = de.dept_no
group by dp.dept_no;

# [문제7] 현재 연봉이 전체 현재 평균 연봉보다 많이 받는 직원들의 사원 번호, 현재 연봉 조회
select emp_no '사원 번호', salary '현재 연봉'
from salaries
where to_date='9999-01-01' and salary >(select avg(salary)
						   from salaries
						   where to_date='9999-01-01');

# [문제8] 1960년 이후 태어난 사원들의 사원 번호, 부서 번호 조회
select e.emp_no '사원 번호', d.dept_no '부서 번호'
from employees e, dept_emp d
where e.emp_no = d.emp_no and birth_date > '1959-12-31';

