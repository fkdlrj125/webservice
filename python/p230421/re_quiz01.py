# 문제 1. morrie.txt 에서 교수가 들어간 문장만 추출하여 출력하시오.
import re

# .을 포함하지 않고 교수를 포함한 문자열 탐색 + .
data = re.compile('[^.]+교수[^.]+[.]')
result = []

# num = 1
with open('D:\\webservice\\python\\p230421\\morrie.txt', 'r', encoding='utf-8') as file:
    # for line in data.findall(file.read()):
    #     result.append(f'{num}. {line.strip()}')
    #     num += 1

    for num, line in enumerate(data.findall(file.read()), 1):
        result.append(f'{num}. {line.strip()}')

for line in result:
    print(line)