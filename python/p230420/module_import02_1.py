## 방법 2
# from module import value
# from module import show
# from module import Increment
# from module import value, show, Increment
# from module import *

# from pack.module import value, show, Increment
from pack import module

# 전역 변수 사용
print('value >>', module.value)

# 함수 호출
module.show()

# 인스턴스 생성
ic = module.Increment()
ic.showNumber(1)