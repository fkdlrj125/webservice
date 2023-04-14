coffee = 3
money = 300

while money:
    print('커피를 줍니다.')
    coffee -= 1

    if not coffee:
        print('커피가 다 떨어졌습니다. 판매 중지!')
        break