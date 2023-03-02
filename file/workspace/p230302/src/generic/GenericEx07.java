package generic;

/*
 * 	[제네릭 클래스의 상속]
 *	- 상속관계에서 자식의 제네릭 타입을 설정하면 부모도 자식의 타입을 따라간다
 *	  -> 하나의 자료형 정보로 Parent와 Child 자료형이 모두 결정 
 */

class Parent<T> {
	private T item;
	
	public Parent() {}
	
	public Parent(T item) {
		this.item = item;
	}
	
	public void showItem() {
		System.out.println("item >> "+item);
	}
	
}

class Child<T> extends Parent<T> {
	
	public Child() {};
	
	public Child(T t) {
		super(t);
	}
	
	public void showType(T t) {
		System.out.println("Type t >> " + t);
	}
	
//	public <T> void test(T t) {}				// 제네릭 클래스 안에서 제네릭 메소드를 생성할 때 같은 타입으로 지정하면 구분이 안되기 때문에
	public <E> void test(E e) {}				// 다른 타입으로 지정해줘야 함
}

public class GenericEx07 {
	public static void main(String[] args) {
		Child<String> child = new Child<String>();
		child.showType("홍길동");
		
		Child<String> child2 = new Child<String>("나는 홍길동");
		child2.showItem();
	}
}
