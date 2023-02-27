/*
===============================================================================================================================
  [view]
  - 가상 테이블, 논리 테이블
  - 쿼리의 실행 결과를 테이블처럼 사용
  - 기반 테이블(base table)을 삭제하면, view도 삭제됨 / view를 삭제해도 기반 테이블에 영향x
  
  [장점]
  - 보안 효과
  - 특정 데이터만 조회
  - 쿼리 재사용
  
  [단점]
  - view 변경 불가능
  - 추가, 삭제, 수정 제한이 있을 수 있음 / 
  - 인덱스를 가질 수 없음
  
  [문법]
  create view 뷰이름 
  as
  select문;
===============================================================================================================================
*/

create view emp
as
select emp_no, first_name, gender
from employees;

show tables like '%emp';

# view emp 조회
select *
from emp;

# view emp 조회 남자 직원만 조회
select *
from emp
where gender like 'm';

# view emp 수정 emp_no가 10003인 직원의 이름을 길동으로 수정
update emp
set first_name = '길동'
where emp_no=10003;

# view emp row 추가 emp_no : 100, first_name : 보검, gender : M
insert into emp values(100,'보검','M');

# view emp 인덱스 생성 : first_name 컬럼에 idx_emp_first_name
create index idx_emp_first_name on emp(first_name);			# 물리적인 테이블이 아니기 때문에 index 생성 불가

show index from emp;

# view emp의 emp_no, first_name을 저장할 view v_emp생성
create view v_emp
as
select emp_no, first_name
from emp;

select * 
from v_emp;

# view v_emp삭제
drop view v_emp;

# view 확인
show tables like '%emp';
show full tables where table_type like 'VIEW';

select table_schema, table_name, table_type 
from information_schema.tables 
where table_schema like 'employees' and table_type like 'VIEW';

# view emp를 수정 : emp_no가 10100 이하인 직원
select * 
from emp;

alter view emp						# view는 변경 불가능 / 새로운 출력결과에 emp라는 이름만 붙여줌
as
select emp_no, first_name, gender
from employees
where emp_no <= 10100;

create view v_dept_emp_manager
as
select de.emp_no '사번', dm.dept_no '부서번호', dm.emp_no '매니저 사번'
from dept_manager dm, dept_emp de
where dm.dept_no = de.dept_no and dm.to_date = '9999-01-01';

select *
from v_dept_emp_manager;

# view 확인
show tables like '%emp%';
show full tables where table_type like 'VIEW';

# view 생성 쿼리문 확인
show create view v_dept_emp_manager;

#CREATE (ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER) (추가된 부분) VIEW `v_dept_emp_manager` 
#AS
#select `de`.`emp_no` AS `사번`,`dm`.`dept_no` AS `부서번호`,`dm`.`emp_no` AS `매니저 사번` 
#from (`dept_manager` `dm` join `dept_emp` `de`) 
#where ((`dm`.`dept_no` = `de`.`dept_no`) and (`dm`.`to_date` = '9999-01-01'))