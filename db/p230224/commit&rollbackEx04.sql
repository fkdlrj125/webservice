# =====================================================================================================
# 특정 위치(쿼리) 작업 취소 : savepoint
# savepoint의 순서를 건너뛸 수 없다
# 메모리에 작업한 명령어들을 기록해두고 rollback하면 기록한 명령어를 역순으로 취소

# savepoint 이름1;
# t1 테이블의 모든 로우를 copy_t1 테이블에 복사

# savepoint 이름2;
# co1이 3인 로우 삭제

# 작업 취소
# =====================================================================================================

savepoint before_insert;

insert into copy_t1
select *
from t1;

savepoint before_delete;

delete from copy_t1
where co1 = 3;

rollback to before_delete;
rollback to before_insert;

select *
from copy_t1;