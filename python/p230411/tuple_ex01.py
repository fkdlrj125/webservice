lt = [1, 3, 5]
tu = (2, 4, 6)

# 리스트
print('lt >> ',lt)
print('lt >> ',type(lt))

# 튜플
print('tu >> ',tu)
print('tu >> ',type(tu))

# 인덱싱
print('첫 번째 요소 추출 >> ', tu[0])
print('마지막 요소 추출 >> ', tu[-1])

# 슬라이싱
print('첫 번째부터 두 번째 요소까지 추출 >> ',tu[:2])

# 연산자 : +
tu2 = (100, 200, 300)
print('+ 연산자 >> ', tu + tu2)

# 연산자 : *
print('* 연산자 >> ', tu * 2)

# [문제] 튜플 변수 tu의 인덱스1 요소를 400으로 변경
# tu[1] = 400     // 요소 수정 불가능
# tu.append(500)  // 요소 추가 함수 지원X
# del tu[1]       // 요소 삭제 불가능
