# [문제 1]
print('='*50)

# [1]
# for i in range(2, 10):
#     for j in range(1, 10):
#         print(f'{i} * {j} = {i*j}')
#     print()

# [2]
i = 2
while i < 10:
    j = 1
    while j < 10:
        print(f'{i} * {j} = {i*j}')
        j += 1
    print()
    i += 1

print('='*50, end='\n\n')

print('='*50)

# [1]
# for i in range(2, 10, 2):
#     for j in range(1, 10):
#         print(f'{i} * {j} = {i*j}')
#     print()

# [2]
i = 2
while i < 10:
    j = 1
    while j < 10:
        print(f'{i} * {j} = {i*j}')
        j += 1
    print()
    i += 2

print('='*50, end='\n\n')

print('='*50)

# [1]
# for i in range(2, 10, 2):
#     for j in range(1, i+1):
#         print(f'{i} * {j} = {i*j}')
#     print()

# [2]
i = 2
while i < 10:
    j = 1
    while j <= i:
        print(f'{i} * {j} = {i*j}')
        j += 1
    print()
    i += 2

print('='*50, end='\n\n')