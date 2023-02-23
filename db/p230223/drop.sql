/*
 [DDL] drop
drop table 테이블명;
drop database DB명;
*/

# t2 테이블 삭제
drop table t2;

show tables like 't2';

# temp1 테이블 삭제
drop table temp1;		# 외래키로 참조한 테이블이 있기 때문에 삭제 불가
						# 참조한 테이블을 먼저 삭제해야 삭제가능

select * from temp1;