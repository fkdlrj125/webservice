# [SQL]
# - 정의어(DDL) : create, drop, alter
# - 조작어(DCL) : select, insert, update, delete
# - 제어어(DML) : grant,revoke,commit,rollback

# [기본키] primary key
# - 유일성(중복x), null값x

# [후보키] - 기본키의 후보
# - 유일성(중복x), null값x 

# [대체키] - 후보키 중 기본키가 되지 못한 후보

# [외래키] foreign key 
# - 다른 테이블과 관계를 맺기 위한 키(기본키를 사용) 
# - 중복,null값을 허용 
# - 기본키를 가지고 있는 테이블이 부모 외래키를 가지는 테이블이 자식(선후관계)


# [조작어] select - 조회, 검색
# << select statement >> select문
# - select 필드명1, 필드명2 << select clause >> select절 / 필수
#   from 테이블 			<< from clause >> from절 / 필수
# 	where 조건;				<< where clause >> where절 / 선택사항
# 	 [where 연산자]
#	  비교 연산자 
# 	  - <  : 작다,미만
# 	  - >  : 크다,초과
# 	  - <= : 작거나 같다,이하
# 	  - >= : 크거나 같다,이상
# 	  - =  : 같다
# 	  - <> : 다르다
#	  논리 연산자 : and, or, not 
# 	  범위 연산자 : between A and B
# 	  집합 연산자 : in(값1, 값2, ...)
# 				    not in(값, 값2, ...)
# 	  문자열 연산자 : like
#					  not like
#     null 연산자: is null
# 		    	   is not null

# DB 선택
use employees;

# 테이블 목록
show tables;

# 테이블 구조 확인
describe employees;

# employees 테이블 데이터 조회
select emp_no, birth_date, first_name, last_name, gender, hire_date
from employees;

#  전체 직원의 정보 중 사원과 이름만 조회
select emp_no, first_name
from employees;

# 사원번호 10001인 사원의 정보 조회
select emp_no, birth_date, first_name, last_name, gender, hire_date
from employees
where emp_no=10001;

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
where hire_date > "1986-12-31";

# 1990년 이후부터 매니저로 근무하고 있는 사원들의 사원번호, 부서번호, 매니저 시작날짜 추출
select emp_no, dept_no, from_date
from dept_manager
where from_date > "1990-12-31";

# 1990년 이전 입사한 사원들의 사원번호, 입사일 추출
select emp_no, hire_date
from employees
where hire_date < "1990-01-01";