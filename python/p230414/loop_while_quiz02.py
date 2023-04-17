
# 문제 
count = 1
lt = list()
# lt = []
while True:
    # print(f'[{count}번째] 1 이상의 정수 입력 ...', end=' ')
    # lt.append(int(input()))
    # lt.append(int(input('[%d번째] 1 이상의 정수 입력 ... '%count)))
    # lt.append(int(input('[{}번째] 1 이상의 정수 입력 ... ').format(count)))
    lt.append(int(input(f'[{count}번째] 1 이상의 정수 입력 ... ')))

    # if count == 5:
    #     break
    # count += 1

    # count += 1
    # if count == 6:
    #     break

    # count += 1
    # if count > 5:
    #     break

    if count > 4:
        break
    count += 1

print('누적 합 :',sum(lt)) 
# print(f'누적 합 : {sum(lt)}') 
print(f'입력된 값 모두 출력 :',lt)
# print(f'입력된 값 모두 출력 : {lt}')