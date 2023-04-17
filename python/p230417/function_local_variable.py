# 함수 정의
num = 1 # 전역변수

def increment():
    # var = 50
    # num = 100
    n = n + 1 # 지역 변수가 생성되기 전에 지역 변수 n에 접근해 +1을 실행해 Error
    print('함수 내에서 num 출력 >>', num)

# 함수 호출
increment() # 함수는 함수 내에서 생성한 변수만 사용 가능

# print('var >>', var)
print('num >>', num)

