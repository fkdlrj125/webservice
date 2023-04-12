dc = {'이름' : '홍길동', '나이' : 35, '이름' : '박보검', '주소' : '서대문구'}
print('dc >> ',dc)
print('dc >> ',len(dc))

data = {'age' : 35, 1:'하루', 2:'이틀','이름' : ['홍길동', '박보검', '이미자']}
print('data >> ',data)
print('나이 >> ',data['age'])
print('하루 >> ',data[1])
print('이름 >> ',data['이름'])
print('박보검 >> ',data['이름'][data['이름'].index('박보검')])
