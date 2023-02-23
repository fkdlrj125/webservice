/*
 [DML] insert ====================================================================================
row 추가

[문법1]
 insert into 테이블명(컬럼명1, 컬럼명2) values(값1, 값2); - 컬럼수와 값의 갯수가 같아야됨

[문법2]
 insert into 테이블명 values(값1, 값2) - 테이블에 있는 모든 컬럼에 값을 입력

[문법3] 
 insert into 테이블명 - insert하는 테이블명의 컬럼수와 서브쿼리의 컬럼갯수가 맞아야 함
 select 컬럼명, 컬럼명
 from 테이블명;	- 서브쿼리 이용
 
[문법4]
 insert into 테이블명(컬럼명1, 컬럼명2)
 values(값1,값2),(값3,값4),(값5,값6);
==================================================================================================
*/

create table t1(
	co1 int,
    co2 varchar(10),
    co3 float
);

# 로우 추가 : 컬럼명 모두 표시
insert into t1(co1,co2,co3) values(1,'하나',1.1);

# 로우 추가 : 컬럼명 생략
insert into t1 values(2,'둘',2.2);

# 로우 추가 : 컬럼명 일부 표시
insert into t1(co1,co2) values(3,'삼');

# 로우 추가 : 자료형 - co2 컬럼 : 숫자
insert into t1 values(4,400,4.4);

# 로우 추가 : 자료형 - c01 컬럼 : 문자
insert into t1 values('5','다섯','5.5');

# 로우 추가 : 자료형 - c01 컬럼 : 문자
insert into t1 values('육','육','6.6'); 

select * from t1;

# [테이블 구조(key) 복사 -> 데이터 복사] 
create table copy_temp1 like temp1;

desc copy_temp1;

select * from copy_temp1;

# copy_temp1에 row를 추가 : temp1 로우 복사
insert into copy_temp1
select * from temp1;

# [문제] titles 테이블의 일부 구조를 복사한 c_titles 테이블 생성
# 단 emp_no, title, from_date 컬럼 구조 그대로 복사 -> pk 설정 되어있어야 함
# 데이터는 title이 engineer인 행만 추가


create table c_titles like employees.titles;
alter table c_titles drop to_date;
desc c_titles;
insert into c_titles
select emp_no, title, from_date from employees.titles where title like 'engineer';
select * from c_titles;

# [t1테이블] 여러 개 로우 추가
insert into t1
values (6,'육',6.6), (7,'칠',7.7), (8,'팔',8.8);

select * from t1;