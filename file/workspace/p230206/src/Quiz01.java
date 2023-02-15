class ArrayStack{
	int[] arr;
	int top = -1;
	final int MAXINDEX;
	
	ArrayStack(int value) {
		this.arr = new int[value];
		MAXINDEX=arr.length-1;
	}
	
	void push(int value) {
		
		if(top < MAXINDEX) {
			arr[++top] = value;
			System.out.println("Inserted Item : "+value);
		} else {
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
		}
		
	}
	
	int pop() {
		if(top < 0) {
			System.out.println("스택이 비었습니다!");
			return top;
		} else { 
			return arr[top--];
		}
		
	}
	
	int peek() {
		if(top < 0) {
			System.out.println("스택이 비었습니다!");
			return top;
		} else { 
			return arr[top];
		}
	}
}


public class Quiz01 {
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(5);
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		
		System.out.println("\ntop에 있는 아이템 출력 : "+stack.peek());
		
		System.out.println("pop 실행 : "+stack.pop());
		System.out.println("pop 실행 : "+stack.pop());
		System.out.println("pop 실행 : "+stack.pop());
		System.out.println("pop 실행 : "+stack.pop());
		System.out.println("pop 실행 : "+stack.pop());
		System.out.println("pop 실행 : "+stack.pop());
	}
}
