/*
	[사용자 추가]
	- create user '아이디'@'localhost' identified by '비밀번호' / 내부접근
	- create user '아이디'@'%' identified by '비밀번호'   		/ %(와일드카드)는 주소가 오는 부분 특정 주소만 허락하는 것도 가능 / 외부접근
    
    - drop user '아이디'@'localhost';
    - drop user '아이디'@'%';
*/

show databases;
use mysql;
show tables;

select *
from mysql.user;

# 사용자 추가 
create user 'kim'@'localhost' identified by '1234';
create user 'park'@'%' identified by '4321';

# 사용자 삭제
drop user 'kim'@'localhost';
drop user 'park';

