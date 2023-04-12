st = 'Hello'

# 문자열 길이
print('st 길이', len(st))

# 특정 문자열 개수
print('l의 개수', st.count('l'))
print('He의 개수', st.count('He'))

# 공백 제거
st = '  Hello  '
print('공백 제거 전 st >> '+'|'+st+'|')
print('왼쪽공백 제거 후 st >> '+'|'+st.lstrip()+'|')
print('오른쪽공백 제거 후 st >> '+'|'+st.rstrip()+'|')
print('양쪽 공백 제거 후 st >> '+'|'+st.strip()+'|')

# 대소문자 변경
print('대문자 변경 >> ',st.upper())
print('소문자 변경 >> ',st.lower())

# 특정 문자 위치
print('find e의 위치 >> ',st.find('e'))
print('index e의 위치 >> ',st.index('e'))

print('find a의 위치 >> ',st.find('a'))
# print('index a의 위치 >> ',st.index('a'))

print('He의 위치', st.find('He'))

# 특정 문자 변경
print('ello를 i로 변경 >> ',st.replace('ello','i'))

# 문자열 나누기
print('e를 기준으로 나누기',st.split('e'))

# 특정 문자 추가
print('~ 추가', '~'.join(st))