# 중첩 반복문

for i in range(1, 3):
    print(f'Outer Loop : {i}번째 실행')
    for j in range(1, 4):
        print(f'\tInner Loop : {j}번째 실행')
        
    print(f'Outer Loop : j = {j}')
    
