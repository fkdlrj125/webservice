/*
	[DDL] alter
    
alter table 테이블명 modify 컬럼명 자료형;
alter table 테이블명 change 기존컬럼명 새컬럼명 자료형;
alter table 테이블명 add 추가컬러명 자료형;
alter table 테이블명 drop 컬럼명;

alter table 테이블명 rename 새테이블명;
*/

insert into t1 values(1,'one',1.1);
insert into t1 values(2,'two',2.2);

select * from t1;

# 테이블 t1의 co2 컬럼의 자료형 변경 : varchar(10) -> char(5)
alter table t1 modify co2 char(5);
alter table t1 change co1 num int;


desc t1;

# 테이블 t1의 num 컬럼명 변경 : num -> co1, 타입 float 변경
alter table t1 change num co1 float;

select * from t1;

# 테이블 t1에 컬럼 co4 추가
alter table t1 add co4 int;

alter table t1 add co5 int default 0;

# 테이블 t1에 커럼 co4 삭제
alter table t1 drop co4;

# 테이블 t1의 이름을 t2로 변경
alter table t1 rename t2;

show tables;
desc t2;