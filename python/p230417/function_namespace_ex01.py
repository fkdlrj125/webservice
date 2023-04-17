num = 5 # 전역 변수
print('globals >>',globals())

def change():
    # num = 100
    print('globals >>',globals())
    print('locals >>',locals())
    print('함수 내 num >>', num)

change()
print('num >>', num)