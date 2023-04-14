# for r in range(1, 10):
#     print(r, end=' ')

# 리스트 내포
[print(r, end=' ') for r in range(1,10)]

# 리스트 내포 리스트로 저장
print()
even = [r for r in range(2, 11, 2)]
print('even >> ', even)

#일반 for문
lt = []
for r in range(2, 11, 2):
    lt.append(r)
    # lt += [r]

thing = {r for r in range(2, 11, 2)}
print(thing)

# lt.extend(range(2, 11, 2)) 

print('lt >> ', lt)
