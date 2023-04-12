apple, banana = 5, 7

print('사과가', apple,'개 있고, 바나나는',banana,'개 있다.')
print('사과가 %d개 있고, 바나나는 %d개 있다.'%(apple,banana))
print('사과가 {}개 있고, 바나나는 {}개 있다.'.format('two',banana))
print('사과가 {0}개 있고, 바나나는 {1}개 있다.'.format('two',banana))
print('사과가 {0}개 있고, 바나나는 {0}개 있다.'.format(apple))

print(f'사과가 {apple}개 있고, 바나나는 {banana}개 있다.')

fruit = f'사과가 {apple}개 있고, 바나나는 {banana}개 있다.'
print('[fruit]',fruit)

print(f'{apple}')
print(f'{apple:7}')
print(f'{apple:07}')
print(f'{apple:<7}')
print(f'{apple:>7}')
print(f'{apple:^7}')
print(f'{apple:=^7}')
print(f'{apple:!^7}')
