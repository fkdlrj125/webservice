even = (2, 4, 6, 8)

print('튜플 변수 even >> ',even)
print('튜플 변수 even의 타입 >> ',type(even))

even = list(even)
print('리스트 변수 even >> ',even)
print('even의 타입 >> ',type(even))

even[2] = 100
print('인덱스 2의 값을 100으로 변경 >> ',even)

even = tuple(even)
print('튜플 변수 even >> ',even)
print('even의 타입 >> ',type(even))