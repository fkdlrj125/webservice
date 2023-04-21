# [문제] chemical 폴더 내 모든 파일명을 추출
# 파일명에서 숫자만 뽑아라 chemical.txt에 기록
import os

user_path = os.path.dirname(__file__) 
file_list = os.listdir(user_path + '\\chemical') 

with open(user_path + '\\chemical.txt', 'a') as file:
    for data in file_list:
        file.write(data.split(' ')[0] + '\n')

    # for data in file_list:
    #     file.write(data.split('-')[1] + '\n')
