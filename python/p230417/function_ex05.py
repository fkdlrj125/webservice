# 함수 정의 
def add(n1, n2, *args):
    result = n1 + n2 + sum(args)
    print('누적합 >>', result)

# 함수 호출
add(3, 5, 2, 6)