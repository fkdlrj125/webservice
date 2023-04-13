s = {4, 1, 7, 5}

print('s >> ',s)
print('s 길이 >> ',len(s))

# print('s[1] >> ',s[1])

# 함수
# 요소 1개 추가
s.add(6)
print('6 추가 후 s >> ',s)

s.add(4)
print('4 추가 후 s >> ',len(s))

# 요소 여러 개 추가
s.update([2, 3, 8, 9, 1])
print('2, 3, 8, 9, 1 추가 후 s >> ',s)

# 특정 요소 제거
s.remove(8)
print('8 제거 후 s >> ',s)
