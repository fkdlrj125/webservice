# break
num = 0

while num < 10:
    num+=1
    
    if num % 3 == 0:
        break

    print('num >> ', num)

print('반복문 실행 후 num >> ', num)
