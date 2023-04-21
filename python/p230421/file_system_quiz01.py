# 현재 날짜에 해당하는 폴더를 생성,
# 하위 폴더로 현재 시간으로 폴더 생성
# 현재 날짜에 해당하는 폴더가 존재한다면 생성 X
# 경로 : d:\workspace\20230421\145630123612345.txt (밀리세컨드까지 - 중복방지)

import os
import datetime

user_path = os.getcwd()
date = str(datetime.date.today()).replace('-', '')
# [1] replace 2번 사용 -> 2번 검사
# time = str(datetime.datetime.now().time()).replace(':', '').replace('.', '')

# [2] 인스턴스 변수 접근 -> 분에 0이 표시 X -> 문자열 포맷팅으로 해결
time_object = datetime.datetime.now().time()
time = f'{time_object.hour}{time_object.minute:02}{time_object.second}{time_object.microsecond}'

# [3] strftime으로 포맷팅 후 replace 
# time_object = datetime.datetime.now().strftime('%H.%M.%S.%f')
# time = time_object.replace('.', '')

if not os.path.exists(f'{user_path}\\{date}'):
    os.mkdir(f'{user_path}\\{date}')

open(f'{user_path}\\{date}\\{time}.txt', 'a')

