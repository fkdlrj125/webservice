# 클래스 정의
class Thing:
    # 클래스 변수
    totalCount = 0

    # 생성자
    def __init__(self):
        print('생성자 실행됨')
        self.name = '상품'
        self.count = 0
        self.showInfo()
        Thing.totalCount += 1
        
    def setName(self, name):
        self.name = name

    def setCount(self,count):
        self.count = count

    def showInfo(self):
        print(f'{self.name}이고, 개수는 {self.count}개 있습니다.')

    # def showTotalCount(self):
    #     print(f'전체 상품 개수는 {Thing.totalCount}개입니다.')

    @classmethod
    def showTotalCount(cls):
        print(f'전체 상품 개수는 {Thing.totalCount}개입니다.')

# 인스턴스 생성
phone = Thing()
# phone.setName('갤럭시 폰')
# phone.setCount('5')
# phone.showInfo()
Thing.showTotalCount()

pen = Thing()
Thing.showTotalCount()