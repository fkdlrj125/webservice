# [문제]

number = [100, 200, 100, 500, 200, 600, 300]

# 1) 중복된 요소를 제거한 후, 오름차순 정렬
# number = list(set(number))

# number.sort()
# del number[1:3]

result = []
result.append(0 if number[0] in result else number[0])
result.append(0 if number[1] in result else number[1])
result.append(0 if number[2] in result else number[2])
result.append(0 if number[3] in result else number[3])
result.append(0 if number[4] in result else number[4])
result.append(0 if number[5] in result else number[5])
result.append(0 if number[6] in result else number[6])
result.sort()
del result[0:2]

print(result)



# 2) 요소 300 다음에 400 추가
number.insert(number.index(300)+1,400)
print(number)