data = [2, 3.5, [1, 3, 5],'Hello']

print('data의 길이 >> ',len(data))
print('data >> ',data)

# 인덱싱
print('data[1] >> ', data[1])
print('data[1] >> ', type(data[1]))
print('data[2] >> ', data[2])

#2차원 배열형식처럼 리스트 내 리스트에 접근 가능
print('data[2][-1] >> ', data[2][-1])

# 슬라이싱
print('data[:2] >> ',data[:2])
print('data[:2] >> ',type(data[:2]))
