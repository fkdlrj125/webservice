# 문제 3. gugudan.txt 파일을 생성 후, 2 ~ 9단을 파일에 쓰시오.
# 모드 : 추가 쓰기
# 경로 : 상대 경로
# 출력 형태
# 2 * 1 = 2
# ...
# 2 * 9 = 18
# 
# 3 * 1 = 3
# ...

file = open('D:\webservice\python\p230418\gugudan.txt', 'w', encoding='utf-8')

for i in range(2, 10):
    for j in range(1, 10):
        file.write(f'{i} * {j} = {i * j}\n')
    file.write('\n')

file.close()