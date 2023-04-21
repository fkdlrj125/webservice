# 문제 2. numberTwo.txt 파일 생성 후, 정수 1 ~ 100을 쓰시오.
# 모드 : 추가 쓰기
# 경로 : 상대 경로
# 출력 형태
# 1 2 3 4 5 6 7 8 9 10
# 11 12 13 14 15 16 17 18 19 20
# ...
# 91 92 93 94 95 96 97 98 99 100

file = open('numberTwo.txt', 'a', encoding='utf-8')
print('file >>',file)

# for y in range(0, 10):
#     for x in range(1, 11):
#         file.write(f'{y*10+x} ')
#     file.write('\n')

# for i in range(1, 101):
#     file.write(f'{i} ')
#     if i % 10 == 0:
#         file.write('\n')

for y in range(0, 10):
    for x in range(1, 11):
        file.write(f'{y*10+x:<3}')
    file.write('\n')

file.close()
