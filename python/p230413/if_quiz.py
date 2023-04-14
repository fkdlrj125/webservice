value = 7

# [문제 1] value에 저장된 값이 짝수/홀수 출력
print('홀수') if value % 2 == 1 else print('짝수')
# 파이썬은 모든 값을 논리형으로 변경 가능
# 하지만 코드를 직관적으로 작성하는 게 좋기 때문에
# 조건을 명확히 해주는 것이 더 직관적

# [문제 2] value에 저장된 값의 범위 출력
# 범위 : 0미만의 수, 0이상 10미만의 수, 10이상 20 미만의 수
#        20이상 30미만의 수, 30이상의 수
if value < 0:
    print('0미만의 수')
elif value < 10:
    print('0이상 10미만의 수')
elif value < 20:
    print('10이상 20미만의 수')
elif value < 30:
    print('20이상 30미만의 수')
else:
    print('30이상의 수')  

# [문제 3] n1과 n2를 비교하여, 큰 값 출력
n1, n2 = 5, 5

# print('큰 값 >> ', n1 if n1 > n2 else n2)

# if n1 > n2:
#     print('큰 값 >> ', n1)
# elif n1 < n2:
#     print('큰 값 >> ', n2)

print('큰 값 >> ',max(n1, n2))

# [문제 4] 복숭아가 있으면 복숭아 개수를 출력
# 복숭아가 없으면 복숭아 없습니다를 출력
fruit = {'사과' : 5, '복숭아' : 7, '바나나' : 3}

# print(5+'문자열1') / Error -> int + str 불가능
# print(str(5) + '문자열1') # -> 가능

if '복숭아' in fruit:
    # print('복숭아 개수 ' + str(fruit.get("복숭아")) + '개입니다.')
    # print('복숭아 개수 %d개입니다.'%fruit.get('복숭아'))
    # print('복숭아 개수 {}개입니다.'.format(fruit.get('복숭아')))
    print(f'복숭아 개수 {fruit.get("복숭아")}개입니다.')
else:
    print('복숭아 없습니다.')

