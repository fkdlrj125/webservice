# =====================================================================================================

# 1. copy_t1   : 로우 3개
# 2. new_t1    : 테이블 생성
# 3. copy_t1   : 로우 1개 삭제
# 4. 작업취소  : rollback

# =====================================================================================================

# 현재 copy_t1 테이블 조회 : 로우 0개
select * from copy_t1;
insert into copy_t1 values(1, '하나', 1.1), (2, '둘', 2.2), (3, '삼', 3.3);

# new_t1 테이블 생성
create table new_t1	    # DDL을 만나면 무조건 commit;
select * from t1;

show tables like '%t1%';

select * from new_t1;

# row 한 개 삭제 - col1컴럼의 ㄱ밧이 2인 row 삭제
delete from copy_t1
where co1=2;

select * from copy_t1;


rollback;