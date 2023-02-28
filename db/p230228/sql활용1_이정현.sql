# 문제 1
create database movie;

# 문제 2
use movie;

create table actor(
	actor_id smallint not null auto_increment,
    name varchar(45) not null,
    birth_date Date,
    primary key(actor_id)
);

create table film(
	film_id smallint not null auto_increment,
    title varchar(255) not null,
    description text not null,
    release_year year not null,
    production_company varchar(100) not null,
    primary key(film_id)
);

create table film_actor(
	actor_id smallint not null,
    film_id smallint not null,
    primary key(actor_id, film_id),
    foreign key(actor_id) references actor(actor_id) on update cascade,
    foreign key(film_id) references film(film_id) on update cascade
);

desc film_actor;
desc film;
desc actor;

# 문제 3
insert into actor(name,birth_date) values('송강호','1967-01-17'),('한석규','1964-11-03'),('문성근','1953-05-28'),('심은하','1972-09-23'),('전도연','1973-02-11'),('이정재','1981-10-30');
select * from actor;

insert into film values(1001,'초록물고기','이창동감독의 데뷔작',1997,'이스트필름'),
						(1002,'접속','PC통신을 통해 신청자에게 접속하면서 생기는 로맨스',1997,'명필름'),
						(1003,'8월의크리스마스','허진호감독의 데뷔작',1998,'우노필름'),
						(1004,'쉬리','국내 첩보 액션 스릴러 영화',1999,'(주)강제규필름'),
						(1005,'텔미썸딩','이승현 감독의 멜로 영화',1999,'쿠앤씨필름'),
						(1006,'시월애','이승현 감독의 멜로 영화',2000,'싸이더스');
select * from film;

insert into film_actor values(2,1001),(3,1001),(2,1002),(5,1002),(2,1003),(4,1003),(1,1004),(2,1004),(2,1005),(4,1005),(6,1006);
select * from film_actor;

# 문제 4
select count(film_id) '1999년 이후 제작된 영화 수'
from film
where release_year >= 1999;

# 문제 5
select title '1999년 개봉 영화'
from film
where release_year = 1999;

# 문제 6
select a.name '쉬리 출현 배우'
from actor a join film_actor fa on a.actor_id = fa.actor_id
where fa.film_id = (select film_id
					from film
					where title like '쉬리');
                    
# 문제 7
select concat(count(film_id),'편') '한석규 배우 영화수'
from film_actor
where actor_id = (select actor_id 
				  from actor
				  where name like '한석규');
 
# 문제 8
select name '이름', birth_date '생년월일'
from actor
where year(birth_date) between 1970 and 1979;

# 문제 9
create user hyun@localhost identified by '1111';
select * from mysql.user;
grant select on movie.film to hyun@localhost;
show grants for hyun@localhost;
