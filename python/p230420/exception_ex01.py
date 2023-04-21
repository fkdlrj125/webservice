n1, n2 = eval(input('정수 2개 입력...'))

# 예외발생 - n2의 입력 값이 0일때 
# result1 = n1 // n2
# result2 = n1 % n2

try:
    # 예외 발생 가능한 명령어
    result1 = n1 // n2
    result2 = n1 % n2
except:
    # 예외 발생했을 때, 실행할 명령어
    print('분모가 0으로 계산 불능')
else:
    # 예외가 발생하지 않았을 때, 실행할 명령어
    print('몫 >>', result1)
    print('나머지 >>', result2)
finally:
    # 예외 발생 여부와 상관없이, 마지막에 실행할 명령어
    print('=== 프로그램 종료 ===')


