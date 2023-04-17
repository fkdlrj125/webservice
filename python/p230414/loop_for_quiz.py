# 문제 1. 2단 출력
print('='*50)
for r in range(1,10):
    print(f'2 * {r} = {2 * r}')
print('='*50, end='\n\n')

# 문제 2. 번호는 1번 부터 시작, 60점 이상인 학생의 번호와 점수 출력
# ** 출력 형태 **
# 1번 학생은 90점으로 합격입니다.
math = [90, 45, 60, 75, 50]

# 절차적 언어 특성으로 위에 선언된 변수 아니면 사용 불가
# string = f'{math.index(score)+1}번 학생은 {score}점으로 합격입니다.'

print('='*50)
# 1번
# for score in math:
#     if score > 59:
#         print(f'{math.index(score)+1}번 학생은 {score}점으로 합격입니다.')

# 2번
# for r in range(0,len(math)):
#     if math[r] > 59:
#         print(f'{r+1}번 학생은 {math[r]}점으로 합격입니다.')

# 3번
# [print(f'{r+1}번 학생은 {math[r]}점으로 합격입니다.') for r in range(0,len(math)) if math[r] > 59]


# 4번
# for idx, score in enumerate(math,1):
#     if score > 59:
#         print(f'{idx}번 학생은 {score}점으로 합격입니다.')

for m in enumerate(math,1):
    if m[1] > 59:
        print(f'{m[0]}번 학생은 {m[1]}점으로 합격입니다.')
    
print('='*50, end='\n\n')

# 문제 3. 60점 이상인 학생의 이름과 점수 출력
# ** 출력 형태 **
# 홍길동은 90점으로 합격입니다.

math = {'홍길동' : 90, '박보검' : 45, '이미자' : 60, '이길동' : 75, '하하' : 50}

print('='*50)

# 1번
# for name in math:
#     if math.get(name) > 59:
#         print(f'{name}은 {math.get(name)}점으로 합격입니다.')

# 2번
# for name, score in math.items():
#     if score >= 60:
#         print(f'{name}은 {score}점으로 합격입니다.')

# 3번
[print(f'{name}은 {score}점으로 합격입니다.') for name, score in math.items()  if score >= 60]

print('='*50, end='\n\n')
