s1 = {2, 4, 6, 8}
s2 = {1, 2, 3, 4, 5}

# 교집합
print('교집합 : 연산자 >> ', s1 & s2)
print('교집합 : 함수 >> ', s1.intersection(s2))

# 합집합
print('합집합 : 연산자 >> ', s1|s2)
print('합집합 : 함수 >> ', s1.union(s2))

# 차집합
print('차집합 : 연산자 >> ', s1-s2)
print('차집합 : 함수 >> ', s1.difference(s2))

# 여집합
print('여집합 : 연산자 >> ', s1^s2)
print('여집합 : 함수 >> ', s1.symmetric_difference(s2))

