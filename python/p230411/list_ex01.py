data = [2, 4, 6, 8, 10]

print('data >> ',data)
print('data >> ',type(data))

#인덱싱(indexing)
print('첫 번째 요소 >> ',data[0])
print('첫 번째 요소의 타입 >> ',type(data[0]))
print('마지막 요소 왼쪽 기준>> ',data[2])
print('마지막 요소 오른쪽 기준>> ',data[-1])

#슬라이싱(sliscing)
print('첫 번째 ~ 두 번째 요소 >> ',data[0:2])
print('첫 번째 ~ 두 번째 요소의 타입 >> ',type(data[0:2]))
print('두 번째 ~ 마지막 요소 >> ',data[1:3])
print('두 번째 ~ 마지막 요소 >> ',data[1:])
print('data[:] >> ',data[:])
print('data >> ',data)
print('data[:1] >> ', data[:1])

#증감폭(step)
print('data[1:] >> ',data[1:])
print('data[1::2] >> ',data[1::2])
print('data[::2] >> ',data[::2])
print('data[::-1] >> ',data[::-1])
