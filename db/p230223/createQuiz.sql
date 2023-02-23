# [문제] titles 테이블의 일부 구조를 복사한 c_titles 테이블 생성
# 단 emp_no, title, from_date 컬럼 구조 그대로 복사 -> pk 설정 되어있어야 함
# 데이터는 title이 engineer인 행만 추가

create table c_titles like employees.titles;
alter table c_titles drop to_date;
insert into c_titles
select emp_no, title, from_date from employees.titles where title like 'engineer';
select * from c_titles;