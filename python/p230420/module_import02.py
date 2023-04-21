## 방법 2
# from module import value
# from module import show
# from module import Increment
# from module import value, show, Increment
# from module import *

from pack.module import value, show, Increment

# 전역 변수 사용
print('value >>', value)

# 함수 호출
show()

# 인스턴스 생성
ic = Increment()
ic.showNumber(1)