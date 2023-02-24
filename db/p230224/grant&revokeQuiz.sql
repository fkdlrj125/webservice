# 1. 내부 접근이 허용된 사용자 park 생성
create user 'park'@'localhost' identified by '1111';

# 권한 확인
select *
from mysql.user;
show grants for 'park'@'localhost';

# 2. cmd에서 park으로 접속 --> DB 확인
#mysql -u park -p
#show databases;
/*
+--------------------+
| Database           |
+--------------------+
| information_schema |
| performance_schema |
+--------------------+
*/

# 3. 사용자 park에게 test DB의 모든 테이블을 조회할 수 있는 권한 부여
grant select on test.* to 'park'@'localhost';

# 권한 확인
show grants for 'park'@'localhost';

# 4. cmd에서 확인 : DB 목록 확인 -> 테이블 목록 확인 -> copy_departments 조회
#show databases;
/*
+--------------------+
| Database           |
+--------------------+
| information_schema |
| performance_schema |
| test               |
+--------------------+
*/

#use test;
#show tables;
/*
+------------------+
| Tables_in_test   |
+------------------+
| c_titles         |
| copy_departments |
| copy_salaries    |
| copy_t1          |
| copy_temp1       |
| copy_titles      |
| employees        |
| new_t1           |
| t1               |
| temp1            |
| temp2            |
| temp3            |
| temp4            |
| temp5            |
| temp6            |
+------------------+
*/

#select *
#from copy_departments;
/*
+---------+--------------------+
| dept_no | dept_name          |
+---------+--------------------+
| d009    | Serivce            |
| d005    | Development        |
| d002    | Finance            |
| d003    | Human Resources    |
| d001    | Marketing          |
| d004    | Production         |
| d006    | Quality Management |
| d008    | Research           |
| d007    | Sales              |
+---------+--------------------+
*/

# 5. cmd에서 확인 : copy_departments 로우 1개 추가
#insert into copy_departments values('d010', 'Info');
#ERROR 1142 (42000): INSERT command denied to user 'park'@'localhost' for table 'copy_departments'

# 6. 사용자 park에게 test DB의 copy_departments 테이블을 추가할 권한을 부여
grant insert on test.copy_departments to 'park'@'localhost';

# 권한 확인
show grants for 'park'@'localhost';

# 7. cmd에서 확인 : copy_departments 로우 1개 추가
#insert into copy_departments values('d010', 'Info');
#Query OK, 1 row affected (0.00 sec)
/*
+---------+--------------------+
| dept_no | dept_name          |
+---------+--------------------+
| d009    | Serivce            |
| d005    | Development        |
| d002    | Finance            |
| d003    | Human Resources    |
| d001    | Marketing          |
| d004    | Production         |
| d006    | Quality Management |
| d008    | Research           |
| d007    | Sales              |
| d010	  | Info			   |
+---------+--------------------+
*/

# 8. 사용자 park의 모든 권한 회수
revoke all privileges on *.* from 'park'@'localhost';

# 권한 확인
show grants for 'park'@'localhost';

# 9. 사용자 park 삭제
drop user 'park'@'localhost';
#mysql -u park -p
#ERROR 1045 (28000): Access denied for user 'park'@'localhost' (using password: YES)