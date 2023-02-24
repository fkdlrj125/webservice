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
 restrict   : MySQL에서는 no action과 같음 / 참조되는 테이블에서 데이터를 삭제하거나 수정하면,
											 참조하는 테이블에서 데이터 삭제나 수정을 못하게 함
 
=====================================================================================================================
*/

create table customer(
	id int not null auto_increment,
    name char(30) not null,
    mobile char(13) not null,
    primary key(id)
);

create table buy(
	id int,
    price int not null,
    product_name char(50),
    foreign key (id) references customer(id)
);

drop table buy;

desc customer;
desc buy;

# row 추가
insert into customer values(1000, '홍길동', '010-1111-1111');
insert into customer(name,mobile) values('이미자', '010-2222-2222');
insert into customer(name,mobile) values('삼성동', '010-3333-3333');

insert into buy values(1000, 20000, '동원 돈까스');
insert into buy values(1000, 1000, '머리빗');
insert into buy values(1002, 990, '구이구이');

select * from customer;
select * from buy;
