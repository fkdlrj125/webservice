# 문제 1

print('='*50)

def four_rules(n1, n2):
    print(f'{n1} + {n2} = {n1 + n2}')
    print(f'{n1} - {n2} = {n1 - n2}')
    print(f'{n1} * {n2} = {n1 * n2}')
    # print(f'{n1} / {n2} = {int(n1 / n2)}')
    print(f'{n1} / {n2} = {n1 // n2}')

four_rules(7,2)

print('='*50, end='\n\n')

# 문제 2

print('='*50)

def star_count(count):
    # for i in range(0,count):
    #     print('*',end='')
    print('*' * count)

star_count(7)

print('='*50, end='\n\n')

# 문제 3

print('='*50)

def accumulator(n1, n2):
    # [1]
    # if n1 > n2:
    #     bucket = n1
    #     n1 = n2
    #     n2 = bucket
    # print('누적 합 : ', sum(range(n1, n2 + 1)))

    # [2]
    # if n1 > n2:
    #     add = sum(range(n2, n1 + 1))
    # else:
    #     add = sum(range(n1, n2 + 1))

    # [3]
    # add = sum(range(n2, n1 + 1)) if n1 > n2 else sum(range(n1, n2 + 1))

    # [4]
    # if n1 > n2:
    #     add = sum(range(n1, n2 - 1, -1))
    # else:
    #     add = sum(range(n1, n2 + 1))

    # print('누적 합 : ', add)

    # 조건 연산자에 True 와 False일 때 결과가 하나만 존재해야 함
    # 조건 연산자에선 값이 여러 개 올 때 튜플로 묶어주지 않는다.
    max_value, min_value = (n1, n2) if n1 > n2 else (n2, n1)

    print('누적 합 :', sum(range(min_value, max_value+1)))

accumulator(1, 10)
accumulator(10, 1)

print('='*50, end='\n\n')

# 문제 4
print('='*50)

def positive(numbers):
    lt = list()

    for num in numbers:
        if num < 0:
            continue
        lt.append(num)

    return lt

positiveValue = positive([1, -2, 3, -4, 5])
print(positiveValue)

print('='*50, end='\n\n')

# 문제 5
print('='*50)

# 함수 안에서 변수를 만들면 함수를 호출할 때마다 
# 초기화하기 때문에 함수 밖에서 생성
student = {'info' : {}}

num = 1
def addInfo(**args):
    global num
    # [1]
    # student = {'info' : args}

    # [2]
    # student['info'].update(args)
    # student.update({'info' : args})

    # [3]
    # info의 value가 추가되게 수정

    # key : info
    # value : {num : args}
    # 존재하는 키값이기 때문에 호출하면 info의 value를 수정
    # student.update({'info' : {num : args}})

    # key : num
    # value : args
    # key값 info에 해당하는 value에 딕셔너리 추가
    student['info'].update({num : args})
    print('student >>', student)
    num += 1 

addInfo(name='kim', gender='female', score='2.34')
addInfo(name='park', gender='male', score='2.34')


print('='*50, end='\n\n')