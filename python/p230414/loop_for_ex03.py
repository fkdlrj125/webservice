# 일반 for문
for r in range(1, 11):
    if r % 3 == 0:
        print(r, end=' ')

print()
# 리스트 내포
[print(r, end=' ') for r in range(1, 11) if r % 3 == 0]
print()

# 리스트 요소 추가
# 일반 for문
even = list() # 빈 리스트
print('even >> ',type(even))

for r in range(1,10):
    if r % 2 == 0:
        even.append(r)
print(even)

# 리스트 내포
even_two = [r for r in range(1, 10) if r % 2 == 0]
print(even)