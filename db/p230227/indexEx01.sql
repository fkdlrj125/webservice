/*
===========================================================================================================================
 [index]
 
 - 인덱스 생성
	alter table 테이블명 add index 인덱스명(컬럼명1,컬럼명2);
	create [unique] index 인덱스명 on table 테이블명(컬럼명1, 컬럼명2) [asc | desc];
    
 - 인덱스 삭제
	alter table 테이블명 drop index 인덱스명;
    drop index 인덱스명 on 테이블명;
 
- 조회 속도를 높이기 위해 사용 / 키로 설정한 컬럼을 조회하면 반드시 인덱스를 조회함
- 키가 생성된 테이블은 index가 무조건 생성
- 로우 주소(row_id) 와 컬럼(키 값)으로 구성
- 오름차순으로 자동 정렬

 [옵티마이저] : 실행 계획을 세우는 프로그램
- 키로 설정된 컬럼을 조회하면 인덱스를 사용해 조회를 하려함
- 인덱스를 사용하면 저장된 주소로 조회
- 키로 설정된 컬럼이 아니라면 테이블을 모두 조회해서 비교
===========================================================================================================================
*/
# 테이블 인덱스 확인
show index from customer;

use employees;

show index from employees;

# 전체 DB의 모든 key 정보 조회
select * from information_schema.table_constraints;

# employees DB에 employees 테이블의 모든 key 정보 조회
select * from information_schema.table_constraints 
where table_schema like 'employees' and table_name like 'employees';

# 전체 로우 조회
select * from employees;

# 특정 로우 조회
select * from employees where emp_no = 10002;		# Single Row Scan, cost : 1.0

# 특정 로우 조회
select * from employees where first_name like 'Parto';	# Full Table Scan, cost : 30174.55

# index 설정
# alter table 테이블명 add index 인덱스명(컬럼명1,컬럼명2);
alter table employees add index idx_emp_first_name(first_name);

# index 삭제
# alter table 테이블명 drop index 인덱스명;
alter table employees drop index idx_emp_first_name;

show index from employees;
show indexes in employees;

select * from information_schema.table_constraints 
where table_schema like 'employees' and table_name like 'employees';

# 특정 로우 조회(index를 설정한 로우)
select * from employees where first_name like 'Parto';	# Index Range Scan, cost : 102.86

# 특정 로우 조회(index를 삭제한 로우)
select * from employees where first_name like 'Parto';	# Full Table Scan, cost : 30174.55