# 기본값
# 함수 정의
def default(a, b = 2, c = 1):
    print(f'a : {a}, b : {b}, c : {c}')

default(2, 4, 6)
default(1, 3, 5)
default(a=1,c=3)