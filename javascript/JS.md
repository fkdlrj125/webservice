# JS(JavaScript)
- 인터프리터 언어
- 객체지향 언어
- 함수형 언어
- null, undefined를 제외한 모든 것을 객체처리
- 문서에 접근하는 스크립트는 바디 종료태그 위에 넣어야 DOM이 구성이 완료돼 에러가 발생할 확률이 낮음
- 함수 정의로만 구성된 스크립트는 헤드에 넣어도 문제 x
<br><br>


# 변수 
- 스크립트 내 선언된 변수의 디폴트는 전역변수
<br><br>


## 변수 키워드
### var
- 전역변수
- 함수 레벨 스코프
	- 함수 내에서 선언됐을 시 지역변수
- 선언된 변수는 선언 전에 접근 o
- 이미 선언된 변수를 재선언시 에러 x
	- 값 변경으로 처리함
- 변수 선언과 동시에 초기화 x
- 값 변경 o
<br><br>


### let
- 지역 변수
- 블럭 레벨 스코프
- 선언된 변수는 선언 전에 접근 x
- 이미 선언된 변수를 재선언시 에러 o
- 변수 선언과 동시에 초기화 x
- 값 변경 o
<br><br>


### const
- 자바의 final처럼 변수를 상수화
- 블럭 레벨 스코프
- 선언된 변수는 선언 전에 접근 x
- 이미 선언된 변수를 재선언시 에러 o
- 변수 선언과 동시에 초기화 o
- 값 변경 x
<br><br>


# 자료형
## 배열
- [] : 배열
- 타입 : object
	- 키(인덱스) : 값 형태로 관리
- 배열은 객체
- 파이썬의 리스트처럼 요소의 타입이 달라고 사용 가능
<br><br>

## 배열 함수(추가)
- 공백 제거
```
문자열.repeat(횟수)
```
<br><br>

- 공백 제거
```
문자열.repeat(횟수)
```
<br><br>

- 공백 제거
```
문자열.repeat(횟수)
```
<br><br>



## object
- property(속성)로 이루어진 타입
	- property : name과 value쌍 
		- name : value
		- 딕셔너리의 요소와 같은 형태

	- property 접근
		1. 점 접근
			- name 그대로 사용
			- obj.name
		1. [] 접근
			-  name을 문자열로 사용
			- obj['name']
<br><br>


# 연산자
## 비교연산자
- ==  : 값 비교(타입 비교x)
- === : 값 비교(타입 비교o)
<br><br>


## 조건연산자
```
조건식 ? true : false
```
<br><br>


# 제어문
## if
- [문법]
- 조건 1개
```
if(조건식) {
	명령어;
	명령어;
}
```
<br><br>


- 조건 2개
```
if(조건식) {
	명령어;
	명령어;
}
else {
	명령어;
	명령어;
}
```
<br><br>


- 조건 3개
```
if(조건식) {
	명령어;
	명령어;
}
else if(조건식) {
	명령어;
	명령어;
}
else {
	명령어;
	명령어;
}
```
<br><br>


## switch
- switch의 식 또는 변수에는 실수 사용 가능
- case값으로 변수 사용 가능
```
switch(식 또는 변수) {
	case 값1:
		명령어;
		break;
	case 값2:
		명령어;
		break;
	default:
		명령어;
}
```
<br><br>


#반복문
## for
```
for(초기값; 조건식; 증감식;) {
	명령어;
}
```
<br><br>


## for in
- object의 속성키를 추출
- property(속성)의 키 추출
```
for(변수 in 객체) {
	명령어;
}
```
<br><br>


## for of
- object의 속성값을 추출
- property(속성)의 값 추출
```
for(let 변수 in 객체) {
	명령어;
}
```
<br><br>


## while
```
초기값;

while(조건식){
	증감식;
}
```
<br><br>


## do while
```
초기값;

do {
	명령어;
	증감식;
} while(조건식)
```
<br><br>


# 함수
- 타입에 영향을 받지 않기 때문에 반환형이나 매개변수의 타입 지정이 없음
- 매개변수와 인수의 자료형(타입)이 일치하는지 검사 X
- 매개변수가 존재하는 함수를 호출할 때 인수를 넣어주지 않아도 Error가 발생하지 않음
	- 매개변수의 개수가 인수의 개수보다 적으면 undefined
- 인수로 넣어주는 값이 매개변수보다 많아도 Error 발생 X
	- 매개변수의 개수와 인수의 개수가 같은지 검사 X
- 스크립트 코드를 실행하기 전에 먼저 읽어 정의된 함수를 전역영역 메모리에 저장
<br><br>


## arguments
- arguments : 인수로 넘어오는 값을 모두 받아주는 변수
	- 배열과 유사하지만 배열은 아님
	- iterator
- 함수가 호출될 때 자동으로 arguments를 생성
<br><br>


## rest parameter
```
function 함수명(매개변수1, 매개변수2, ...args)
```
- 파이썬의 가변 매개변수와 같은 매개변수
- 배열
<br><br>


## 내장함수
- 이미 만들어진 함수
<br><br>


- [함수]
	- eval : 문자열로 표현된 식을 계산
	- parseInt : 정수 변환
	- parseFloat : 실수 변환
	- toFixed : 소수 자리 지정
<br><br>


- [함수 정의 형태]
	1. 매개변수 o, 리턴 o
	1. 매개변수 o, 리턴 x
	1. 매개변수 x, 리턴 o
	1. 매개변수 x, 리턴 x
<br><br>


## 사용자 정의 함수
### 이름이 있는 함수 : 함수 선언식, 선언적 함수
```
function 함수명(매개변수1, 매개변수2) {
	명령어;
	return 값;
}
```
<br><br>


## return 의미
- 함수의 종료
- 호출한 쪽으로 값 전달
<br><br>


## 함수 실행 끝
- return 실행
- 함수 영역의 끝
<br><br>


### 이름이 없는 함수 : 익명 함수
- 이름이 없기 때문에 호출이 불가능해 변수에 저장
- 변수에 저장해 사용 : 함수 표현식
- 익명 함수는 변수에 저장되는 순간 메모리영역에 저장
- 변수가 변경되지 않게 const 사용
```
변수 = function (매개변수) {
	명령어;
}
```
<br><br>

### 함수 표현식을 간략하게 표현 : 화살표 함수(arrow function)
- 자바의 람파표현식과 유사
- function 키워드는 제외
```
// 방법 1
(매개변수1, 매개변수2) => {
	명령어1;
	명령어2;
}

// 방법2 
// : 매개변수가 1개일 경우 () 생략 가능
// : body내 명령어가 1개일 경우 {} 생략 가능, 무조건 return
매개변수1 => 명령어
```
<br>
<br>

### CallBack 함수
- 함수 안에서 매개변수로 받은 함수를 호출
- 익명함수를 인수로 받는 경우가 많음
<br>
<br>

### 중첩 함수
- 함수 정의 내 함수 정의
- 중첩된 함수는 지역 함수(함수 영역 내에서만 사용 가능)
<br>
<br>

# Sources
- 자바 스크립트의 실행 결과를 확인할 수 있는 크롬웹 도구
- 중지점 : 실행 시 중지할 라인
	- 선언부는 중지 못 함
- scope(범위) : 유효 범위
	- 전역 : 스크립트 전역
	- 로컬 : 함수 영역
- Call stack(호출 스택) : 함수 호출을 저장할 스택
<br>
<br>

# 호이스팅(hoisting)
- 변수의 선언과 초기화를 분리
	- 미리 메모리에 변수를 올려두는 작업
	- 변수는 초기화되지 않은 상태로 올림
<br>
<br>

# 스코프(scope)
- 전역 스코프(global scope)
	- script 내 선언된 변수
	- 어디서든지 접근 가능
<br>
<br>

- 지역 스코프(local scope)
	- {} 내 선언된 변수
	- 해당 영역 내에서만 접근 가능
	- function level scope - var
	- block level scope - let
<br>
<br>

# 널리쉬(nulllish)
```
값1 ?? 값2 ?? 값3
```
- 여러 개의 값에서 null 이나 undefined 같은 값이 아닌 것을 찾는 연산자
- 왼쪽부터 시작해 가장 처음 null 이나 undefined 같은 값이 아닌 값을 지정
<br>
<br>

# 전개 구문
```
...iterable
```
- iterable값을 하나씩 분리
<br>
<br>

# 문자열
## 템플릿 리터럴 : 백틱
```
`${expression}`
```
- 파이썬의 f문자열 포맷팅과 동일
- 문자열에서 작은 따옴표나 이중 따옴표 대신 백틱 사용
- 플레이스 홀더를 이용한 ${expression}으로 표현식 사용
<br>
<br>

## 문자열 함수
- replace
```
문자열.replace('기존 문자열', '바꿀 문자열')
```
- 왼쪽 기준으로 일치하는 문자열 하나만 변경
<br>
<br>

- replaceAll
```
문자열.replaceAll('기존 문자열', '바꿀 문자열')
```
- 일치하는 문자 모두 변경
<br>
<br>

- substring
```
문자열.substring(시작 인덱스, 끝 인덱스)
```
- 시작 위치부터 끝 인덱스 전까지 문자열 추출
<br>
<br>

- slice
```
문자열.slice(시작 인덱스, 끝 인덱스)
```
- 시작 위치부터 끝 인덱스 전까지 문자열 추출
- -인덱스 사용 가능  
- 인수를 하나만 넣으면 인덱스 0부터 인수까지 슬라이싱
<br><br>

- split
```
문자열.split('문자열')
```
- 특정 문자 기준으로 분리
- 기준이 된 문자열은 결과에 포함되지 않음
<br><br>

- 특정 문자 왼쪽에 추가
```
문자열.padStart(문자열 전체 길이, '추가할 문자')
```
- 기존의 문자열이 입력한 문자열 전체 길이가 될 때까지 해당 문자를 기존 문자열 왼쪽에 추가
<br><br>

- 특정 문자 오른쪽에 추가
```
문자열.padEnd(문자열 전체 길이, '추가할 문자')
```
- 기존의 문자열이 입력한 문자열 전체 길이가 될 때까지 해당 문자를 기존 문자열 오른쪽에 추가
<br><br>

- 특정 문자 찾기
```
문자열.inclues('문자열')
```
- 해당 문자열이 있는지 확인
- 특정 문자열과 완전히 일치해야 함
<br><br>

- 특정 문자의 위치 리턴
```
문자열.indexOf('문자열')
```
있음 : 왼쪽부터 시작하여 특정 문자열을 탐색해 가장 먼저 만나는 인덱스 리턴  
없음 : -1 리턴
<br><br>

- 반복
```
문자열.repeat(횟수)
```
<br><br>

- 대소문자
```
문자열.toUpperCase()
문자열.toLowerCase()
```
<br><br>

- 공백 제거
```
문자열.trim()
문자열.trimStart()
문자열.trimLeft()
문자열.trimEnd()
문자열.trimRight()
```
<br><br>

# DOM
1. 단일 element 추출(반환)
```
// 아이디로 추출
document.getElementById('아이디');

// 선택자로 추출
document.querySelector('선택자');
  아이디 : #
  클래스 : .
  태그 : 태그명
```
<br><br>

1. 복수 element 추출(반환)
```
// 클래스로 추출
document.getElementsByClassName('클래스');

// 태그로 추출
document.getElementsByTagName('태그');

// 선택자로 추출
document.querySelectorAll('선택자1, 선택자2');
  아이디 : #
  클래스 : .
  태그 : 태그명
```
<br><br>

1. Content
```
element.innerText // 해당 엘리먼트의 텍스트만 추출
element.innerHTML // 해당 엘리먼트의 자식 엘리먼트 추출
```

# Event
- 이벤트 : 사용자의 행동

## Event Listener
- 스크립트 내에서 페이지에서 일어나는 이벤트를 주시
```
element.addEventListener('이벤트', 이벤트핸들러);
```
<br>

- 이벤트 해제
```
element.removeEventListener('이벤트', 해제할 이벤트 핸들러);
```
<br>

## Event Handler
- 이벤트가 발생했을 때, 실행될 함수 
- 이벤트 핸들러가 실행될 때 이벤트에 대한 정보가 인수로 전달됨

- refresh 방지
```
event.preventDefault();
```

- 입력된 값을 가져옴
```
input태그.value;
```

- 엘리먼트 추가
```
document.createElement();
```

- 자식, 부모 추가
```
// 자식 하나 추가
element.appendChild(element);

// 부모 추가
element.appendParent(element);

// 자식 여러 개 추가
element.append(element, element);
```

- 부모 엘리먼트 추출
```
event.target.parentElement
```

- 엘리먼트 삭제
```
element.remove()
```
<br>

# 구조 분해 할당(Destructuring assignment)
- 배열이나 객체의 속성을 해체하여 개별 변수에 저장
```
// 배열
// 1-1. 변수 개수 = 배열의 속성 개수
even = [2, 4];
[a, b] = even; // a = 2, b = 4

// 1-2. 변수 개수 < 배열의 속성 개수
odd = [1, 3, 5, 7, 9];
[c, d, ...e] = odd; // c = 1, d = 3, e = 5, 7, 9

// 1-3. 변수 개수 > 배열의 속성 개수
[f, g, h] = even; // f = 2, g = 4, h = undefined

// 1-3. 변수 개수 > 배열의 속성 개수
// : 초기값 설정
[i=100, j=200, k=300] = even; // i = 2, j = 4, k = 300
```
```
// 객체
// 2-1. 
const info = {
        name : '홍길동',
        age : 25,
      };
{nick, old} = info // nick = undefined, old = undefined

// 객체의 구조분해할당은 키(name)와 변수명이 같아야 가능
{name, age} = info // name = '홍길동', age = 25

// 2-2. 새로운 변수명 지정
{name:new_name, age:new_age} = info // new_name = '홍길동', age = 25
```

# local storage
- json파일로 저장
- 
## 저장
```
localStorage.setItem(key, value)
```

## 가져오기
```
localStorage.getItem(key)
```

## 객체 저장
- 객체를 그냥 저장하면 타입이 저장
- 객체를 JSON(문자열)로 변환해서 저장(직렬화)
```
JSON.stringigy(object);
```

## 객체 가져오기
- 저장된 객체를 불러오면 저장된 상태인 string으로 가져옴
- 저장된 객체를 파싱해 javascript에서 사용가능한 object 타입으로 변환
```
JSON.parse(localStorage.getItem(key))
```

## 객체 삭제
- 각 property를 구분할 수 있는 key값을 설정 후 그 key값을 태그의 id로 설정하여 삭제를 원할 때 해당 id를 불러와 해당 property를 제외한 배열을 다시 만들고 local storage에 저장

### filter
- 조건에 해당하는 요소만 리턴
```
iterable.filter(callback)
```