# 1. open 함수
gugudan = open('D:\webservice\python\p230418\gugudan.txt', 'r')

# 2. 읽기 함수 : readline()
# line = gugudan.readline()
# print('line >>', line, end='')
# line = gugudan.readline()
# print('line >>', line, end='')

while True:
    line = gugudan.readline()

    # if line == '':
    #     break
    if not line:  # 빈 문자열을 논리값으로 바꾸면 False라 부정을 해줘 탈출
        break

    print(line, end='')

# 3. close 함수
gugudan.close()