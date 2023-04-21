비효율적인 코드 정리
    if value < 0:
        print('0미만의 수')
    elif value >=0 and value < 10:
        print('0이상 10미만의 수')
    elif value >=10 and value < 20:
        print('10이상 20미만의 수')
    elif value >=20 and value < 30:
        print('20이상 30미만의 수')
    else:
        print('30이상의 수') 

    if value < 0:
        print('0미만의 수')
    elif value < 10:
        print('0이상 10미만의 수')
    elif value < 20:
        print('10이상 20미만의 수')
    elif value < 30:
        print('20이상 30미만의 수')
    else:
        print('30이상의 수')  

리팩토링 - 결과와 상관없이 코드의 가독성을 높이는 과정

일처리 순서
1. 이해
2. 순서(절차)
3. 진행

변수의 종류와 타입 정확히 구분


배포할 때 트러블슈팅 정리

rdb - 