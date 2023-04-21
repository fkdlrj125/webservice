# class 정의 
class Food:
    
    # 인스턴스 메소드
    def setSort(self, sort):
        # 인스턴스 변수
        self.sort = sort

    # 클래스 메소드 
    # @classmethod    # 데코레이터(decorator)
    # def show(cls,self):
    #     print(f'음식 종류는 {self.sort}입니다.')

    @classmethod    # 데코레이터(decorator)
    def show(cls,sort):
        print(f'음식 종류는 {sort}입니다.')

# 인스턴스 생성
pizza = Food()
pizza.setSort('피자')

# 클래스 메소드에선 인스턴스의 정보에 접근할 수 없기 때문에 인수로 넣어준다
# 인스턴스의 주소를 전달
# Food.show(pizza)

# 인스턴스의 인스턴스 변수 전달
Food.show(pizza.sort)