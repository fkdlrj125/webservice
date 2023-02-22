#	날짜 함수 ============================================================================

# 	- 현재 날짜와 시간
select now();
select sysdate();

#	- 현재 날짜
select current_date(), curdate();

# 	- 현재 시간
select current_time(), curtime();

#	- 특정 날짜를 기준으로 더하거나 뺀 값 => 내부에서 숫자로 처리하기 때문에 가능
# 	 - date_add(날짜, interval 값 기준) - 날짜에서 interval 만큼 더한 값 리턴
# 	 - date_sub(날짜, interval 값 기준) 
# 	 - interval 기준 : year, month, day, hour, minute, second

# 	- 오늘을 기준으로 100일 뒤 날짜
select now(), date_add(now(),interval 100 day);
select now(), date_add(now(),interval 1 day);

#	- 오늘을 기준으로 14개월 뒤 날짜
select now(), date_add(now(),interval 14 month);
select now(), date_add(now(),interval 1 month);

#	- 현재 시간을 기준으로 10시간 뒤 시간
select now(), date_add(now(),interval 10 hour);

# 	- 현재 시간을 기준으로 2023년 전 날짜
select now(),date_sub(now(), interval 2023 year);

#	- 오늘을 기준으로 100일 전 날짜
select now(),date_sub(now(), interval 100 day);

# [문제] 사원들의 발령 7일 전 날짜 조회
select hire_date, date_sub(hire_date, interval 7 day) as '7daysbefore'
from employees;

#	[년, 월, 일, 시, 분, 초만 조회]
select now(), year(now()), month(now()), day(now());
select now(), hour(now()), minute(now()), second(now());

#	월을 영어로 리턴 : monthname(날짜)
select now(), monthname(now());
select '2023-03-01', monthname('2023-03-01');

#	요일을 숫자로 리턴 : dayofweek(날짜) => 일요일부터 시작(1)
select now(), dayofweek(now());		# 4
select '2023-02-23', dayofweek('2023-02-23'); # 5

#	요일을 숫자로 리턴(2) : weekday(날짜) => 월요일부터 시작(0)
select now(), weekday(now());	#2
select '2023-02-23', dayofweek('2023-02-23');	#3

select current_date()+1, weekday(curdate()+1);	#20230223	3

#	일년을 기준으로 일 수
select now(), dayofyear(now());	# 53
select '2023-12-31', dayofyear('2023-12-31');	# 365

#	일년을 기준으로 몇 번째 주 : week(날짜)
select now(), week(now());	# 8 

#	형식 지정
select now(), date_format(now(), '%Y년 %m월 %d일 %H시 %i분 %s초'); 	# 2023-02-22 11:19:45	2023년 02월 22일 11시 19분 45초
select now(), date_format(now(), '%y년 %M월 %d일 %w %r'); 	# 2023-02-22 11:22:56	23년 February월 22일 3 11:22:56 AM

#	월을 기준으로 일 수
select now(), dayofmonth(now()); # 22


#	요일을 영어로 리턴 : dayname(날짜)
select now(), dayname(now());