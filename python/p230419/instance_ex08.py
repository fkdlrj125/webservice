# 클래스 정의
class Fruit:
    # 생성자
    def __init__(self):
        print('** 생성자 실행 **')

    # 클래스 메소드
    @classmethod
    def create(cls):
        print('<< 클래스 메소드 실행 >>')
        return cls()
    
class Banana(Fruit):
    # 생성자
    def __init__(self):
        print('바나나 생성자 실행됨')

    def like(self):
        print('바나나 좋아하나요?')

    def count(self, count):
        self.count = count
        print(f'바나나 {self.count}개 있다.')

# 클래스 메소드 호출
fruit = Fruit.create()
print(fruit)

banana = Banana.create()
banana.like()
banana.count(5)
print('banana 수 >>', banana.count)