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
    for i in range(0,count):
        print('*',end='')
star_count(7)
print()

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
    add = sum(range(n2, n1 + 1)) if n1 > n2 else sum(range(n1, n2 + 1))
    print('누적 합 : ', add)

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

print('='*50)

def addInfo(**args):

    # [1]
    # student = {'info' : args}

    # [2]
    student = dict()
    student.update({'info' : args})

    print('student >>', student)

addInfo(name = 'kim', gender = 'female', score = '2.34')

print('='*50, end='\n\n')