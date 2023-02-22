#	[함수] 숫자 ===========================================================================
#	- 절대값
select abs(100), abs(-100);

#   - 소수점 이하 올림(소수점 첫째자리로 고정)
select ceil(10.4), ceil(10.5), ceil(10.6);

#	- 소수점 이하 내림(소수점 첫째자리로 고정)
select floor(10.4), floor(10.5), floor(10);

# 	- 반올림(반올림 자리를 정할 수 있음)
select round(10.4), round(10.5), round(10.6);

select round(165.555,0), round(165.555,1), round(165.555,-1);

# 	- 버림(버림 자리를 정해줘야 함)
select truncate(15.412,0), truncate(15.512,1), truncate(15.612,-1);

#	- x의 y승
select power(5,2); # 5^2

# 	- 나머지
select mod(5,2); # 5%2

#	- 큰 값
select greatest(3,4,999,6,7,10,50,5);

#	- 작은 값
select least(3,4,999,6,7,10,50,5);

#	[함수] 문자 ===========================================================================
# 	- 이어주기
select concat('one', 'two', 'three');

select concat(first_name, ' 님') as first_name, concat('성별 : ',gender ) as gender
from employees;

select emp_no, concat(first_name," ", last_name) as name
from employees;

#	- 특정 위치에 추가(1)
# select insert('문자',시작위치,몇 개,'추가문자');
# 첫 번째 인수인 문자에서 2번째 자리에서 1개를 wow로 변경
select insert('abcdefg',2,1,'wow'); # awowcdefg

# 	- 특정 위치에 추가(2)
select insert('abcdefg', 2, 0, 'wow'); # awowbcdefg

# [문제] bcd를 삭제하시오.
select insert('abcdefg', 2, 3, '');

#	- 교체
#select replace('문자', 기존문자, 새문자)
select replace('abcdefg', 'bc', 'ONE'); # aONEdefg
select replace('abcdebcfgbc', 'bc', 'ONE'); # aONEdeONEfgONE

# [문제] bcd를 삭제하시오.
select replace('abcdefg', 'bcd', '');

# 	- 위치 : 왼쪽 기준으로 1부터 시작, 없으면 0
#	instr('문자', '찾고자하는 문자');
select instr('abcdefg', 'b'); # 2

select instr('abcdefg', 'k'); # 0

select instr('abcdefg', 'cde'); # 3

#	- 문자 반환
# 	left(문자, 개수)
# 	right(문자, 개수)
# 	mid(문자, 시작위치, 개수)
select left('abcdefg',3); # abc
select right('abcdefg',3); # efg
select mid('abcdefg',3,3); # cde

#	substring(문자, 시작위치, 개수)
select substring('abcdefg', 3, 3); #cde

# mid를 이용해서 c부터 끝까지 추출
select mid('abcdefg',3); # cdefg / 마지막 인수 생략하면 끝까지

select 
    *
from
    departments
order by
	dept_no;
    
# 	- 공백 제거
# 	ltrim(문자) : 왼쪽 공백 제거
# 	rtrim(문자) : 오른쪽쪽 공백 제거
# 	trim(문자) : 양쪽 공백 제거

select concat('|',ltrim('         abc         '),'|');
select concat('|',rtrim('         abc         '),'|');
select concat('|',trim('         abc         '),'|');
select concat('|',trim('         a    bc         '),'|');

