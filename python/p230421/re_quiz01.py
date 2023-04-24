# 문제 1. morrie.txt 에서 교수가 들어간 문장만 추출하여 출력하시오.
import re
import os

# .을 포함하지 않고 교수를 포함한 문자열 탐색 + .
# data = re.compile('[^.]+교수[^.]+[.]')

# *를 통해 교수가 가장 처음이나 마지막에 와도 탐색 가능
# data = re.compile('[\w\s]*교수[\w\s]*[.]') 

# *를 통해 교수가 가장 처음이나 마지막에 와도 탐색 가능
# 문장 속 기호를 추가해 모든 문장을 잘 읽어옮
data = re.compile('[\w\s,]*교수[\w\s,]*[.]') 
result = []
file_path = os.path.join(os.path.dirname(__file__),'morrie.txt')

# num = 1
file = open(file_path, 'r', encoding='utf-8')
    # for line in data.findall(file.read()):
    #     result.append(f'{num}. {line.strip()}')
    #     num += 1

for num, line in enumerate(data.findall(file.read()), 1):
    result.append(f'{num}. {line.lstrip()}')

for line in result:
    print(line)

file.close()