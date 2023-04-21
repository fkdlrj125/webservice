# 문제 1. gugudan.txt 파일 마지막 위치에 리스트 변수 data 추가
# 한 라인에 요소 1개 쓰기

# [1]
data = ['one', 'two', 'three']
# with open('D:\webservice\python\p230418\gugudan.txt', 'a') as gugudan:
#     for num in data:
#         gugudan.write(num + '\n')

# [2]
# with open('D:\webservice\python\p230418\gugudan.txt', 'a') as gugudan:
    # gugudan.writelines([i+'\n' for i in data])
    # gugudan.writelines('\n'.join(data))
    # gugudan.write('안녕하세요\n') / 깨짐 - txt와 인코딩 타입이 다르기 때문에

# [3]
with open('D:\webservice\python\p230418\gugudan.txt', 'a') as gugudan:
    gugudan.write('\n'.join(data))