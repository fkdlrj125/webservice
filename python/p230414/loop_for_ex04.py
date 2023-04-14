data = [(2, 5), (1, 4), (3, 6)]

print(type(data))

# 방법 1
for first, last in data:
    print(f'first : {first}, last : {last}')

# 방법 2
# for d in data:
#    print(f'first : {d[0]}, last : {d[-1]}')
print('='*50)
[print(f'first : {d[0]}, last : {d[-1]}') for d in data]