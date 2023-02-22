#	[그룹함수] 집계함수 ============================================================
#	- count(컬럼명) : 로우 개수 / 유일하게 * 사용가능 
#	- sum(컬럼명) : 합
#	- avg(컴럼명) : 평균
#	- max(컬럼명) : 최댓값
# 	- min(컬럼명) : 최솟값

#	[문법]
#	- select 컬럼명, 그룹함수(컬럼명)
#	  from 테이블명
#	  (where 조건)
#	  (group by 컬럼명
#	  having 조건) 						/ group by와 함께 사용
#	  (order by 컬럼명 asc, 컬럼명 desc);
#===================================================================================

#	총 사원 수
select count(emp_no),count(*)	# *은 row 자체를 1개로 취급(null도 취급), 컬럼명은 null값이 있으면 취급 x
from employees;

select count(to_date),count(*)	 # 443307 443308
from titles;

#	직원들 연봉 전체 합
select sum(salary), max(salary), min(salary)	# 181480757419	158220	38623
from salaries;

#	사원의 성별 수
select gender, count(gender)	# M	179973   그룹함수와 그냥 필드가 오면 데이터형태가 맞지 않아 에러
								# F	120051
from employees
group by gender;				# 그룹함수와 필드를 같이 사용할 땐 group by로 필드를 묶어줘야 함

select gender, count(emp_no)    #M	179973	 group by로 묶인 필드를 기준으로 함수가 실행되기 때문에 
								#F	120051	 함수안에 어떤 필드명이 와도 값은 같음
from employees
group by gender;

# 직책별 직원 수
select title, count(title)		#Senior Engineer	97750
from titles						#Staff	107391
group by title;					#Engineer	115003
								#Senior Staff	92853
								#Assistant Engineer	15128
								#Technique Leader	15159
								#Manager	24

select title, count(title)		#Senior Engineer	97750
from titles						#Staff	107391
#where count(title) >= 50000	where은 가공된 데이터를 처리할 수 없음
group by title					#Engineer	115003
having count(title) >= 50000;	#Senior Staff	92853

# [문제] d001, d002, d009 각 부서의 인원 수

# [첫 번째 방법]	그룹을 만들고 having으로 걸러줌
select dept_no, count(*)
from dept_emp
group by dept_no
having dept_no in('d001', 'd002', 'd009');

# [두 번째 방법]	where로 거르고 그룹(더 효율적)
select dept_no, count(*)
from dept_emp
where dept_no in('d001', 'd002', 'd009')
group by dept_no;
