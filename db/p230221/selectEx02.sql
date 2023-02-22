# 모든 필드 출력
select *
from employees
where emp_no < 10004;

# 출력 수 제한
select *
from employees
limit 4;	# offset 0 부터 4개 출력

# offset - 시작을 기준으로 얼마나 떨어져있나를 표기
select * from employees
limit 0,3;	# offset 0 부터 3개 출력

select * from employees
limit 1,3;  # offset 1 부터 3개 출력 

# 산술 연산자
# 1) 단순 계산
select 19+10;

select 20-10,30*3,40/2;

select emp_no,salary ,salary+10 as '10증가 값'
from salaries;

# [distinct] 중복 제거 (row 단위 / column의 값이 모두 같아야 제거)
select distinct dept_no
from dept_manager;
