# with문
with open('D:\webservice\python\p230418\gugudan.txt', 'r') as gugudan:
    lines = gugudan.read()
    print(lines[:9])
    print(type(lines))

# 1. open 함수
# gugudan = open('D:\webservice\python\p230418\gugudan.txt', 'r')

# 2. 읽기 함수 : readlines()
# lines = gugudan.read()
# print(lines)
# print(type(lines))

# 3. close 함수
# gugudan.close()