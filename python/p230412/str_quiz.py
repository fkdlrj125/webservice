# [문제] 문자열의 공백 제거 후 가운데 3자리 숫자 추출

numbering = 'a23 - 456 - bc321'
result = numbering.replace(' ', '').split('-')
print(result[1])
