# 논리 연산자 : and, or, not
# d001 부서 매니저 중  1990년 이후부터 매니저인 
# 사원의 사원번호, 부서번호, 매니저 시작일을 조회

select emp_no, dept_no, from_date
from dept_manager
where dept_no='d001' and from_date > '1989-12-31';

# [문제 1] 1990년 이후 입사한 남자 사원의 사원번호, 성별, 입사일 추출
select emp_no,gender,hire_date
from employees
where hire_date > '1989-12-31' and gender like 'm';

# [문제 2] 1990년 이후부터 연봉을 60,000 이상 받는 사원의 사원번호, 연봉, 연봉 수령 날짜(시작일) 추출
select emp_no,salary,from_date
from salaries
where from_date > '1989-12-31' and salary >= '60000';

# [문제 3] d001 부서와 d002 부서 매니저의 사원번호, 부서번호 추출
select emp_no,dept_no
from dept_manager
where dept_no like 'd001' or dept_no like 'd002';

# [문제 4] 직책이 staff이거나 engineer인 사원의 사원번호, 직책 추출
select emp_no, title
from titles
where title like 'staff' or title like 'engineer';

# [문제 5] d003 부서 소속(담당)이 아닌 매니저의 사원번호, 부서번호 추출
select emp_no, dept_no
from dept_manager
where not dept_no like 'd003';

# ==========================================================================

# [범위(between) 연산자]
# 연봉이 60,000 이상 70,000 이하인 사원의 사원번호, 연봉 추출
select emp_no,salary
from salaries
# where salary >= 60000 and salary <= 70000;
where salary between 60000 and 70000;     # 범위 질의(같은 속성을 비교할 때만 사용가능)

# [집합(in, not in) 연산자]
# d001 부서와 d002 부서 매니저의 사원번호, 부서번호 추출
select emp_no, dept_no
from dept_manager
where dept_no in ('d001' , 'd002');

# d001 부서와 d002 부서가 아닌 매니저의 사원번호, 부서번호 추출
select emp_no,dept_no
from dept_manager
where dept_no not in('d001', 'd002');

# [문자열(like, not like) 연산자]
# 성별이 F인 사원의 사번, 이름, 성별 조회
select emp_no, first_name, gender
from employees
# where gender='f'; 
where binary gender like 'F'; # binary : 대소문자 구분

# 이름이 B로 시작하는 사원의 사번, 이름 추출
select emp_no,first_name
from employees
where first_name like 'B%'; # 와일드 카드 : 문자열 내에서 사용 가능한 특수기호

# 이름이 i로 끝나는 사원의 사번, 이름 추출
select emp_no,first_name
from employees
where first_name like '%i';

# 이름에 u가 포함된 사원의 사번,이름 추출
select emp_no,first_name
from employees
where first_name like '%u%';

# 이름의 두 번째 글자가 r인 사원의 사번, 이름 추출
select emp_no, first_name
from employees
where first_name like '_r%';

# 단, 이름 글자 수가 3개인 이름만!
select emp_no, first_name
from employees
where first_name like '_r_';

# not like
# 이름이 B로 시작하지 않는 직원의 이름과 사번 조회(검색)
select emp_no,first_name
from employees
where first_name not like 'B%';

# [null 연산자]
# null 값 허용되는 테이블 찾기
desc titles;

# null 값 확인
select from_date, to_date
from titles
where to_date is null;

# emp_no가 10002인 사원의 to_date를 null 값으로 변경
update titles 
set to_date = null
where emp_no = 10002;

select *
from titles
where to_date is null;
