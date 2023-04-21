# 전역 변수
value = 10

# 함수 정의
def show():
    print('=' * 25)
    print('show 함수 실행')
    print('__name__', __name__)
    print('=' * 25)

# 클래스 정의
class Increment:
    def showNumber(self, number):
        self.number = number + 1
        print('1 증가된 값 >>', self.number)

if __name__ == '__main__':
    show()