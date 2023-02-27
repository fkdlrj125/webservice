/*
===	[foreign key] 참조설정 ==========================================================================================
 on delete	: 참조되는(PK) 테이블의 값이 삭제될 경우 동작 구문
 on update	: 참조되는(PK) 테이블의 값이 수정될 경우 동작 구문
 
 cascade 	: 참조되는 테이블에서 데이터를 삭제하거나 수정하면,
			  참조하는 테이블에서 삭제와 수정이 같이 이뤄짐
 set null   : 참조되는 테이블에서 데이터를 삭제하거나 수정하면,
			  참조하는 테이블에서 null로 설정됨
 no action  : 참조되는 테이블에서 데이터를 삭제하거나 수정하면,
			  참조하는 테이블에서 데이터는 변경되지 않음
 restrict   : MySQL에서는 no action과 같음 / 참조하는 데이터가 있다면, 참조되는 데이터를 삭제하거나 수정할 수 없음
 
=====================================================================================================================
*/

# DB 선택
use test;

# 테이블 삭제
drop table if exists buy;
drop table if exists customer;


create table if not exists customer(
	id int not null auto_increment,
    name char(30) not null,
    mobile char(13) not null,
    primary key(id)
);

create table if not exists buy(
	id int,
    price int not null,
    product_name char(50),
    foreign key (id) references customer(id) on delete restrict on update restrict
);

set foreign_key_checks = 0;
set foreign_key_checks = 1;

# row 추가
insert into customer values(1000, '홍길동', '010-1111-1111');
insert into customer(name,mobile) values('이미자', '010-2222-2222');
insert into customer(name,mobile) values('삼성동', '010-3333-3333');

insert into buy values(1000, 20000, '동원 돈까스');
insert into buy values(1000, 1000, '머리빗');
insert into buy values(1002, 990, '구이구이');

select * from customer;
select * from buy;                          

# [삭제] customer 테이블의 id가 1002인 row 삭제
delete from customer where id=1002;					# on delete restrict on update restrict 상태 / MySQL에선 no action이랑 같음

# [수정] customer 테이블의 id가 1000인 row의 id값을 2000으로 수정
update customer										# on delete no action on update no action 상태 / MySQL에선 no action이랑 같음
set id = 2000
where id = 1000;

