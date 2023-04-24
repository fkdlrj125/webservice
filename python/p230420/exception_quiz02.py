# 문제 리스트 변수 list_data의 요소를 writeText.txt 파일에 쓰시오
# 추가문제 파일을 읽어와 처리
# writeText.txt는 새 파일로 생성
# writeText.txt가 이미 존재한다면, 에러 발생되도록 하고 예외처리
# 에러 발생하면, '파일이 이미 존재합니다.' 출력

# 입력 형태
# 1. one
# 2. two
# 3. three
# 4. four

# 문제 1.
list_data = ['one', 'two', 'three', 'four']

try:
    with open('D:\\webservice\\python\\p230420\\writeText.txt', 'x') as file:
        for num, data in enumerate(list_data,1):
            file.write(f'{num}. {data}\n')
except:
    print('파일이 이미 존재합니다.')

print('** 프로그램 종료 **')    # 종료를 시각적으로 나타냄
    
# 추가 문제 1.
# with open('D:\\webservice\\python\\number.txt', 'r') as numbers:
#     list_data = numbers.readlines()

# with open('D:\\webservice\\python\\p230420\\writeText.txt', 'a') as file:
#     for num, data in enumerate(list_data,1):
#         file.write(f'{num}. {data}')

# 추가 문제 2.
# list_num = []
# with open('D:\\webservice\\python\\numberTwo.txt', 'r') as numbers:
#     list_data = numbers.readlines()
#     for data in list_data:
#         for num in data.split(' '):
#             if num.isdigit():
#                 list_num.append(num+'\n')
        
# with open('D:\\webservice\\python\\p230420\\writeText.txt', 'a') as file:
#     for num, data in enumerate(list_num,1):
#         file.write(f'{num}. {data}')

# 추가 문제 3.
# import re

# data = re.compile('[0-9]+')
# list_num = []

# with open('D:\\webservice\\python\\numberTwo.txt', 'r') as numbers:
#     for num in data.findall(numbers.read()):
#         list_num.append(num+'\n')

# with open('D:\\webservice\\python\\p230420\\writeText.txt', 'a') as file:
#     for num, data in enumerate(list_num,1):
#         file.write(f'{num}. {data}')