# [수직 조인] - 합집합
# 합집합 : union - 중복 제거, union all - 중복 모두 표시

# 교집합, 차집합은 별도의 연산자X(mySQL)
# 교집합 : join 	 - 조인조건
# 차집합 : sub query - not in

select dept_no, emp_no
from dept_manager;	# 24row

select dept_no, dept_name
from departments; 	# 9row

# 수직 조인 union
select dept_no
from dept_manager
union				# 자동으로 중복 제거
select dept_no
from departments;

# 수직 조인 union all
select dept_no
from dept_manager
union all 			# 중복 제거X
select dept_no
from departments;

select dept_no, emp_no
from dept_manager
union
select dept_no, dept_name
from departments;

