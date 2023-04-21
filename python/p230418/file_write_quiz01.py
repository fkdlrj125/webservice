# 문제 1. number.txt 파일을 생성하여 1~100을 파일에 쓰시오.
# 모드 : 추가 쓰기
# 경로 : 상대 경로
# 출력 형태
# 1
# 2
# 3
# 4
# ...
# 100

file = open('number.txt','a')

# for i in range(1,101):
#     # file.write(i)     / write 함수의 매개변수는 str타입만 받음
#     # file.write(str(i))     
#     file.write(f'{i}\n')

[file.write(f'{i}\n') for i in range(1,101)]

file.close
