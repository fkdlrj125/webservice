  [Python]
    - 라이브러리와 호환성을 위해 낮은 버전을 사용
    - 라이브러리와 가장 호환이 잘 되는 버전은 7버전
    - 절차지향과 객체지향의 특성을 둘 다 가지고 있음
      - 모든 것을 객체로 만들어 사용
      - 라인을 위에서 하나씩 처리
    - 라인을 하나씩 처리 -> 인터프리터 언어(대화형 언어)
    - 문자와 문자열을 구분하지 않음 -> '', "" 둘 다 표현 가능 / 내부적으론 ''로 관리
    - 파이썬 파일(.py) - Module(실행단위) - script(실행파일) / 파이썬파일은 script라 실행파일로 작동함
    - Java의 메소드 = 함수
    - 파이썬은 2버전과 3버전의 문법이 다름
    - 파이썬은 메모리를 알아서 관리해 메모리 할당, 해제를 자동으로 처리
    - 파이썬은 파이썬코드 외에 C나 C++로도 코드 제작이 가능하며 C나 C++로 작성한 코드는 보여지지 않는다

  [Type]
    - 정수형, 실수형은 있지만 크기가 고정되지 않음
    - 파이썬은 여러 개의 값은 항상 묶어서 관리

    - 타입 변환은 변환이 가능해야 함수 사용 가능
      - [하나의 값을 관리]
      정수형    int     int()
      실수형    float   float()
      논리형    bool    bool()

      - [여러 값을 묶어서 관리] - 요소의 타입이 달라도 묶을 수 있음(문자열 제외)
      문자형    str     str()     '',""
      리스트    list    list()    []
      튜플      tuple   tuple()   ()
      딕셔너리  dict    dict()    {}
      집합      set     set()     {}

      - None : 아무 것도 없는 상태

      ○ mutable : 변경 가능한 타입
        - 리스트, 딕셔너리

      ○ immutable : 변경 불가능한 타입
        - 정수, 실수, 문자열, 튜플

  [Variable]
    - 타입을 지정하지 않고 변수를 생성
    - 타입을 지정하지 않아 어떤 타입이든 대입가능
    - 파이썬에서 변수는 주소를 저장 - 참조변수
    - 파이썬에서 실행이 종료되기 전까지 생성한 변수 사용 가능

    ● [변수의 종류]
      ○ 전역 변수 : 함수 외에 생성된 변수
      ○ 지역 변수 : 함수 내에 생성된 변수

      <<클래스 내>>
      ○ 인스턴스 변수 : 메소드 내에서 생성된 변수
      ○ 클래스 변수 : 클래스 내에 생성된 변수
                      static 변수와 동일

  [Operator]  
    [대입 연산자]
      = : 대입 연산자
        - 대입 연산자 왼쪽에 여러 개의 변수가 올 수 있음
          대입할 값은 변수의 수와 같아야 함
        ex) n1, n2 = 5, 3

    [산술 연산자]
      +  : 덧셈
      -  : 뺄셈
      *  : 곱셈
      ** : 제곱
      /  : 몫1(소수점까지)
      // : 몫2(정수까지)
      %  : 나머지

    [관계 연산자] - True, False도 클래스라 대문자로 시작
      >  : 크다, 초과
      >= : 크거나 같다, 이상
      <  : 작다, 미만
      <= : 작거나 같다, 이하
      == : 같다
      != : 다르다

    [논리 연산자]
      and : 교집합 - 이항연산자
      or  : 합집합 - 이항연산자
      not : 여집합 - 단항연산자
      - 컴퓨터가 논리값을 정수로 바꿀 땐 2진수로 바꿔 
        True = 1, False = 0으로 고정
      - 정수를 논리값으로 바뀔 땐 0을 제외한 나머지를 모두 True로 바뀜

    [조건 연산자]
      True일때 if 조건 else False일때
      - 조건이 True일 때 왼쪽 영역 실행 조건이 False일 때 else 오른쪽 영역 실행
      - 조건 연산자에 True 와 False일 때 결과가 하나만 존재해야 함
      - 조건 연산자에선 값이 여러 개 올 때 튜플로 묶어주지 않는다.

    [연산자]
      - del : 요소 삭제
      - in  : - 여러 값 : 포함 여부 확인
              - 반복문 : 여러 값의 요소 
      - +   : concatenate - 문자열 연결
        - 문자열 + 정수 - Error
        - 정수 + 문자열 - Error

  [function]
    [내장 함수]
      ○ type(Object) - class 타입

      ○ id(Object) - 주소값

      ○ len(Object) - 길이

      ○ max(args,Iterable) - 최댓값

      ○ sum(Iterable) - 입력값의 합

      ○ range(start, stop, step) - 시작 위치 ~ 끝-1만큼 숫자 생성(튜플)
        - 끝 값만 입력하면 0 ~ 끝-1까지
        - 시작, 끝, 간격을 입력하면 시작 ~ 끝-1까지 증감폭만큼 증감하는 숫자 생성
          - 증감폭이 맞지 않으면 실행X
        - 많은 양의 데이터를 만드는 데 효율적이지 않음

      ○ enumerate(Iterable, start) - 반복문이 실행될 때 자동으로 증가하는 값 생성
        - 리턴 : 튜플
        - 기본 시작 값 : 0

        ex) for score in enumerate(math):
              print(score)
            (0, 90)
            (1, 45)
            (2, 60)
            (3, 75)
            (4, 50)

      ○ eval(str) - 입력받은 문자열을 정수, 실수로 구분

      ○ '추가할 문자'.join(Iterable) - 요소 사이에 문자 추가

      ○ isinstance(객체명, 클래스명) - 타입비교 - True/False 리턴
        ex) isinstance(5,int)
            True

        여러 타입 비교 - or 연산
        ex) isinstance(Child(),(Child, Parent))
            True

      ○ dir() - 파일의 정보를 리턴
        ex) dir(pack.module)
            ['Increment', '__builtins__', '__cached__', '__doc__', '__file__', '__loader__', '__name__', '__package__', '__spec__', 'show', 'value']

    [외장 함수]
      [random]
        - shuffle
          ex) random.shuffle(여러 값)
        
        - random
          ○ uniform(start, stop) - min ~ max 사이의 실수 리턴 

          ○ randrange(start, stop) - min ~ max 사이의 정수 리턴

          ○ choice(Iterable) - 입력한 값들 중 랜덤으로 리턴
          
  [list]
    - [요소1, 요소2, 요소3, ...]
    - 저장 순서가 보장
    - 2차원 배열형식처럼 리스트 내 리스트에 접근 가능
      ex) data = [2, 3.5, [1, 3, 5],'Hello']
          data[2][-1] -> 5

    - indexing : index로 요소에 접근 - 0부터 시작
      ex) data[0]
      - 해당 타입으로 반환

    - 인덱스 시작 기준을 바꿀 수 있음
      ex) data[-1] -> 마지막 인덱스 접근
          data[-2] -> 마지막-1 인덱스 접근

    - slicing : 연속된 여러개 요소 추출 / 범위에 해당되는 결과를 복사
      ex) data[0:2] -> 끝값은 제외

      - 원래 타입 그대로 반환

      - 시작 값을 생략하면 처음부터 추출
        ex) data[:2] -> 0~1

      - 끝 값을 생략하면 끝까지 추출
        ex) data[2:] -> 2~마지막

      - 시작 값과 끝 값을 생략하면 모두 추출
        ex) data[:] -> data와 결과는 같음
        - 대입을 해줄 때 
          a = data    -> 리스트의 주소를 대입해 a를 수정하면 data의 값도 변함
          a = data[:] -> 리스트의 요소들을 복사한 후 대입해 a를 수정해줘도 data의 값이 변하지 않음

    - step(증감폭)
      - [start : end : step]
      - 기본값 1
      - 양수는 증가, 음수는 감소(자동으로 역순)
    
    - 리스트 연산자

      + : 리스트 요소 합치기
        ex) even = [2,4,6,8]
            odd = [1,3,5,7]
            even + odd -> [2, 4, 6, 8, 1, 3, 5, 7]

      * : 리스트 요소 반복
            even * 3 -> [2, 4, 6, 8, 2, 4, 6, 8, 2, 4, 6, 8]

    - 리스트 함수
      
      [정렬](문자(영어, 한글), 숫자 전부 가능)
        문법 : 리스트.sort() : 오름차순
        문법 : 리스트.sort(reverse=True) : 내림차순

        - 문자열일 경우 시작문자부터 비교, 같으면 다음 문자 비교
          ex) 정렬 전 alphabet >>  ['cat', 'banana', 'apple', 'egg', 'dog', 'car']

          오름차순 정렬 후 alphabet >>  ['apple', 'banana', 'car', 'cat', 'dog', 'egg']
      
      [역순]
        문법 : reverse() : 리스트를 역순으로 만듦

      [특정 요소의 인덱스]
        문법 : 리스트.index(요소)

        - 왼쪽부터 탐색해서 처음으로 만난 인덱스 리턴
        - 해당 요소가 없다면 에러

      [요소 추가 : 마지막 위치]
        문법 : 리스트.append(값)

      [요소 추가 : 특정 위치]
        문법 : 리스트.insert(인덱스, 값)

      [요소 추가/확장 : 여러 요소 추가]
        문법 : 리스트.extend(리스트)
        - 리스트 연산자 + 와 같은 효과
        - 마지막에 추가

      [요소 제거]
        문법 : 리스트.remove(요소)

      [요소 제거 : 요소 리턴]
        문법 : 리스트.pop() -> 마지막 요소 리턴
        문법 : 리스트.pop(인덱스)

      [요소 제거] - 리스트 함수X
        문법 : del 리스트[인덱스]
        - 인덱싱 형식

        문법 : del 리스트[start:end]
        - 슬라이싱 형식
        - 여러 요소 제거 가능

      [특정 요소 개수]
        문법 : 리스트.count(요소)

    - 리스트 요소 수정
      - 인덱싱
        - 지정한 인덱스 요소 수정

      - 슬라이싱
        - 여러 값 수정
        - 반복가능한 값, 여러 값 형태만 대입 가능

  [Tuple]
    - *튜플과 리스트간에 변경은 자유롭게 가능*
    - 여러 값을 묶어서 하나의 데이터 형태로 관리
    - (요소1, 요소2, 요소3)
    - 인덱스로 요소에 접근(0부터 시작)
    - 저장 순서가 보장
    - 요소의 추가, 삭제, 수정이 불가능
    - 요소의 변경이 없는 상태를 유지할 때 사용
    - 파이썬에서 여러 값을 기본적으로 튜플로 관리
      ex) tu3 = 5, 7, 9 -> (5,7,9)
          n1, n2 = 5, 3 -> n1 = 5, n2 = 3
    - 튜플에서 변경은 요소의 주소 변경을 의미

    - 괄호가 있어도 요소가 1개일 때 int와 구분이 되지 않아 요소 뒤에 ',' 추가
      ex) tu2 = (5) -> 5
          tu2 = (5,) -> (5,)

    [연산자] - 요소를 복사해 사용 가능

      + : 두 튜플의 요소를 합침

      * : 튜플을 x번 반복함

    [함수]

      .index(요소) : 요소 인덱스 확인

      .count(요소) : 요소 개수 확인

  [리스트와 튜플 저장]
    - 리스트와 튜플은 요소에 주소를 저장 -> 요소의 변경은 주소의 변경
    - 리스트와 튜플은 배열 형식으로 저장되지만 요소들은 연속된 주소를 가지지 않음
  
  [Str]
    - ' ', " "로 표현
    - 여러 라인을 표현할 땐 ''' ''', """ """
    - 여러 라인 주석도 문자열이지만 변수에 저장을 하지 않아 다음에 사용이 불가능한 문자열
    - 문자열로 묶은 따옴표와 다른 따옴표는 인식이 안됨
      - 같은 따옴표를 사용할 땐 따옴표 앞에 '\'를 붙이면 사용 가능

    [escape 문자]
      - '\' + 특정 문자 -> 특수 문자로 제어 시퀀스를 실행
        ex) \n : 개행문자(줄바꿈)
            \t : tab
            \', \" : ', "을 문자취급
            \\ : \를 문자취급

    - 인덱싱, 슬라이싱 사용 가능

    -[문자열 연산자]-
      
      + : 이어줌

      * : 반복

    -[문자열 함수]-

      [특정 문자열 개수]
        - 문법 : 문자열.count(문자)

      [공백 제거]
        - 문자 사이의 공백은 지우지 못 함

        [왼쪽 공백 제거]
          - 문법 : 문자열.lstrip()

        [오른쪽 공백 제거]
          - 문법 : 문자열.rstrip()

        [양쪽 공백 제거]
          - 문법 : 문자열.strip()

      [대소문자 변경]
        [대문자 변경]
          - 문법 : 문자열.upper()
        [소문자 변경]
          - 문법 : 문자열.lower()

      [특정 문자의 인덱스(대소문자 구분)]
        - 문법 : 문자열.find(찾고자 하는 문자열)
          - 없는 문자열을 찾으면 -1

        - 문법 : 문자열.index(찾고자 하는 문자열)
          - 없는 문자열을 찾으면 error

      [특정 문자 변경]
        - 문법 : 문자열.replace('old', 'new')

      [문자열 나누기]
        - 문법 : 문자열.split(나누고자 하는 문자)
          - 기준이 된 문자는 결과에 포함되지 않음
          - split 실행 결과는 list로 반환

      [특정 문자 추가] - 요소 사이마다 추가
        - 문법 : '추가할 문자'.join(문자열)
        - 문법 : '추가할 문자'.join(여러값)
    
    -[문자열 포맷]-
      
      [문자열 포맷 코드(서식문자)]
        - %s : 문자열(string)
        - %c : 문자
        - %d : 정수
        - %f : 실수
        - %% : 문자 % 
      
      [서식문자 사용법]
      ex) print('사과가 %d개 있고, 바나나는 %d개 있다.'
      %(apple,banana))
          사과가 5개 있고, 바나나는 7개 있다.

      - 서식문자가 1개일 때 소괄호를 생략 가능
      ex) print('%d'%apple)
          5

      - 서식문자가 포함된 문자열을 변수에 저장해서 사용 가능 
      
      =[정수]=
      [자릿수 지정]
        ex) print('%4d'%apple) -> apple을 4자리로 표현 / 기본은 오른쪽 정렬
            ___5 -> 비어있는 자리는 공백
        
        ex) print('%04d'%apple) -> apple을 4자리로 표현 공백은 0으로 표현 / 서식문자는 공백표현은 0으로만 가능
            0005 -> 비어있는 자리는 0

        ex) print('%-4d'%apple) -> 왼쪽 정렬
            5___ -> 왼쪽정렬은 비어있는 자리는 0으로 표현 불가 / 데이터의 변형이기 때문에
        
        - 데이터의 길이가 자릿수보다 길다면 왼쪽정렬

      [양수 표현]
        ex) print('%+d'%apple) 
            +5
        - 음수는 음수표현 그대로 표현

      =[실수]=
        ex) print('현재 실수는 %f입니다.'%fo)
            현재 실수는 2.340000입니다.
        - 실수는 기본으로 소수점 6자리까지 표현

      [소수점 자리] - 소수자릿수는 강제성 있음
        ex) print('현재 실수는 %.2f입니다.'%fo)
            현재 실수는 2.34입니다.

        ex) print('현재 실수는 %.1f입니다.'%fo)
            현재 실수는 2.3입니다.
        - 지정한 소수점아래는 반올림

      [전체 자릿수]
        ex) print('%5.2f'%fo) - 정수, ., 소수 전부 포함해서 자릿수 표현
            _2.36

        - 표현할 자릿수가 전체 자릿수보다 작다면 그냥 출력

      =[문자]=
        - 아스키 코드값으로도 표현 가능
        - 숫자(아스키 코드값)로 문자, 정수 둘 다 표현 가능하지만, 문자로는 정수표현 불가능(파이썬은 문자개념이 없기 때문에)

      =[문자열]=
        - 모든 타입은 문자열로 표현 가능하지만 모든 문자열은 모든 타입으로 표현 가능하진 않다

      =[%%]=
        - 문자열 안에 서식문자를 사용했을 때 %표현은 모두 서식문자로 취급
        - 서식문자를 사용한 문자열에서 %를 사용할 땐 %%로 표현 

    -[format]-
      - 문법 : 문자열.format()
      - 문자열{}.format(값)
        ex) print('사과가 {}개 있고, 바나나는 {}개 있다.'.format('two',banana))
            사과가 two개 있고, 바나나는 7개 있다.

        - 서식 문자를 적지 않아도 자동으로 표현

        ex) print('사과가 {0}개 있고, 바나나는 {1}개 있다.'.format('two',banana))
            사과가 two개 있고, 바나나는 7개 있다.

        - {} 안에 인덱스가 들어있어 서식문자를 안 적어도 사용 가능

        ex) print('사과가 {0}개 있고, 바나나는 {0}개 있다.'.format(apple))
            사과가 5개 있고, 바나나는 5개 있다.

        - {} 안에 같은 인덱스를 적어 중복 사용 가능

      =[f 문자 포맷팅]= : 3.6부터 지원
      
        ex) print(f'사과가 {apple}개 있고, 바나나는 {banana}개 있다.')
            사과가 5개 있고, 바나나는 7개 있다.

        - 변수로 저장해서 사용 가능
        ex) fruit = f'사과가 {apple}개 있고, 바나나는 {banana}개 있다.'
      
        [자릿수 지정]
        
          ex) print(f'{apple:7}')
              ______5

          - 공백 지정
          ex) print(f'{apple:07}')
              0000005
          
          - 왼쪽 정렬
          ex) print(f'{apple:<7}')
              5______

          - 오른쪽 정렬
          ex) print(f'{apple:>7}')
              ______5

          - 가운데 정렬
          ex) print(f'{apple:^7}')
              ___5___

          - 정렬 공백 지정(정렬기호 왼쪽에 기호를 적어 공백 지정을 하면 다른 기호도 사용 가능)
          ex) print(f'{apple:=^7}')
              ===5===

          ex) print(f'{apple:!^7}')
              !!!5!!!

  [Dictionary]
    - Json타입을 Python에서 사용하기 위해 만든 자료형

    - {key : value, key : value} 형태로 요소를 저장
    ex) hong = {'name' : '홍길동', 'age' : 35, 'address' : '서울 서대문구'}

    - 저장 순서 보장X -> 인덱스 사용X
      - 변경이 없어도 순서가 유지 안 될 수도 있음
        ex) dc = {'이름' : '홍길동', '나이' : 35, '이름' : '박보검', '주소' : '서대문구'}
            dc >>  {'이름': '박보검', '나이': 35, '주소': '서대문구'}

    - 키로 값 접근 - 키는 값을 구분하는 기준 -> 중복X, 변경X
      - 변수[key]
        ex) print(hong['name'])
        홍길동

      - 키는 변경 불가능한 타입만 올 수 있음 -> 문자 상수, 정수 상수, 실수 상수, 튜플

      - 존재하지 않는 키에 접근하면 error

      - 키가 중복되면 데이터에 변형이 생겨 사용X
        - 중복된 키는 뒤에 오는 키의 값을 따라감

      - ***key값이 정수일 수도 있기 때문에 데이터의 타입을 항상 확인해야 함***

    -[요소 추가]- 
      - 딕셔너리[키] = 값
        ex) hong['phone']='010-1111-1111'
            hong >>  {'name': '홍길동', 'age': 35, 'address': '서울 서대문구', 'phone': '010-1111-1111'}

    -[값 변경]-
      - 딕셔너리[기존 키] = value
        ex) hong['age'] = 100
            hong >>  {'name': '홍길동', 'age': 100, 'address': '서울 서대문구', 'phone': '010-1111-1111'}

    -[요소 삭제]-
      - del 딕셔너리[키]
        ex) del hong['phone']
            hong >>  {'name': '홍길동', 'age': 100, 'address': '서울 서대문구'}

    -[딕셔너리 함수]-
      
      =[값 추출]=
        - 딕셔너리.get(키)
          ex) hong.get('phone')
              연락처 >>  010-1111-1111
        
        - 존재하지 않는 키값을 넣으면 None 출력
        - 키가 없을 때 보여줄 값을 설정 가능
          ex) hong.get('address', '주소 없음')
              주소 >>  주소 없음

      =[키 추출]=
        - 딕셔너리.keys()
          ex) hong.keys()
              dict_keys(['name', 'age', 'phone'])
          
        - 리턴 : dict_keys타입 -> 기본타입X -> 리스트로 감싸짐
          - 인덱스로 접근 불가능 -> 리스트 변환 후 사용 or 반복문 사용
      
      =[값 추출]=
        - 딕셔너리.values()
          ex) hong.values()
              dict_values(['홍길동', 100, '010-1111-1111'])

        - 리턴 : dict_values타입 -> 기본타입X -> 리스트로 감싸짐
           - 인덱스로 접근 불가능 -> 리스트 변환 후 사용 or 반복문 사용

      =[키 값 추출]=
        - 딕셔너리.items()
          ex) hong.items()
              dict_items([('name', '홍길동'), ('age', 100), ('phone', '010-1111-1111')])

        - 리턴 : dict_items타입 -> 기본타입X -> 키 값 쌍은 튜플로, 튜플은 리스트로 감싸짐
           - 인덱스로 접근 불가능 -> 리스트 변환 후 사용 or 반복문 사용

      =[존재 여부]= / 연산자
        - 값 in 여러 값(리스트, 튜플, 문자열 ...)
          ex) print('name' in hong)
              True
        
        - 기본적으로 딕셔너리는 키를 기준으로 확인
        - 다른 문법에서는 다른 의미로 사용

      =[요소 추가]=
        - 딕셔너리.update({키 : 값,...})
          ex) hong.update({'주소' : '서울 강남구'})
              {'name': '홍길동', 'age': 100, 'phone': '010-1111-1111', '주소': '서울 강남구'}

          ex) hong.update({'취미' : '쉬기', '특기' : '성실함'})

          ex) hong.update({'age' : 500})
          - 존재하는 키를 update하면 값 수정

      =[모든 요소 삭제]=
        - 딕셔너리.clear()
          ex) hong.clear()
              모든 요소 삭제 후 >>  {}

  [Set]
    - 수학의 집합을 표현하기 위해 사용

    - {요소1, 요소2, 요소3} 형태로 저장
      ex) s = {4, 1, 5, 7, 1, 5}

    - 저장 순서 보장 X -> 인덱스 사용 X
    - 중복값 저장 X
      ex) s >>  {1, 4, 5, 7}

    -[집합의 함수]-

      =[요소 추가]=

        [요소 1개 추가]
        - 집합.add(값)
          ex) s.add(6)

        [요소 여러 개 추가]
        - 집합.update(여러 값) - 딕셔너리 제외

      =[특정 요소 제거]=

        - 집합.remove(요소)
          ex) s.remove(8)

    -[집합]-
      ex)
      s1 = {2, 4, 6, 8}
      s2 = {1, 2, 3, 4, 5}

      =[교집합]=
        [연산자]
          - 집합 & 집합
            ex) s1 & s2
                {2, 4}
        [함수]
          - 집합.intersection(집합)
            ex) s1.intersection(s2)
                {2, 4}

      =[합집합]=
        [연산자]
          - 집합 | 집합
            ex) s1 | s2
                {1, 2, 3, 4, 5, 6, 8}
        [함수]
          - 집합.union(집합)
            ex) s1.union(s2)
                {1, 2, 3, 4, 5, 6, 8}

      =[차집합]=
        [연산자]
          - 집합 - 집합
            ex) s1 - s2
                {8, 6}
        [함수]
          - 집합.difference(집합)
            ex) s1.difference(s2)
                {8, 6}

      =[여집합]=
        [연산자]
          - 집합 ^ 집합
            ex) s1 ^ s2
                {1, 3, 5, 6, 8}
        [함수]
          - 집합.symmetric_difference(집합)
            ex) s1.symmetric_difference(s2)
                {1, 3, 5, 6, 8}

  [Bool]
    - 값   : True, False
    - type : bool
    - 함수 : bool(값) -> bool 리턴

       정수(10진수)            논리
           0                   False
    0을 제외한 모든 수         True

          문자                     
           ''                  False
    모든 문자(공백 포함)       True

         리스트
           []                  False
          
  [Copy]
    - 깊은 복사 : 주소 복사 -> 원본과 사본 모두 영향
      - 컴퓨터 기준에서 주소만 복사해 작업이 간결
    - 얕은 복사 : 데이터 복사 -> 원본과 사본 영향X
      - 해당 데이터의 값을 복사 후 생성해 작업이 복잡

      =[함수]=
        - 변수.copy()

      =[슬라이싱]=
        - 변수[:]
  
  [제어문] 

    -[조건문]-
      - 특정 상황에서 코드를 사용하기 위해 사용

      =[조건 1개]=
        - if 조건식: 
              명령어 -> 들여쓰기(인던트)로 영역
                        (레벨) 설정, 관용적으로 4칸

      =[조건 2개]=
        - if 조건식:
              명령어
          else:
              명령어

      =[조건 3개]=
        - if 조건식:
              명령어
          elif 조건식:
              명령어
          else:
              명령어
    
    -[반복문]-
      - 특정 코드를 연속해서 실행하기 위해 사용

      =[while]=
        - 초기값
          while 조건식:
              실행부    -> 들여쓰기로 영역 구분
              증감식

      =[for]=
        - for 변수 in 여러값:
              실행부
        - 여러 값의 요소만큼 반복문 실행 - 변수에는 여러 값의 요소 저장

        - for에서 받는 요소가 여러 값 형태라면 변수로 여러 개를 받을 수 있음
          ex) data = [(2, 5), (1, 4), (3, 6)]

              for first, last in data:
                print(f'first : {first}, last : {last}')
              -> first, last = (2, 5)
              -> (first, last) = (2, 5)

              first : 2, last : 5
              first : 1, last : 4
              first : 3, last : 6

        [리스트 내포] -> 리스트안에 for문
          - 명령어가 1개만 있을 경우 간결하게 표현
            - 명령어가 2개 이상일 땐 사용 불가
          
          - 간단한 일반 for문을 1줄로 표현
          - 반복문이 실행되면서 리스트, 집합에 추가

          [명령어 for 변수 in 여러값]
            ex) [print(r, end=' ') for r in range(1,10)]
                1 2 3 4 5 6 7 8 9 
          
          [변수 for 변수 in 여러값] 
            ex) even = [r for r in range(2, 11, 2)]
                even >>  [2, 4, 6, 8, 10]

          [명령어 for 변수 in 여러값 if 조건식]
            ex) [print(r, end=' ') for r in range(1, 11) if r % 3 == 0]
                3 6 9

          [조건식을 포함한 리스트 요소 추가]
            ex) even_two = [r for r in range(1, 10) if r % 2 == 0]
                [2, 4, 6, 8] 

    [pass]
      - 문법의 형태를 맞춰주며 실행은 하지 않을 때 사용
      ex) if num > 0:
              pass
    
    [break]
      - 반복문 내에서 사용
      - if문과 같이 사용
      - break가 실행되면 반복문 탈출

    [continue]
      - 조건이 만족할 때 특정한 코드를 실행에서 제외
      - 반복문 내에서 사용
      - if문과 같이 사용
      - continue가 실행되면 반복문의 조건식으로 이동
    
  [출력 함수 : print]
    - help(내장함수) -> 내장함수의 정보
    - print(value, ..., sep=' ', end='\n', file=sys.stdout, flush=False)
      - value : 인수
      - sep   : 매개변수 / 값 사이에 들어가는 문자
      - end   : 매개변수 / 마지막 값 뒤에 추가되는 문자
      - file  : 매개변수 
      - flush : 매개변수  

      - 매개변수를 수정할 땐 값 뒤에 추가
      ex) print('one', 'two', sep='-')
          one-two
      - 매개변수 사이엔 순서 X 

    -[file]- / 쓰기함수를 사용하는 것이 좋음
      절대경로 : 'D:\\webservice\\python\\p230413\\test.txt'
      상대경로 : 'test.txt'
      권한 : w(쓰기), r(읽기)

  [입력 함수 : input]
    - input(출력할 내용)
    - 터미널에서 입력받은 데이터는 외부에서 오는 데이터라 파이썬이 데이터를 받을 때 문자열로 데이터를 받음

    -[eval()]-
      - eval(str)
      - 입력받은 문자열을 정수, 실수로 구분

      =[여러 값 받기]=
        - ','로 여러 값 받기 가능
          ex) 숫자 2개 입력...2, 4
              one >>  (2, 4) - 여러 값은 튜플로 저장

  [Function]
    - 반복되지만 비연속적인 코드

    - 자주쓰는 코드에 이름을 붙인 것

    - 함수는 호출돼야만 사용 가능

    - 함수의 실행이 종료되면 함수를 호출한 곳으로 돌아감

    - 매개변수와 인수의 개수가 일치해야 실행 가능

    - 똑같은 함수명으로 함수를 정의해도 Error X 
      나중에 정의한 함수로 정의

    - 값을 여러 개 리턴하면 튜플로 묶어서 리턴
      - 인수를 여러 개 넘기면 Error -> 인수를 자동으로 묶으면 인수의 개수를 파악하지 못해 묶지 않음
      ex) return 100, 200 -> return (100, 200)

          def add(num):
          add(3, 5) -> Error

    - 기본적으로 함수 오버로딩 불가능

    ● [함수 정의] 
      ○ def 함수명(매개변수, 매개변수):
            명령어
            명령어
            return 값 
    
    ● [함수 호출] - ※절차지향적 특성때문에 먼저 정의된 함수만 사용 가능※
      ○ 함수명(인수1, 인수2)

    ● [함수 정의 형태]
      - 매개변수 o, return x
      - 매개변수 o, return o
      - 매개변수 x, return x
      - 매개변수 x, return o

    ● [함수 내 변수] - stack에 생성
      - 지역 변수 : 함수 내에서 생성한 변수
      - 기본적으로 함수 내에서 전역 변수 사용 불가
      - 지역 변수는 함수 실행이 종료되면 메모리에서 삭제 
      - 함수 내 해당 변수가 없다면 전역 변수에 접근

      ○ [전역 변수 선언]
        ◎ global 변수명
    
    ● [가변 매개 변수]
      ○ *변수명(튜플)
        ex) def add(n1, n2, *args)

      ○ **변수명(딕셔너리)
        ex) def add(**args)
            add(홍길동=90) - 홍길동 : 변수
                             90 : 값
        -> 인수로 변수와 값을 넣어주면 자동으로 key : value 형태로 저장, 변수는 자동으로 문자열로 변경

      - 추가적인 매개 변수를 받을 때 사용
      - 인수가 없어도 되고, 있다면 1개 이상

    ● [기본값 설정]
      ○ 매개변수 = 값
        ex) def default_func(arg=0):
                print('arg >>',arg)

      - 인수가 없을 때 사용하는 값

      - 인수가 입력되면 사용X

      - 기본값이 설정된 매개변수와 기본값이 설정되지 않은 매개변수가 같이 오면 기본값을 설정한 매개변수는 오른쪽 끝부터 채워 넣는다
        - 기본값을 설정한 매개변수가 중간이나 처음에 온다면 기본값을 설정하지 않은 매개변수에만 값을 넣어줄 수 없기 때문에 Error
        ex) def default1(a = 1, b = 2, c):
                print(f'a : {a}, b : {b}, c : {c}')
      
      - 매개변수를 지정해서 값을 입력가능
        ex) default(a=1,c=3)
            a : 1, b : 2, c : 3

    ● [namespace]
      - 공간에 붙인 이름
      - 변수를 사용가능한 영역

      ○ [전역]
        - globals()

      ○ [지역]
        - locals()

  [File]
    ● [모드]
        ○ w - 쓰기(이전에 있는 내용을 지우고 내용을 덮어 씌움)
        ○ a - 쓰기(이전에 있는 내용 뒤에 추가)
        ○ x - 쓰기(해당 파일이 존재하지 않으면 작성)
        ○ r - 읽기(해당 파일의 내용을 읽어옴)

    ● [인코딩 / 디코딩]
        - 사람이 쓰는 언어 -> 컴퓨터 언어 : 인코딩 
          컴퓨터 언어 -> 사람이 쓰는 언어 : 디코딩

        - 고수준 언어(high level language) : Java, Python -> 사람이 쓰는 언어에 가까운 언어

        - 저수준 언어(low level language) : c언어 -> 기계가 쓰는 언어에 가까운 언어

    ● [파일 쓰기]
      1. open 함수 : 모드 - w(write), a(append), r(read), x(exist)
        ○ open('경로\파일명.확장자 or 파일명.확장자, '모드')
          ex) file = open('new.txt', 'w')
              - 상대경로는 IDE(IDLE)마다 파일이 생성되는 위치가 다름
                VSC는 열려있는 폴더의 최상위 경로에 파일 생성
                IDLE는 현재 위치에 파일 생성

          ex) file = open('D:\webservice\python\p230418\gugudan.txt', 'a')
              - 절대경로는 디스크 위치부터 시작
              - 경로에 의도치 않은 이스케이프문자가 발생할 수 있어 처리를 해줘야함

          - 리소스 할당
          - 기본 모드 : r(읽기) + t(문자)
          - 기본 인코딩 : cp949
            - 가장 많이 쓰는 인코딩 : utf-8
            - 인코딩 변경
              ex) file = open('numberTwo.txt', 'a', encoding='utf-8')

      2-1. write 함수 
        ○ open한 파일.write()
          ex) file.write('내용')

        - w모드 : 기존에 있던 내용을 지우고 새로운 내용으로 덮어씀
        - a모드 : 기존에 있던 내용에 새로운 내용을 붙임
        - 기본적으로 줄바꿈 X -> 줄바꿈을 원하면 \n입력
        - 파일에 적을 땐 숫자와 문자의 개념이 의미가 없기 때문에 모두 문자로 바꿔 적어줌

      2-2. writelines 함수
        ○ open한 파일.writelines(Iterable)
          ex) gugudan.writelines(data)

      3. close 함수
        ○ open한 파일.close()
          ex) file.close()
        
        - 리소스 해제

    ● [파일 읽기]
      1. open 함수 : 모드 - r
         ex) open('D:\webservice\python\p230418\gugudan.txt', 'r')
         - 인코딩마다 같은 표현도 값이 다르기 때문에 파일을 열 때 인코딩을 맞춰서 열어줘야 한다

      2. readline 함수, readlines 함수, read 함수
        ○ readline()
          - 라인 한 줄을 읽어온 후 해당 위치를 저장
          ex) line = gugudan.readline()
              line >> 2 * 1 = 2
        
        ○ readlines()
          - 파일 전체 줄을 읽어온 후 저장
          ex) lines = gugudan.readlines()
          
          - 파일의 모든 내용을 문자열로 묶은 후 리스트에 저장해 리턴

         ○ read()
          - 파일 전체 줄을 읽어온 후 저장
          ex) lines = gugudan.read()

          - 파일 모든 내용을 문자열로 묶은 후 리턴

      3. close 함수

    ● [With문]
      ○ with open() as 변수:
            명령어
            명령어
        ex) with open    ('D:\webservice\python\p230418\gugudan.txt', 'r') as gugudan:
                lines = gugudan.read()
                print(lines)
                print(type(lines))

        - close()를 내부적으로 호출

  [Class]
    - 관련이 있는 변수와 메소드(함수)로 이루어진 타입
    - 클래스 멤버
      - 변수 : 클래스 변수, 인스턴스 변수
      - 메소드 : 클래스 메소드, 인스턴스 메소드
        - 인스턴스 메소드 : 내부 -> self.메소드명
                            외부 -> 클래스명.메소드명(주소), 참조변수명.메소드명()
        - 클래스 메소드 : 클래스.메소드명()
          - 외부에서 사용하기 위한 메소드
        - 정적(static) 메소드 : 클래스.메소드명()
          - 외부에서 사용하기 위한 메소드

    ● [클래스 정의]
      ○ class 클래스명:
            코드

      ex) class Student:
              name
              age

              def greeting(self):
                  print('안녕하세요.')

    ● [인스턴스(객체) 생성]
      ○ 변수명 = 클래스명()
      
      ex) hong = Student()
          hong.greeting() -> hong에 저장된 주소(Student객체)가 인수로 넘어감
    
    ● [인스턴스 변수] 
      - 메소드를 통해서만 생성 가능
      - 접근 권한이 없기 때문에 외부에서 접근 가능

      ○ def 메소드명(self, 매개변수명):
            self.변수명 = 매개변수명

      ex) def setName(self, name):
              self.name = name

    ● [클래스 변수]
      - 클래스 내에 생성한 변수
      - Java의 static 변수와 동일
      - 클래스가 메모리에 로드될 때 클래스 변수 할당

      ○ class 클래스명:
            변수 생성

        - 클래스명.변수명으로 사용

      ex) class Person:
              count = 1

              def __init__(self):
                  print('생성자 실행됨')
                  print(f'{Person.count}번 사람 생성')
                  Person.count += 1

    ● [생성자]
      - 객체가 생성될 때, 변수 초기화
      - 개체가 생성될 때, 특정 메소드(기능) 실행
      - 객체가 생성될 때 무조건 실행 X
      - 생성자를 정의하지 않으면, 기본 생성자가 실행
      - 생성자는 1개만 정의 가능
      - 생성자명 : __init__
        - 생성자를 메소드 호출로 사용 가능
        ex) 변수.__init__()

      ○ def __init__(self):
            코드

      - 생성자를 통한 인스턴스 생성
      ex) def __init__(self, name):
              print('생성자 실행됨!')
              self.name = name

      - 생성자내에서 다른 메소드 호출
      ○ def __init__(self):
            self.메소드명()

    ● [메소드]
      - 메소드 : class내에 정의된 함수
      - 메소드 호출시 인수로 호출한 참조변수에 저장된 주소가 첫 번째로 ※※무조건※※ 넘어감
      - 메소드는 ※※무조건※※ 주소를 받을 매개변수가 있어야 함
        - 매개변수가 필요없을 때 보통 받아주는 매개변수명은 self
      - 메소드는 객체 안에 있지 않음
        - 클래스 정보 안에 메소드를 넣고 객체에는 해당 주소를 넣어주는 형식으로 작동
        - 인스턴스 변수를 사용하기 위해선 인스턴스 주소가 필요하기 때문에 모든 메소드가 인스턴스 주소를 요구

      - 모든 메소드는 기본적으로 클래스 메소드

    ● [클래스 메소드]
      - 데코레이터를 통해 클래스 메소드 지정
      - 매개변수로 자동으로 클래스 타입을 받음
      - 인스턴스 변수 사용 불가

      ○ @classmethod  / decorator(데코레이터)
        def 메소드명(cls): 

      ● [클래스 메소드를 이용한 객체 생성]
         ○ @classmethod
            def 메소드명(cls): 
                return cls()

    ● [정적(static) 메소드]
      - 자동으로 받는 매개변수 X
      - 클래스 변수와 지역 변수만 사용 가능

      ○ @staticmethod  / decorator(데코레이터)
        def 메소드명(): 

  [상속]
    - 다중 상속 가능
    - 메소드 오버라이딩 가능
      - 상속관계에서 부모의 메소드 재정의 -> 선언부 그대로, 기능만 수정

    ○ class 부모클래스:
          멤버
      
      class 자식클래스(부모클래스, 부모클래스):
          멤버

    ● [부모 생성자 실행]
      - 부모의 생성자를 자식의 생성자에서 호출
      ○  super().__init__()
        - 매개변수의 개수를 맞춰서 전달
  
  [module]
    - 실행 단위(파이썬 파일)
    - 파일에 함수 하나만 존재해도 하나의 모듈
    - 모듈안엔 서로 연관된 요소들이 존재해야 한다
    - __pycache__ : import할 때 필요한 정보
    
    ● [모듈 읽어오기]
      ○ 1) import 모듈명
      ex) import random
          random.random()
      
      ○ 2) from 모듈명 import 모듈 안 멤버(변수명, 함수명, 클래스명)
      ex) from random import random
          random()
      ex) from random import * / 모든 멤버 import

      ○ 3) import 모듈명 as(alias) 별칭 - 관용적으로 쓰는 alias가 아니라면 가독성이 떨어질 수 있다
      ex) import random as rd
          rd.random()

    ● [import]
      - 해당 모듈을 무조건 실행시킨 후 안에 있는 정보를 메모리에 올림

    ● [__name__]
      - 실행 주체의 이름을 저장한 내장 변수
      - 실행 대상 
        - 직접(파일에서 실행)      : __main__
        - 간접(import를 통한 실행) : 모듈명(파일명)
      
      ● [__name__을 통한 test code]
        ○ if __name__ == '__main__':
              코드
  
  [package]
    - 관련있는 모듈(파일)을 모아놓은 것
    - site-packages : 별도로 설치하는 라이브러리가 저장되는 패키지
    
    ● [패키지 안 module 접근]
      ○ 1) import 패키지명.모듈명
      ex) import pack.module
          pack.module.value
      
      ○ 2-1) from 패키지명 import 모듈명
      ex) from pack import module
          module.value

      ○ 2-2) from 패키지명 import 모듈명 as 별칭
      ex) from pack import module as md
          md.value

      ○ 3) import 패키지명.모듈명 as(alias) 별칭
      ex) import pack.module as md
          md.value

    - __init__.py : 패키지를 import할 때 자동으로 실행되는 파이썬 파일(클래스의 생성자와 같은 역할)

  [exception]
    - Error : 예측 가능한 예외
      - Error가 발생하면 자동으로 예외 클래스로 객체를 생성
    - 프로그램이 실행되다 비정상 종료되는 상황을 예방하기 위해 예외처리를 해줌
    - 예외 회피 : 예외가 발생했을 때 원하는 작업이 없는 상태

    ○ [필수]
      try:
          예외 발생 가능한 명령어
      except: - 여러 개 사용 가능
          예외 발생했을 때, 실행할 명령어
      except 에러클래스명: 
          예외 발생했을 때, 실행할 명령어
      except 에러클래스명 as 변수명: - 예외 발생시 출력할 문구 저장
          예외 발생했을 때, 실행할 명령어
      [선택]
      else:
          예외가 발생하지 않았을 때, 실행할 명령어
      finally:
          예외 발생 여부와 상관없이, 마지막에 실행할 명령어

  [Regex]
    - 특정한 규칙을 가진 문자열의 패턴을 표현하는 데 사용하는 표현식

    ○ import re
      변수 = re.compile('정규 표현식')
      변수.함수명('문자열')
      
    ● [정규 표현식 함수]
      ○ match() - 시작 문자열이 일치한지 확인
      ex) data = '''abc mart food2 10days'''
          cp = re.compile('a')     # a를 찾으세요
          print('1) match :', cp.match(data))
          1) match : <re.Match object; span=(0, 1), match='a'>
            - span : 데이터의 위치
      
      ○ search() - 데이터에서 일치하는 데이터가 있는지 확인(첫 번째로 일치한 데이터만)
      ex) print('2) search :', cp.search(data))
          2) search : <re.Match object; span=(0, 1), match='a'>

      ○ findall() - 데이터에서 일치하는 데이터가 있는지 확인(모든 데이터)
      ex) print('3) findall :', cp.findall(data))
          3) findall : ['a', 'a', 'a']
            - 리스트 리턴
            - 위치 정보 X

      ○ finditer() - 데이터에서 일치하는 데이터가 있는지 확인(모든 데이터)
      ex) print('4) finditer :', cp.finditer(data))
          4) finditer : <callable_iterator object at 0x000001F5ACD63520>
            - callable_iterator 클래스로 위치 정보 객체들을 묶어서 리턴

            <re.Match object; span=(0, 1), match='a'>
            <re.Match object; span=(5, 6), match='a'>
            <re.Match object; span=(18, 19), match='a'>
    
    ● [정규 표현식]
      ○ [] : or 개념 
      ex) [ac] : a 또는 c

      ○ - : ~부터 ~까지 | [] 안에서만 사용 가능
      ex) [a-z] : a부터 z까지
      ex) [a-zA-Z] : a부터 z까지 or A부터 Z까지

      ○ ^ : 부정(not) | [] 안에서만 사용 가능
      ex) [a-z] : a부터 z까지가 아닌것

    ● [메타 문자]
      - 메타 : 데이터의 데이터
      - 메타 문자 : 원래 문자가 갖는 의미가 아닌 특별한 용도로 사용하는 문자
      - 바로 앞에 있는 문자 하나만 적용
      - []안에선 그냥 문자

      ○ [반복]
        - * : 0개 이상
        - + : 1개 이상
        - {n} : n개
        - {m,n} : m~n개 - 공백 X
        - ? : 0~1개

      ○ [자리]
        - . : 한 자리, 모든 문자(\n 제외)
        - ^ : 문자열 시작 - []안에선 부정

    ● [문자 표현식]
      - \w : [a-zA-z0-9] - 모든 문자(한글도 가능)
      - \W : [^a-zA-z0-9] - 공백, 기호, 줄바꿈
      - \d : [0-9] 
      - \D : [^0-9]
      - \s : [ \t\n\r\f\v] - 공백
      - \S : [^ \t\n\r\f\v]
  
  [File System]
    - __file__ : 현재 파일의 저장경로와 파일명 저장
    
    ● [os]
      ○ os.path.dirname(경로) : 디렉토리 경로를 추출
      ex) os.path.dirname(__file__)
          d:/webservice/python/p230421
    
      ○ os.path.join(경로, 추가할 문자열) : 경로에 추가할 문자열 연결 - 인수로 추가할 문자열 여러 개 가능
      ex) os.path.join(current_path, 'gugudan.txt')
          d:/webservice/python/p230421\gugudan.txt
        - 내장함수 join과 다른 함수
      
      ○ os.getcwd() - 현재 경로(파일이 속한 디렉토리의 상위 디렉토리 경로)
      ex) os.getcwd()
          D:\webservice\python

      ○ os.chdir(경로) - 인식 경로 변경 = 상대 경로 변경

      ○ os.listdir(경로) - 디렉토리 내 요소(기본 : 상대 경로)
      ex) os.listdir()
          ['.vscode', 'new.txt', 'note.md', 'number.txt', 'numberTwo.txt', 'p230411', 'p230412', 'p230413', 'p230414', 'p230417', 'p230418', 'p230419', 'p230420', 'p230421', 'Python.md', 'web.md']
      
      ○ os.path.exists(경로, 파일 경로) - 경로, 파일 존재 여부 확인
      ex) os.path.exists(r'd:\test')
          True

      - 파일 존재 확인
      ex) os.path.exists(r'd:\test\ex.txt')
          True          
      
      ○ os.mkdir(경로+디렉토리명) - 디렉토리 생성
        - 해당 경로에 디렉토리가 존재한다면 Error
        - 계층 구조로 디렉토리를 생성하면 Error
      
      ○ os.makedirs(경로+디렉토리명) - 디렉토리 생성
        - 계층 구조로 디렉토리 생성 가능
        - 매개변수로 Error 관리 처리
          exist_ok : default=False
            - True로 설정하면 경로가 존재해도 에러 발생 X
      - 폴더 경로를 만들 때 폴더 마지막엔 \를 붙여주는 게 좋음

      ○ os.rmdir(경로) - 디렉토리 삭제
        - 계층 구조인 디렉토리는 삭제 불가능
        - 최하위 디렉토리만 삭제 가능

      ○ os.remove(경로+파일명) - 파일 삭제

      ○ os.removedirs(경로) - 디렉토리 삭제
        - 디렉토리가 모두 비어 있어야 가능
        - 최하위 디렉토리 경로를 넣어줘야 모두 삭제

    ● [shutil]
      ○ shutil.rmtree(경로) - 디렉토리 삭제
        - 디렉토리가 비어 있지 않아도 삭제 가능
        - 상위 디렉토리 경로를 넣어줘도 하위 디렉토리까지 삭제 가능

  [crawling]
    - 크롤링 : 사이트(HTML)의 기본적인 정보(title, description등)을 평상시에 수집하는 행위
    - 스크래핑 : 웹 사이트의 특정한 정보(element)들을 수집하는 행위

    - 실제 웹 페이지는 가볍게 만들기 위해 엔터를 제거한 후 올리기도 하기 때문에 사이트 분석이 중요

    - 서버에 브라우저를 통한 요청이 아닌 파이썬 파일을 통한 요청을 하기 때문에 응답이 거부될 수 있다 
      - user-agent 정보 추가

    - 프로그램을 통한 요청이 사람이 요청하는 것보다 훨씬 빠름 -> 프로그램이 무분별한 크롤링을 하게 되면 서버 입장에선 너무 많은 요청을 처리하게 돼 부담이 생김

    - 루트 디렉토리내 robots.txt내 규칙을 준수하는 것이 좋음
      - robots.txt가 없다면 모든 크롤링을 허용

    - 시간에 따라 웹 사이트의 구조가 달라질 수도 있기 때문에 확인 해줘야 한다

    ● [BeautifulSoup] : HTML의 계층 구조를 Python에서 표현하기 위한 라이브러리
      - pip install beautifulsoup4
      - pip : 라이브러리 설치를 위한 패키지
      - 패키지를 읽을 때 __init__.py가 자동으로 실행
      - BeautifulSoup을 통해 parsing한 데이터는 실제 데이터와 차이가 있을 수도 있다
      - ※태그의 속성은 딕셔너리 형태로 관리※
      ex) a = {'href' : '주소'}
      - 웹 페이지에서 JavaScript를 통해 처리되는 동적 데이터는 HTML 엘리먼트로 접근 불가능
        [해결 방법]
        - 동적 크롤링
        - 데이터를 직접 요청

      [함수]
        ● 객체 생성
          - BeautifulSoup(페이지, parser)
        ex) soup = BeautifulSoup(html, 'html.parser')
            - 페이지를 계층구조로 표현
        - 웹 페이지는 xml, html 중 하나로 구현

        ◈ parsing : 문자열을 token(어휘 분석 단위=태그)으로 분해하고 그것들로 이루어진 Parse tree(token으로 분해된 태그들로 만들어진 트리)를 만드는 과정
        ◈ parser : parsing을 하는 프로그램

        ● element 접근
          1. 태그명 - 태그를 변수로 취급
            ○ 객체.태그명.태그명.태그명
            ex) soup.html.body.h1
            <h1>BeautifulSoup 연습합니다.</h1>

          2. select 함수
            ○ 객체(태그 타입도 사용 가능).select(선택자를 통한 접근)
            - 선택자를 통한 엘리먼트 접근(여러 개)
            - 리턴 : bs4.element.ResultSet
              - ResultSet이지만 리스트와 동일
          
          2-1. select_one 함수
            ○ 객체.select_one(선택자를 통한 접근)
            - 선택자를 통한 엘리먼트 접근(한 개)
            - 리턴 : bs4.element.Tag
            - 가상 클래스 사용 가능
            ex) soup.select_one('div h2:nth-of-type(1)')

          3. find_all 함수
            ○ 객체.find_all(name, attrs, recursive, string, limit, 가변매개변수)
            - 태그, 속성, content를 통한 접근
            - 리턴 : bs4.element.ResultSet

            [매개 변수]
              - name : 태그
              - attrs : 속성
                - attrs의 타입 : dict 
                - 딕셔너리로 묶어서 전달하는 게 아니라면 키는 변수로 취급
                ex) a_all_02_02 = soup.find_all(id=True)
              - recursive : true(default) - 모든 자손 탐색
                            false         - 직계 자손 탐색
              - string : content

          3-1. find 함수
            ○ 객체.find(name, attrs, recursive, string, 가변매개변수)
            - 리턴 : bs4.element.Tag

        ● content 추출
          - 엘리먼트에 직접 접근 가능하지만 가장 처음 만나는 엘리먼트만 접근 가능

          1. text 변수
            ○ 객체.태그명.태그명.text
            ex) soup.html.body.h1.text
            BeautifulSoup 연습합니다.
            - 리턴 : str
            - property(get_text) -> get_text의 리턴값
            - content가 엘리먼트일 때 추출 가능

          2. string 변수
            ○ 객체.태그명.태그명.string
            ex) soup.html.body.h1.string
            BeautifulSoup 연습합니다.
            - 리턴 : bs4.element.NavigableString
            - content가 엘리먼트일 때 추출 불가

          3. get_text() 함수
            ○ 객체.태그명.태그명.get_text()
            ex) soup.html.body.h1.get_text()
            BeautifulSoup 연습합니다.
            - 리턴 : str
            - content가 엘리먼트일 때 추출 가능

          4. getText 변수
            ○ 객체.태그명.태그명.getText()
            ex) soup.html.body.h1.getText()
            BeautifulSoup 연습합니다.
            - get_text메소드 주소를 담은 변수
            - 리턴 : str
            - content가 엘리먼트일 때 추출 가능
          
        ● 형제 추출
          1. next_sibling 변수
            ○ 엘리먼트.next_sibling
            ex) p2 = p.next_sibling
                \n
            ex) p2 = p.next_sibling.next_sibling
                p2 >> <p>연습 중2</p>
            - 바로 다음 요소 추출

    ● [requests]
      - 브라우저가 아닌 코드에서 서버에 연결하기 위한 라이브러리
      - 서버가 정상적인 응답을 하지 않아도 HttpCode 200이 나오기 때문에 확인이 필요

      ● [요청]
        ○ requests.get(주소)
          - 데이터를 전송할 때 딕셔너리 형태로 전송
          - 서버에 request 요청을 보냄
          - 헤더 추가 가능
          - user-agent의 정보가 없음
          - 리턴 : requests.model.Response

        ○ Response.get().content
          - binary로 읽어옴
          - type : bytes

        ○ Response.get().text
          - 문자로 읽어옴
          - type : str
        
        ○ Response.json()
          - 서버한테 받은 Response를 json으로 변환

    ● [urllib.request]
      ● [요청]
        ○ urllib.request.urlopen(주소)
          - type : http.client.HTTPResponse
          - 데이터를 전송할 때 바이너리 형태로 전송
          - 서버 측에서 받은 응답 데이터를 메모리에 저장
          - 응답을 객체로 저장
          - 헤더 추가 불가능

        ○ urllib.request.urlopen(주소).read()
          - 서버 측에서 보내주는 형태에 따라 달라짐 보통 binary
          - type : bytes
        
      ● [이미지 다운로드]
        ○ urllib.request.urlopen(이미지 주소)
          - 데이터를 메모리에 저장하기 때문에 데이터를 읽어온 후 저장
          - 이미지 파일이 바이너리기 때문에 저장할 때 바이너리 파일로 저장
          ex) open(경로, 'wb')

        ○ urllib.request.urlretrive(이미지 주소, 저장 경로+파일명)
          - 서버 측에서 받은 데이터를 바로 저장

    ● [pandas]
      - 테이블 구조를 쉽게 가져오는 라이브러리
      - 분석할 때 사용
      - DataFrame에 자동으로 인덱스 추가
      - 정수가 들어오는 컬럼에 결측치(값을 알 수 없는 데이터)가 있다면 실수로 바뀜
      
      ● [함수]
        ○ pandas.read_html(주소, 인코딩)
          - 해당 주소에서 테이블 엘리먼트를 자동으로 추출
          - 함수가 실행될 때 lxml라이브러리 import함
          - 서버에서 보내주는 데이터의 인코딩을 맞춰줘야 함
          리턴 : 리스트
            - 요소 타입 : pandas.core.frame.DataFrame

        ○ pandas.DataFrame({키:값})
          - DataFrame 생성
          - 키가 column 값이 row

          pandas.DataFrame([[요소1], [요소2]], columns=Iterable)
          - DataFrame 생성
          - 요소 1개가 로우 1개
          - 컬럼명을 직접 지정(Iterable) | 딕셔너리의 키를 통해 지정

        ○ pandas.json_normalize(json)
          - json을 DataFrame으로 생성
        
        ○ DataFrame.to_csv(저장경로)
          - DataFrame을 쓰기 작업
          - csv파일로 생성(excel파일 아님)
          - 기본 쓰기 모드 : w

          ◎ 매개변수
            - index(bool) : 인덱스 활성/비활성
            - header(bool) : 컬럼명(가장 윗 줄) 활성/비활성
            - mode(Filewritemode) : 파일 쓰기 모드 설정

    ● [jupyter notebook]
      - anaconda 플랫폼을 통해 사용
        - 기본 환경(base)이 아닌 가상 환경을 사용하는 것이 좋음
          - 가상 환경에서 커널을 생성해 다른 환경으로 사용
        - 기본 환경(base)에 자동으로 라이브러리가 설치되기 때문에 라이브러리를 설치할 때 충돌 발생
      
      - 로컬보단 서버에 설치해서 사용하는 것이 메모리나 CPU 성능을 최대한 사용할 수 있기 때문에 서버에 설치하는 것이 효율적이다

      - anaconda prompt의 시작 위치를 원하는 경로로 변경 가능
        - anaconda prompt 실행파일 -> 속성 -> 시작위치
      
      - ※ 메모리에서 완전히 제거하려면 Running에 들어가 shutdown ※

      - css와 json파일로 스타일 변경 가능

      - 상대 경로 : 현재 디렉토리

      - IPython(파이썬을 처리해주는 셸) 사용
        - 분석을 최적화하기 위한 셸
        - 내장 변수 지원 X

      ● [anaconda 명령어]
        ○ conda info -e 
          아나콘다 환경 확인

        ○ conda list
          현재 설치된 라이브러리

        ○ conda create --name 이름 python=버전
          가상 환경 생성
          -n  : name
          - 파이썬 버전 필수
          - jupyter notebook 설치
            ○ pip install jupyter notebook

        ○ conda search python
          설치할 수 있는 파이썬 확인

        ○ conda activate 이름
          가상 환경 활성화

        ○ conda deactivate
          가상 환경 비활성화

        ○ conda remove -n 이름 --a
          가상 환경 삭제
          --a : all

        ○ python -m ipykernel install --user --name 가상환경이름 --display-name 커널명
          커널 생성

        ○ jupyter notebook
          jupyter notebook 실행
          - 실행된 경로가 최상위 경로로 인식

        - New -> Python3 클릭
          - anaconda prompt로 서버에 백그라운드로 연결돼 있어야 가능
          - notebook의 python파일은 확장자가 .ipynb
          - auto save 가능
          - 다른 쉘에서 만든 변수도 메모리에 올라와 있기 때문에 다른 쉘에서 사용 가능

          ● command 모드 : 파랑
              ○ 모드 전환 : enter
              ○ 새 쉘 추가(아래) : b
              ○ 새 쉘 추가(위) : a
              ○ 쉘 삭제 : dd
              ○ 쉘 병합 : shift + m
              ○ 쉘 나누기 : ctrl + shift + '-'
                - 커서 위치
              ○ 쉘 복사 : c
              ○ 쉘 붙여넣기 : v
              ○ 라인 넘버링 : l

          ●  edit 모드 : 초록
              - 쉘 단위로 실행하기 때문에 위에서부터 실행하지 않아도 됨 
                - 요청이 있는 코드에서 실행할 때마다 매 번 요청을 하지 않아도 된다

              - 쉘에서 실행하기 때문에 변수명만 적어도 출력 가능
                - 하나만 출력 가능
                - DataFrame타입을 그냥 출력할 때 자동으로 표를 만들어 출력
                - print 사이에서 출력하면 잘 안 나옴

              - 모든 작업이 끝나고 나면 정리 필수

              ○ 모든 전환 : esc
              ○ 실행 : ctrl + enter 
                - 현재 쉘
              ○ 실행 : shift + enter 
                - 현재 쉘 실행 후 아래 쉘로 이동(없다면 추가)
              ○ 실행 : alt + enter
                - 현재 쉘 실행 후 아래 쉘 추가
              ○ 자동 완성 : tab
              ○ 함수 정보 : shift + tab
              ○ 라이브러리 설치 : !pip install 라이브러리
                - jupyter notebook이 업데이트 되면서 !가 없어도 실행 가능

  [JSON] - JavaScript Object Notation
    - 경량의 데이터 교환 형식
    - JSON은 완벽하게 언어로 부터 독립
    - 데이터의 형태가 key : value 쌍으로 이뤄짐
    - 사람이 읽고 쓰기에 쉽고, 컴퓨터가 분석하고 생성하기도 용이
    - HTML 파일 전체를 받는 것보다 실제 필요한 데이터만 받아서 처리하는 것이 효율적
    - 서버측에서 처음에 필요한 데이터만 모두 처리한 후 클라이언트에게 전송하고 클라이언트가 특정 행동을 했을 때 필요한 데이터만 JSON파일로 보내서 처리
    - Fetch/XHR : 데이터

    ● [함수]
      ○ json.dumps(dict)
      ex) with open(경로+파일명, 쓰기모드) as 변수명:
              변수명.write(json.dumps(dict))
      - dict을 str로 변경
      - 문자열을 ""로 묶음
      
      ○ json.dump(dict, 경로)
      ex) with open(경로+파일명, 쓰기모드) as 변수명:
              json.dump(dict, 변수명)
      - dict을 json로 변경
      - 파일 저장경로와 파일명이 필수

      ○ json.loads(문자열)
      - str을 dict으로 변경

      ○ json.load(경로+json파일)
      - json을 dict으로 변경
      - 웹에서 가져온 json파일은 경로가 없기 때문에 사용 불가

  [dynamic crawling] - 동적 크롤링
    - 웹 브라우저를 실시간으로 제어하며 크롤링

    - 브라우저를 제어하기 위한 드라이버 설치 필요
      - 브라우저와 버전이 맞는 드라이버 설치
      - 상대경로 위치에 있다면 자동 인식 없다면 경로 지정

    - time의 sleep함수를 이용해 딜레이 생성
      - 자바 스크립트가 실행될 시간을 기다림
      - 프로그램 처리 속도가 빠르기 때문에 작업을 확인하거나 페이지 렌더링을 기다리는데 사용

    - 한 작업을 한 쉘에서 실행

    ● [selenium]
      ○ from selenium import webdriver
        webdriver.Chrome(경로)
        - 브라우저 실행
        - 리턴 : selenium.webdriver.chrome.webdriver.WebDriver (세션)
      
      ○ webDriver.get(주소)
        - 해당 주소로 브라우저 실행
      
      ○ webDriver.close()
        - 브라우저 닫기

      ○ webDriver.page_source
        - 해당 페이지의 html파일 요청
        
      ○ from selenium.webdriver.common.by import By
        webDriver.find_element(By.접근방식, 접근)
        ex) webDriver.find_element(By.XPATH, '//*[@id="daumHead"]/div[2]/div/div[1]/ul/li[3]/a')
          - 해당 엘리먼트 접근
          - 리턴 : selenium.webdriver.remote.webelement.WebElement
          - XPATH : 

        webDriver.find_elements(By.접근방식, 접근)
          - 해당 엘리먼트들 접근
          - 리턴 : 리스트
            요소 : selenium.webdriver.remote.webelement.WebElement

      ○ webElement.click()
        - 해당 엘리먼트를 클릭

      ○ from selenium.webdriver.common.keys import Keys
        webElement.send_keys(값)
          - 해당 값을 해당 엘리먼트에 입력
        Keys.키보드 버튼
          - 해당 키보드 버튼
          - Return == Enter

      ○ ○ webElement.text
        - 해당 엘리먼트의 content 추출

    ● [동적 데이터]
      - 자바스크립트를 통해 계속해서 변화하는 값
      - 동적 데이터는 XPath를 통해서 접근

