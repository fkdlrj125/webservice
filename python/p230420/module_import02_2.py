## 방법 2
# from module import value
# from module import show
# from module import Increment
# from module import value, show, Increment
# from module import *

# from pack.module import value, show, Increment
from pack import module as md

# 전역 변수 사용
print('value >>', md.value)

# 함수 호출
md.show()

# 인스턴스 생성
ic = md.Increment()
ic.showNumber(1)