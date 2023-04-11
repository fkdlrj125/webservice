# 리스트 함수 1

number = [5, 1, 6, 3, 4, 2]

# 정렬
# print('정렬 전 number >> ', number)
# number.sort()
# print('오름차순 정렬 후 number >> ', number)

alphabet = ['cat','banana','apple','egg','dog', 'car']
print('정렬 전 alphabet >> ', alphabet)
alphabet.sort()
print('오름차순 정렬 후 alphabet >> ', alphabet)

hangul = ['다락방', '나비', '가방', '라디오', '나방']
print('정렬 전 hangul >> ',hangul)
hangul.sort()
print('오름차순 정렬 후 hangul >> ',hangul)

print('역순 정렬 전 number >> ', number)
number.reverse()
print('역순 정렬 후 number >> ', number)

print('내림차순 정렬 전 number >> ',number)
number.sort(reverse=True)
print('내림차순 정렬 후 number >> ',number)