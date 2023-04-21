# 클래스 정의
class Animal:
    count = 2

    def showInfo(self):
        self.age = 1
        print('저는 동물입니다.')

# 클래스 메소드 호출
# Animal.showInfo()

# 인스턴스 생성
one = Animal()
one.showInfo()
print('인스턴스 변수 age >>', one.age)
print('클래스 변수 count >>', Animal.count)
# print('클래스 변수 count >>', one.count)