prompt = '''
---------------------------------
1. 추가
2. 삭제
3. 목록
4. 종료

번호 선택 = '''

number = 0

# 방법1. 조건
# while number != 4:
#     print(prompt, end=' ')
#     number = int(input())

# 방법2. 무한루프
while True:
    print(prompt,end=' ')
    number = int(input())

    if number == 4:
        break
