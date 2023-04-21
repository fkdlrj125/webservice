class Student:
    # def __init__(self):
    #     print('매개변수 1개인 생성자 실행됨!')
    
    # def __init__(self, name, age):
    #     print('생성자 실행됨!')
    #     self.name = name
    #     self.age = age

    def __init__(self, *args):
        print('생성자 실행됨')
        self.name, self.age = args

    def greeting(self):
        print('안녕하세요.')

    def setName(self, name):
        self.name = name

    def showInfo(self):
        print('제 이름은 ' + self.name + '입니다.')
        print(f'나이는 {self.age}세입니다.')

# 메소드 호출시 인수로 참조변수에 저장된 주소가 첫 번째로 무조건 넘어감
# 메소드에서 인스턴스 변수를 사용하기 위해 주소를 전달
print('[hong]')
hong = Student('홍길동', 29)
hong.greeting()     
# hong.setName('홍길동')
hong.showInfo()

print('\n[park]')
park = Student('박보검', 35)
park.greeting()
# park.setName('박보검')
park.showInfo()

print('\n[lee]')
# lee = Student()