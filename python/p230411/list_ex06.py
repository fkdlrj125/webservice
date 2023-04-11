# 리스트 요소 수정

data = ['하나', '둘', '셋', '넷']

# 인덱싱
print('요소 수정 전 data >> ',data)
data[1] = ['two']
print('요소 수정 후 data >> ',data)

# 슬라이싱
# data[:2] = 1 // type miss match data[:2] -> list
data[:2] = [1]
print('슬라이싱을 통한 요소 수정>> ',data)