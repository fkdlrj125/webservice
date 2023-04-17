lt = [2, 4, 6]      ## mutable : 변경 가능한 
num = 1           ## immutable : 변경이 불가능한
print(id(num))

def change():
    lt[1] = 5
    # num = num + 1     # 지역 변수 num이 할당되기 전에 참조하기 때문에 Error
    print('[함수 내] lt >>', lt)

change()
print('lt >>', lt)