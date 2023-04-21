even = [2, 4, 6, 8]

try:
    4/0 
    even[4]
except IndexError:
    print('인덱스 범위를 벗어났습니다.')
except ZeroDivisionError as e:
    print('분모가 0이라 계산 불능입니다.')
    print(e)