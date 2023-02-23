/*
 [DDL] rename
rename table 기존이름 to 새이름;
*/

show tables;

rename table copy_employees to employees;

# 테이블 목록
show tables like '%empl%';