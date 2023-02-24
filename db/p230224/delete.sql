/*
	[DML] delete
     - 로우 삭제, 변경

     [문법]
     delete from 테이블명
	 where 조건문;
*/

show tables;
select * from copy_temp1;

desc copy_temp1;

# [문제] copy_temp1 one 컬럼의 값이 2, 201인 로우 삭제

delete from copy_temp1
where one in (2,201);

# delete문에 where절이 없는 경우
delete from copy_temp1;
