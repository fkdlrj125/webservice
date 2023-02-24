/*
	[권한 부여] grant
- grant 권한 on DB명.테이블명 to '아이디'@'localhost';			
- grant all privileges on DB명.테이블명 to '아이디'@'localhost';	- DB의 테이블에 모든권한 부여
- grant select on DB명.테이블명 to '아이디'@'localhost';			- DB의 테이블에 조회 권한 부여
- grant select,update on DB명.테이블명 to '아이디'@'localhost';	- DB의 테이블에 조회,수정 권한 부여

	[권한 회수] revoke
- revoke 권한 on DB명.테이블명 from '아이디'@'localhost';
*/

# kim에 권한 확인
show grants;
show grants for kim@localhost;

# 사용자 kim에게 test DB의 copy_departments 테이블 조회 권한 부여
grant select on test.copy_departments to 'kim'@'localhost';

# 사용자 kim에게 test DB의 copy_departments 테이블 수정 권한 부여
grant update on test.copy_departments to 'kim'@'localhost';

# 사용자 kim의 test DB의 copy_departments에서의 모든 권한을 회수
revoke all privileges on test.copy_departments from 'kim'@'localhost';	
