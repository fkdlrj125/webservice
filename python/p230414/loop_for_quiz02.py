import random

# 문제 4. 사은품을 추첨하여 고객님께 제공하려고 합니다. 사은품은
# 랜덤을 추첨하되, 꽝이 나오는 순간 더 이상 추첨하지 않습니다.
# 꽝 이후 사은품 x, 0번부터 1번 고객
# 실행결과
# 1번은 지갑 당첨! 축하!
castLots = ['생수', '지갑', '꽝', '커피', '과자', '도서', '핸드폰', '노트북']
random.shuffle(castLots)
# for r in range(0, len(castLots)):
#     if castLots[r] == '꽝':
#         print(f'{r+1}번은 {castLots[r]}입니다.')
#         break
#     else:
#         print(f'{r+1}번은 {castLots[r]} 당첨! 축하!')

# count = 1
# for item in castLots:
#     if item == '꽝':
#         print(f'{count}번은 {item}입니다.')
#         break
#     else:
#         print(f'{count}번은 {item} 당첨! 축하!')
#     count += 1

for idx, item in enumerate(castLots, 1):
    if item == '꽝':
        print(f'{idx}번은 {item}입니다.')
        break
    else:
        print(f'{idx}번은 {item} 당첨! 축하!')

print(castLots)