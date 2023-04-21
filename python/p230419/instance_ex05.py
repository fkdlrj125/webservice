class GrandParent:
    def rich(self):
        print('부자다!')

class Sun:
    pass

class Parent:
    money = 1000000

    def buy(self, money):
        Parent.money -= money
        print(f'남은 돈 {Parent.money}원 입니다.')

class Child(Parent, GrandParent):

    def buy(self, money):
        print(f'부모님 용돈 {money}원 주세요')
        Parent.money -= money

    # def buy(self):
    #     print(f'부모님 남은 돈 {Parent.money}원 입니다.')


c = Child()
c.buy(100000)
# c.buy()
c.rich()

# 객체 소속
print('객체 c는 Child와 관련있나요...?', isinstance(c, Child))
print('객체 c는 Parent와 관련있나요...?', isinstance(c, Parent))
print('객체 c는 Child, Parent와 관련있나요...?', isinstance(c, (Child, Parent)))
print('객체 c는 Sun과 관련있나요...?', isinstance(c, Sun))
print('객체 c는 Sun과 관련있나요...?', isinstance(c, (Child, Sun)))


