# 클래스 정의
class Cat:
    # 생성자
    def __init__(self):
        print('생성자 실행됨')

    # 메소드
    def showInfo(self):
        print('나는 고양이다!')

# 인스턴스 생성
one = Cat()
one.showInfo()

# GUI 생성에 사용
two = Cat   # 클래스의 주소 
two.__init__(Cat())    
two.showInfo()