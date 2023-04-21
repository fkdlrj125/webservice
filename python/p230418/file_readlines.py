# 1. open 함수
gugudan = open('D:\webservice\python\p230418\gugudan.txt', 'r')

# 2. 읽기 함수 : readlines()
lines = gugudan.readlines()
print(lines)
# print(type(lines))
# print('요소 개수 >>',len(lines))

for line in lines:
    print(line, end='')
    
# 3. close 함수
gugudan.close()