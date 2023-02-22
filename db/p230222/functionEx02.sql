# 	문자 함수 =================================================================================
# 	- 대문자로 변경 : ucase(문자)
#	- 소문자로 변경 : lcase(문자)
select ucase('AabBcCdDd');
select lcase('AabBcCdDd');


#	- 역순 : reverse(문자) 
select reverse('AabBcCdDd');

#	- 문자 길이
select length('AabBcCdDd');

# ex) 부서명 길이
select length(dept_name), dept_name
from departments;
