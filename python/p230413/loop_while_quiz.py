# [문제 1] while문 이용하여 1~100까지 출력
# 가로로 출력

num = 0
print('='*50)
while True:
    num += 1
    print(num, end=' ')

    if num==100:
        break
print()
print('='*50, end='\n\n')

# [문제 2] 2단 출력

num = 0
print('='*50)
while True:
    num += 1
    print(f'2 * {num} = {2 * num}')

    if num==9:
        break
print('='*50, end='\n\n')

# [문제 3] 1~10 누적합
# 출력형태 : 1~10 누적합 >> 55
num = 0
result = 0
# while num < 10:
#     num += 1
#     result += num

result = sum(range(1,11))
print('='*50)
print('1~10 누적합 >> ', result)
print('='*50, end='\n\n')

# [문제 4] 리스트 변수 number의 모든 요소의 합을 출력하시오.
number = [2, 5, 9, 7, 11]
# num = 0
result = 0
# while num < len(number):
#     result += number[num]
#     num+=1
# number_copy = number.copy()

# while True:
#     result += number_copy.pop()

#     if len(number_copy) == 0:
#         break

for num in number:
    result += num

# result = sum(number)

print('='*50)
print('누적합 >> ', result)
print('='*50, end='\n\n')