/*
	[SQL]
    - DDL(정의어) : create, alter, drop 
    - DML(조작어) : select, insert, update, delete 
    - DCL(제어어) : grant, revoke, commit, rollback
    
    [문자]
    - char    : 고정 크기 -> 고정된 크기만큼 공간을 차지함			 -> 값을 변경할 때 고정된 크기만큼 사용가능 크기를 넘어가면 잘림
																		(값 변경이 자주있을 때 사용)
    - varchar : 가변 크기 -> 값이 들어오면 그 크기만큼 공간을 차지함 -> 값을 변경할 때 처음 설정된 크기가 넘어가면 빈 공간을 찾아서 공간을 할당받음
																		(값 변경이 자주 없을 때 사용)
*/

# testDB생성
# create database DB명;
create database test; 

show databases;

# testDB삭제
drop database test;

# testDB생성
create database test
character set = utf8mb4; #	이모지를 인식하는 unicode 버전
#이모지(emoji) : window + ., window + ;

# testDB 선택
use test;

# test 목록 확인
show tables;
/*
=== 테이블 생성 ==========================================================================
 - [문법1]
create table [if not exists] 테이블명(
	컬럼명 자료형,
    컬러명 자료형(크기)
);
 - [문법2]
서브쿼리 이용한 테이블 생성
create table [if not exists] 테이블명
as
select 컬럼명, 컬럼명
from 테이블명
where 조건;
============================================================================================
*/

# t1 테이블 생성
create table t1(
	co1 int,
    co2 varchar(10),
    co3 float
);
#테이블 목록 조회
show tables;	# t1

# t1 테이블 구조
desc t1;	#co1	int	
			#co2	varchar(10)	
			#co3	float	

# t1 테이블 데이터 조회
select *
from t1;

# departments 테이블의 모든 데이터 조회
use test;
select * from departments;
select * from employees.departments; #DB.테이블명으로 다른 DB에서도 조회가능

# 현재 선택된 DB 확인
select database();