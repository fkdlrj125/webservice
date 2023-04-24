# 현재 날짜에 해당하는 폴더를 생성,
# 하위 폴더로 현재 시간으로 폴더 생성
# 현재 날짜에 해당하는 폴더가 존재한다면 생성 X
# 경로 : d:\workspace\20230421\145630123612345.txt (밀리세컨드까지 - 중복방지)

import os
# import datetime
from datetime import date, datetime

user_path = 'D:\\workspace'
today = str(date.today()).replace('-', '')

# [1] replace 2번 사용 -> 2번 검사
# time = str(datetime.datetime.now().time()).replace(':', '').replace('.', '')

# [2] 인스턴스 변수 접근 -> 분에 0이 표시 X -> 문자열 포맷팅으로 해결
time_object = datetime.now().time()
time = f'{time_object.hour}{time_object.minute:02}{time_object.second}{time_object.microsecond}'

# [3] strftime으로 포맷팅 후 replace 
# time_object = datetime.datetime.now().strftime('%H.%M.%S.%f')
# time = time_object.replace('.', '')

# 반복되는 문자열 변수로 만듦
folder_path = f'{user_path}\\{today}'
file = f'{folder_path}\\{time}.txt'
if not os.path.exists(folder_path):
    os.makedirs(folder_path)

# with open(f'{folder_path}\\{time}.txt', 'a') as file:
#     pass      

# 해당 경로에 계속해서 작업을 한다면 상대 경로를 변경해 작업하는 것이 좋음
os.chdir(folder_path)
with open(f'{time}.txt', 'w') as file:
    pass
