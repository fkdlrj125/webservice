# 방법 2
from datetime import datetime, date

now = datetime.now()
print('now >>', now)

print('=' * 50)
# 날짜 1 datetime
date1 = now.date()
print('date >>', date1)
print('date >>', type(date1))
print('year >>', date1.year)
print('month >>', date1.month)
print('day >>', date1.day)

print('=' * 50, end='\n\n')

print('=' * 50)
# 날짜 2 date
today = date.today()
print('today >>', today)
print('today >>', type(today))
print('year >>', today.year)
print('month >>', today.month)
print('day >>', today.day)

print('=' * 50, end='\n\n')

print('=' * 50)
# 시간
time = now.time()
print('time >>', time)
print('hour >>', time.hour)
print('minute >>', time.minute)
print('second >>', time.second)


print('=' * 50, end='\n\n')