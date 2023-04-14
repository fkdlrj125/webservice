coffee = 3

while True:
    money = int(input('\n돈을 넣어 주세요...'))

    if money == 300:
        print('커피를 줍니다.')
        coffee -= 1
    elif money >= 300:
        print(f'잔돈 : {money-300}원, 커피를 줍니다.')
        coffee -= 1
    else:
        print('돈이 부족합니다. 돈을 반환합니다.')
    
    print(f'남은 커피는 {coffee}잔 입니다.')

    if not coffee:
        print()
        print('=' * 50)
        print('커피가 다 떨어졌습니다. 판매 중지!')
        print('=' * 50)
        print()
        break