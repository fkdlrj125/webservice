# [문제] s로 시작하는 단어 추출
select dept_no,mid(dept_name,instr(binary dept_name,'S')) as Sword
from departments
where mid(dept_name,instr(binary dept_name,'S')) not like ''
order by dept_no;

# [문제] 
select replace('         a    bc         ',' ','') as nospace;
