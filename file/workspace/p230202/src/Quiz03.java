class ArrayStack{												// class ArrayStack 정의
	int[] arr;													// int형 배열을 저장할 참조변수 arr선언
	int top = -1;												// int형 변수 top선언 후 -1로 초기화
	final int MAXINDEX = arr.length-1;							// final int형 변수 MAXINDEX를 선언 후 배열의 길이-1로 초기화
	
	int peek() {												// 멤버 메소드 peek 정의
		if(top < 0) {											// 조건문 실행/top이 0 미만이면 실행
			System.out.println("스택이 비었습니다!");			// 문자열 출력
			return top;											// top값을 리턴하고 호출한 부분으로 돌아감
		} else { 												
			return arr[top];									// 배열 arr의 인덱스 top번에 위치한 값을 리턴하고 호출한 부분으로 돌아감
		}
	}
	
	void setArr(int value) {									// 리턴값이 없고 매개변수로 int형 변수 1개를 받는 setArr정의
		arr = new int[value];									// 참조변수 arr에 길이를 value값으로 하는 배열생성 후 주소 저장
	}
	
	void push(int value) {										// push메소드 정의
		
		if(top < MAXINDEX) {									// top이 MAXINDEX 미만이면 실행
			arr[++top] = value;									// top은 전위1증가연산자로 선증가시킨 후 arr의 인덱스 top번에 value값을 저장
			System.out.println("Inserted Item : "+value);		// 문자열 출력
		} else {
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");	// 문자열 출력
		}
		
	}
		
	int pop() {													// pop메소드 정의
		if(top < 0) {											// top이 0미만이면 실행
			System.out.println("스택이 비었습니다!");			// 문자열 출력
			return top;											// top을 리턴 후 호출한 곳으로 돌아감
		} else { 
			return arr[top--];									// arr의 top번에 있는 값을 가져온 후 후위1감소연산자로 top값을 감소시키고
																// 가져온 값을 리턴 후 호출한 곳으로 돌아감
		}
		
	}
	
}

public class Quiz03 {
	public static void main(String[] args) {					// main메소드 실행
		ArrayStack stack = new ArrayStack();					// ArrayStack객체를 저장할 참조변수 stack 생성 후
																// ArrayStack객체를 생성하고 그 주소를 stack에 저장
		
		stack.setArr(5);										// stack의 멤버메소드 setArr을 실행(인수 5) 
		
		stack.push(20);											// stack의 멤버메소드 push를 실행(인수 20)
		stack.push(15);											// stack의 멤버메소드 push를 실행(인수 15)
		stack.push(10);											// stack의 멤버메소드 push를 실행(인수 10)
		stack.push(55);											// stack의 멤버메소드 push를 실행(인수 55)
		stack.push(8);											// stack의 멤버메소드 push를 실행(인수 8)
		stack.push(5);											// stack의 멤버메소드 push를 실행(인수 5)
		
		System.out.println("\ntop에 있는 아이템 출력 : "+stack.peek()); // stack의 멤버메소드 peek를 실행 후 문자열 출력
		
		System.out.println("pop 실행 : "+stack.pop());			// stack의 멤버메소드 pop을 실행 후 문자열 출력
		System.out.println("pop 실행 : "+stack.pop());			// stack의 멤버메소드 pop을 실행 후 문자열 출력
		System.out.println("pop 실행 : "+stack.pop());			// stack의 멤버메소드 pop을 실행 후 문자열 출력
		System.out.println("pop 실행 : "+stack.pop());			// stack의 멤버메소드 pop을 실행 후 문자열 출력
		System.out.println("pop 실행 : "+stack.pop());			// stack의 멤버메소드 pop을 실행 후 문자열 출력
		System.out.println("pop 실행 : "+stack.pop());			// stack의 멤버메소드 pop을 실행 후 문자열 출력
	}
}
