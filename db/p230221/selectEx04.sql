/*
	[SQL] structed query language
    - 정의어(DDL) : create(생성), alter(변경), drop(삭제) -> table단위
    - 조작어(DML) : select(조회), insert(추가), update(수정), delete(삭제) -> row단위
    - 제어어(DCL) : grant(부여), revoke(회수), commit(완료), rollback(취소)
    
    [정렬] order by
    - order by 컬럼명 asc(오름차순), desc(내림차순);
    - where 밑에 위치
*/

# 연봉을 오름차순, 연봉 시작일을 내림차순으로 하여 사원 번호, 연봉, 연봉 시작일 추출
select emp_no, salary, from_date
from salaries
order by salary asc, from_date desc;

# 직책을 오름차순, 업무 시작일을 내림차순 하여 사원번호, 직책, 업무 시작일을 추출
select emp_no, title, from_date
from titles
order by title asc, from_date desc;

