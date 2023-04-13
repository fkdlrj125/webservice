value = 7

# [문제 1] value에 저장된 값이 짝수/홀수 출력
if value % 2 == 0:
    print('짝수')
else:
    print('홀수')


# [문제 2] value에 저장된 값의 범위 출력
# 범위 : 0미만의 수, 0이상 10미만의 수, 10이상 20 미만의 수
#        20이상 30미만의 수, 30이상의 수
if value < 0:
    print('0미만의 수')
elif value >=0 and value < 10:
    print('0이상 10미만의 수')
elif value >=10 and value < 20:
    print('10이상 20미만의 수')
elif value >=20 and value < 30:
    print('20이상 30미만의 수')
else:
    print('30이상의 수')  

# [문제 3] n1과 n2를 비교하여, 큰 값 출력
n1, n2 = 5, 3

print('큰 값 >> ',n1 if n1 > n2 else n2)

# [문제 4] 복숭아가 있으면 복숭아 개수를 출력
# 복숭아가 없으면 복숭아 없습니다를 출력
fruit = {'사과' : 5, '복숭아' : 7, '바나나' : 3}

if '복숭아' in fruit:
    print('복숭아 개수 >> ',fruit.get('복숭아'))
else:
    print('복숭아 없습니다.')

