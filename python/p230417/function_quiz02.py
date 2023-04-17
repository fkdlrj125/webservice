# 문제 1. 인수를 2개 받은 후, 덧셈 결과 출력하는 함수를 정의
# 함수명 : add
# 매개변수 : 2
# 리턴 : x

# 출력 형태 
# 덧셈 결과 : 7
# 덧셈 결과 : 하나둘
# 타입이 달라서 덧셈 불가능
# 타입이 달라서 덧셈 불가능

# 함수 정의
def add(n1, n2):
    # if type(n1) == type(n2):
    #     print('덧셈 결과 : ',n1 + n2)
    # else:
    #     print('타입이 달라서 덧셈 불가능')
    
    if type(n1) == type(n2):
        print('덧셈 결과 : ',n1 + n2)
    elif type(n1) != str and type(n2) != str:
        print('덧셈 결과 : ',n1 + n2)
    else:
        print('타입이 달라서 덧셈 불가능')

# 함수 호출
add(2, 5)
add('하나', '둘')
add('하나', 2)
add(2, 2.5)