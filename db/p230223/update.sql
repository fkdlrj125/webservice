/*
 [DML] update ====================================================================================
 데이터 수정, 변경
 
 [문법]
 update 테이블명
 set 컬럼명 = 변경할값
 where 조건;
 ==================================================================================================
*/

# t1 테이블 조회
select * from t1;

# [t1 테이블] co1 컬럼값이 8인 로우의 co3 컬럼값을 null 변경
update t1
set co1 = 5
where co1 = 8;

# [문제] t1 테이블에서 co1 값이 4~6인 로우의 co3를 0.1로 변경
update t1
set co3=0.1
where co1 between 4 and 6;

# [t1 테이블] co1이 7인 로우에서 co2와 co3를 7로 변경
update t1
set co2=7, co3=7
where co1=7;

# [copy_temp1] three 컬럼의 값을 200으로 변경
select * from copy_temp1;

update copy_temp1
set three = 200;