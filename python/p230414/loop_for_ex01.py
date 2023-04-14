even = [2, 4, 6]

# for num in even:
#     print(num)

print('** range 함수 1) **')
for r in range(1, 10):
    print(r, end=' ')

print('\n\n** range 함수 2) **')
for r in range(10):
    print(r, end=' ')

print('\n\n** range 함수 3) **')
for r in range(1, 10, 2):
    print(r, end=' ')

# [문제] 다음과 같이 출력하시오.
# 10 9 8 7 6 5 4 3 2 1
print('\n\n** range 함수 4) **')
# for r in range(10, 0, -1):
#     print(r, end=' ')

lt = []

for r in range(1, 11):
    lt.append(r)

lt.reverse()
print(str(lt))

# print('\n\n** range 함수 5) **')
# for r in range(2, 11, 2):
#     print(r, end=' ')