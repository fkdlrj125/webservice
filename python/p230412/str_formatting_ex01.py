# 정수
apple, banana = 5, 7

print('사과가', apple,'개 있고, 바나나는',banana,'개 있다.')
print('사과가 %d개 있고, 바나나는 %d개 있다.'%(apple,banana))

fm = '사과가 %d개 있고, 바나나는 %d개 있다.'%(apple,banana)
print(fm)

print('%d'%apple)
print('%4d'%apple)
print('%-4d'%apple)
print('%+d'%apple)
print('%04d'%apple)

num = 123456
print('%d'%num)
print('%7d'%num)

num = -5
print('%d'%num)
print('%+d'%num)

# 실수
fo = 2.36
print('현재 실수는 %f입니다.'%fo)
print('현재 실수는 %.2f입니다.'%fo)
print('현재 실수는 %.1f입니다.'%fo)
print('%f'%fo)
print('%.2f'%fo)
print('%5.2f'%fo)
print('%3.2f'%fo)

# 문자
c1, c2 = 97, 65
print('c1 : %c, c2 : %c'%(c1,c2))
print('c1 : %d, c2 : %d'%(c1,c2))

# 문자열
s1 = 'Hello'
print('문자열 s1에 저장된 값은 %s입니다.'%s1)
print('변수 c1에 저장된 값은 %s입니다.'%c1)

success = 97
print('성공률은 %d입니다.'%success)
print('성공률은 %d%입니다.'%success)
print('성공률은',success,'%입니다.')

