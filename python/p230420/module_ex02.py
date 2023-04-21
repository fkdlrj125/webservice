import datetime

# 날짜와 시간
now = datetime.datetime.now()
print('now >>', now)

# 날짜 datetime
print('=' * 50)

date = datetime.datetime.now().date()
print('date >>', date)

# 년
year = datetime.datetime.now().year
print('year >>', year)

# 월
month = now.month
print('month >>', month)

# 일
day = now.day
print('day >>', day)
print('day >>', day)

print('=' * 50, end='\n\n')

# 날짜 2 date
print('=' * 50)

today = datetime.date.today()
print('today >>', today)
print('year >>', today.year)
print('month >>', today.month)
print('day >>', today.day)

print('=' * 50, end='\n\n')

# 시간
print('=' * 50)

time = datetime.datetime.now().time()
print('time >>', time)

# 시
print('hour >>', time.hour)

# 분
print('minute >>', time.minute)

# 초
print('second >>', time.second)

print('=' * 50, end='\n\n')