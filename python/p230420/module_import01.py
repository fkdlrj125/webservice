# 방법 1
import pack.module

# 전역 변수 사용
print('value >>', pack.module.value)

# 함수 호출
pack.module.show()

# 인스턴스 생성
ic = pack.module.Increment()
ic.showNumber(1)

print(dir(pack.module))