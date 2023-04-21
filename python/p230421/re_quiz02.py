# 문제 2 gangnam.txt 에서 연락처만 추출하여 파일에 쓰시오.
# phoneNumber.txt
# 쓰기 모드 : a
# 출력
# 전체 연락처 개수 >> 
# 연락처 추출 및 파일 기록 완료!!
import re

# 0 ~ 9, - 을 1개 이상 포함한 문자열 탐색
data = re.compile('[0-9-]+')

phoneNumber = []
with open('D:\\webservice\\python\\p230421\\gangnam.txt', 'r') as file:
    for line in data.findall(file.read()):
        if len(line) > 8:
            phoneNumber.append(line)

with open('D:\\webservice\\python\\p230421\\phoneNumber.txt', 'a') as file:
    for num, number in enumerate(phoneNumber, 1):
        file.write(f'{num}. {number}\n')

print(f'전체 연락처 개수 >> {len(phoneNumber)}')
print('연락처 추출 및 파일 기록 완료!!')
