# [문제] chemical 폴더 내 모든 파일명을 추출
# 파일명에서 숫자만 뽑아라 chemical.txt에 기록
import os
import re

user_path = os.path.dirname(__file__) 
file_list = os.listdir(user_path + '\\' + 'chemical')

# 정규 표현식
file_list_str = ' '.join(file_list)
cp = re.compile('\d+-\d+-.')

with open(os.path.join(user_path, 'chemical.txt'), 'w') as file:
    # for data in file_list:
    #     file.write(data.split(' ')[0] + '\n')

    # for data in file_list:
    #     file.write(data.split('-')[1] + '\n')

    # 정규표현식
    # for data in cp.findall(file_list_str):
    #     file.write(data + '\n')

    # join을 이용해 반복문 없이 쓰기
    file.write('\n'.join(cp.findall(file_list_str)))