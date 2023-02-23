/*
[DDL] create ===================================================================

create table [if not exists] 테이블명(
	컬럼명 자료형,
    컬럼명 자료형
);

script 파일이 실행될 때 테이블명이 겹치면 에러때문에 정지하게 되는데 정지하지 않게 
if not exists를 통해 경고로 바꿔줌

 [제약 조건]
primary key 	: 기본키 - 유일성, null 불가
foreign key 	: 외래키 - 중복 허용, null 허용, 참조값만 허용, 
						   이름은 달라도 되지만 타입은 같아야 함

not null 		: null 허용 x
auto_increment 	: 자동으로 1씩 증가 - 기본키에만 설정 가능, 마지막에 들어왔던 값에 +1
unique			: 중복 허용 x (유일 값), null 허용(null은 비교할 수 없기 때문에 허용)
check			: 값의 범위(도매인,domain)나 종류 지정, MySQL 8.0.16부터 지원
default 		: 기본값

================================================================================
*/

# 현재 DB 확인
select database();

# 테이블 생성
create table if not exists t1( 
	co1 int,
    co2 float
);

create table temp1(
	one int primary key auto_increment, 	# 컬럼 레벨 방식
    two int not null,
    three int 
);

desc temp1;

# temp1 조회
select * from temp1;	# null

# insert into 테이블명(컬럼명,컬럼명) / 모든 컬럼에 값을 넣을 땐 컬럼명 생략가능
# values(값1,값2);
insert into temp1 values(7,7,7);
insert into temp1(two,three) values(8,8);
insert into temp1 values(100,100,100);
insert into temp1(two,three) values(3,3);
insert into temp1(one,three) values(4,4);	# two가 null이라 error
insert into temp1 values(7,5,5);			# one culumn이 키본키라 중복값이 오면 error
insert into temp1(one,two) values(200,200);
insert into temp1(two,three) values(3,1);

select * from temp1;	# 7 7 7
						# 8 8 8 
						# 100 100 100
						# 101 3 3
						# 200 200 null
                        # 201 3 1
                        
create table temp2(
	one int,
    two int unique,
	constraint pk_one primary key(one)
);

insert into temp2 values(1,1);
insert into temp2(two) values(2);			# one 컬럼에 값이 null이라 error
insert into temp2(one) values(3);
insert into temp2 values(2,1);				# unique는 중복허용 x

select * from temp2;	# 1 1
						# 3 null
                        
create table temp3(
	gender char(1),
    age int default 1,
    constraint ck_gender check (gender in('m','f')),	# 제약 조건
    check (age>0)
);		

desc temp3;

insert into temp3 values('M',5);
insert into temp3 values('f',6);
insert into temp3(age) values(29);
insert into temp3(gender) values('f');
insert into temp3 values('W',34);		# 제약조건 m or f 에 위배 => 도매인 값 아님
insert into temp3 values('M',0);		# 제약조건 age > 0 에 위배 => 도매인 값 아님
insert into temp3 values('Man',33);		# 데이터 크기가 1을 초과해서 error

select * from temp3;	# M	 5
						# f	 6
						#    29
						# f	 1		age의 default가 1이라 1 자동으로 추가

#MySQL 버전 확인
select version();

create table temp4(
	one int,
    two char(10),
    three float,
    four int,
    constraint pk_temp4 primary key(one, two, three)
);

desc temp4;

# 로우 추가
insert into temp4 values(1,1,1,1);
insert into temp4 values(1,2,2,2);
insert into temp4 values(1,2,2,3);	# 기본키가 중복이라 error
insert into temp4(one,three,four) values(1,2,3); # 기본키에 null이 있어서 error

# temp4 조회
select * from temp4;	# 1 1 1 1
						# 1 2 2 2

create table temp5(
	id int,
    name varchar(50),
    constraint fk_id foreign key (id) references temp1(one)
);                        

insert into temp5 values(1,'홍길동');
insert into temp5 values(5,'박보검');	# 참조되는 값(기본키)에 없는 값이라 error
insert into temp5(name) values('박보검');
insert into temp5 values(1,'해피');

select * from temp5;
select * from temp1;

/*
 [문제] 테이블을 생성하시오.
 temp 6 테이블
 << 컬럼 >>
 id : pk --> temp1의 one 컬럼을 참조
 name : varchar(30)
 age : 1이상
*/

create table temp6(
	id int not null,						# 기본키로 설정해도 not null을 가독성을 위해 적어줌
    name varchar(30) not null,
    age int not null,
    constraint pk_fk_id primary key(id),
    foreign key(id) references temp1(one),
    check(age>0)
);

desc temp6;

insert into temp6 values(1,'홍길동',31);
insert into temp6 values(5,'박보검',33);	# 참조하는 필드에 없는 값을 입력
insert into temp6 values(1,'이미자',35);	# 기본키의 값이 중복됨

# temp6 조회
select * from temp6;