even = [2, 4, 6, 8]

print('even[1] >> ', even[1])

# 얕은 복사 : 주소 복사
print('\n-- 리스트 변수 even 얕은 복사 --')
even_copy = even
print('even >> ', even)
print('even_copy >> ', even_copy)
print('even의 주소 >> ', id(even))
print('even_copy의 주소 >> ', id(even_copy))

even_copy[even_copy.index(4)] = 10
print('even >> ', even)
print('even_copy >> ', even_copy)

# 깊은 복사 : 데이터 복사
# 함수
print('\n-- 리스트 변수 even 깊은 복사(함수) --')
even_deep_copy = even.copy()
print('even >> ', even)
print('even_deep_copy >> ', even_deep_copy)
print('even의 주소 >> ', id(even))
print('even_deep_copy의 주소 >> ', id(even_deep_copy))

even_deep_copy[-1] = 9
print('even >> ', even)
print('even_deep_copy >> ', even_deep_copy)


# 슬라이싱
print('\n-- 리스트 변수 even 깊은 복사(슬라이싱) --')
even_slicing = even[:]
print('even >> ', even)
print('even_slicing >> ', even_slicing)
print('even의 주소 >> ', id(even))
print('even_slicing의 주소 >> ', id(even_slicing))
