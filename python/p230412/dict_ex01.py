hong = {'name' : '홍길동', 'age' : 35, 'address' : '서울 서대문구'}

print('hong >> ', hong)
print('hong의 타입 >> ', type(hong))
print('hong의 길이 >> ', len(hong))

# 키를 통한 값 추출
print('딕셔너리 변수 hong의 key name 접근',hong['name'])
print('나이 >> ',hong['age'])
# print(hong[0]) / dict은 index 사용X

# 요소 추가
hong['phone'] = '010-1111-1111'
print('hong >> ',hong)
print('hong의 길이 >> ', len(hong))

# 값 변경
hong['age'] = 100
print('hong >> ',hong)
print('hong의 길이 >> ', len(hong))

# 요소 삭제
del hong['address']
print('address 요소 삭제 후 hong >> ',hong)
print('hong의 길이 >> ', len(hong))

# 값 추출
print('[get 함수] 연락처 >> ',hong.get('phone'))
print('[key] 연락처 >> ',hong['phone'])

print('[get 함수] 주소 >> ',hong.get('address','주소 없음'))
# print('[key] 연락처 >> ',hong['address'])


# 키 추출
keys = hong.keys()
print('키 추출 >> ',keys)
print('키 추출 타입 >> ',type(keys))
# print('keys[0] >> ',keys[0])

keys_list = list(keys)
print('리스트로 타입 변경 >> ',keys_list)
print('keys_list의 타입 >> ',type(keys_list))
print('keys_list[1] >> ',keys_list[1])

# 값 추출
values = hong.values()
print('값 추출 >> ',values)
print('값 추출 타입>> ',type(values))

# 키 값 추출
items = hong.items()
print('key와 values 추출 >>', items)
print('key와 values 추출 타입>>', type(items))

# in 연산자
print('hong >> ', hong)
print('name' in hong)

print('홍길동' in hong.values())

# 요소 추가
print('hong >> ', hong)

# 1) 요소 1개 추가
hong.update({'주소' : '서울 강남구'})
print('주소 추가 후 hong >> ', hong)

# 2) 요소 여러 개 추가 
hong.update({'취미' : '쉬기', '특기' : '성실함'})
print('주소 추가 후 hong >> ', hong)

# 3) 존재하는 키 추가 - 값 수정
hong.update({'age' : 500})
print('age update >> ', hong)

# 모든 요소 삭제
hong.clear()
print('모든 요소 삭제 후 >> ', hong)

