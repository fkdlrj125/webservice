# 함수 정의
# 매개변수 o, return x

print('1. >>>>>>')


def increment(num):
    num += 1
    print('1 증가된 값 >>', num)

def increment(num1, num2):
    num1 += 1
    num2 += 1
    print('1 증가된 값 >>', num1)
    print('1 증가된 값 >>', num2)

print('2. >>>>>>')

# 함수 호출
increment(5, 7)

print('3. >>>>>>')