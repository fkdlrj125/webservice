/*
	[DDL] truncate
	- 구조만 남기고, 모든 로우 삭제
    - row 수가 많아지면 삭제할 때 delete와 속도 차이가 남
	- DDL이라 바로 DB에 적용되기 때문에 복구 불가
    - DML인 delete는 메모리에서 실행되고 DB에 적용시기를 설정할 수 있기 때문에 복구 가능
 
    truncate 테이블명;
*/

show tables;
select * from copy_t1;
select * from t1;

# truncate : 모든 row 삭제
truncate copy_salaries2;    # 0.032초
delete from copy_salaries3; # 10.156초

