# 문제 1. morrie.txt 에서 교수가 들어간 문장만 추출하여 출력하시오.
import re
import os

data = re.compile('[\w\s,]*교수[\w\s,]*[.]') 
result = []
file_path = os.path.join(os.path.dirname(__file__),'morrie.txt')

with open(file_path, 'r', encoding='utf-8') as file:

    for num, line in enumerate(data.findall(file.read()), 1):
        result.append(f'{num}. {line.lstrip()}')

for line in result:
    print(line)