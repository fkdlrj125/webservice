# 클래스 변수
class Person:
    count = 1

    # def __init__(self):
    #     print('생성자 실행됨')
    #     self.count = 1
    #     print(f'{self.count}번 사람 생성')
    #     self.count += 1

    def __init__(self):
        print(f'{Person.count}번 사람 생성')
        Person.count += 1

p1 = Person()
p2 = Person()
p3 = Person()
p4 = Person()
p5 = Person()