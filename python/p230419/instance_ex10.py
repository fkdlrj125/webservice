# 클래스 정의
class Calculator:
    num = 1
    # 인스턴스 메소드
    def add(self, first, second):
        self.first = first
        self.second = second
        print('덧셈 >>', self.first + self.second)

    # 클래스 메소드
    @classmethod
    def sup(cls, n1, n2):
        print('뺄셈 >>', n1 - n2)

    # 정적 메소드
    @staticmethod
    def mul(a, b):
        print('곱셈 >>', a * b)

    @staticmethod
    def div():
        print('나눗셈')

# 메소드 호출
# 1) 인스턴스 메소드 호출 : 객체 생성 -> 호출
# cal = Calculator()
# cal.add(5, 6)

Calculator().add(5, 6)

# 2) 클래스 메소드 호출
Calculator.sup(1, 2)

# 3) 정적 메소드 호출
Calculator.mul(9, 9)
Calculator.div()
