# 리스트 함수 2

data = ['one', 'two', 'three', 'four']

# 특정 요소의 인덱스
print('one의 index >> ',data.index('one'))
# print('ten의 index >> ',data.index('ten'))

# 요소 추가 : 마지막
print('five 추가 전 리스트 수 >> ',len(data))
print('five 추가 전 리스트 >> ',data)
data.append('five')
print('five 추가 후 리스트 수 >> ',len(data))
print('five 추가 후 리스트 >> ',data)

# 요소 추가 : 특정 위치
print('하나 추가 전 리스트',data)
data.insert(1, '하나')
print('하나 추가 후 리스트',data)

# 요소 추가 : 여러 요소 추가
even = [2, 4]
print('even 추가 전 리스트', data)
# data.extend(even)
data += even
print('even 추가 후 리스트', data)

# 요소 제거
print('하나 제거 전 리스트', data)
element = data.remove('하나')
print('하나 제거 후 리스트', data)
print('삭제된 요소 : remove 함수 리턴값 >> ',element)

# 요소 제거
print('pop 실행 전 리스트', data)
element = data.pop()
print('pop 실행 후 리스트', data)
data.pop(1)
print('인덱스 1의 요소 pop 실행 후 리스트', data)
print('삭제된 요소 >> ', element)

#요소 제거 
del data[0]
print('del data[0] 함수 실행 후 리스트', data)

del data[-2:]
print('del data[-2:] 함수 실행 후 리스트', data)

# 요소 개수
four_count = data.count('four')
print('four의 개수 >> ',four_count)
