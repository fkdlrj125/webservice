package generic;

class Thing {
	private String id;
	private String name;
	
	public Thing() {}

	public Thing(String id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Tv extends Thing {
	@Override
	public String toString() {
		return "나는 새로운 TV입니다!";
	}
}

class Pen extends Thing {
	@Override
	public String toString() {
		return "나는 평생 사용 가능한 Pen이다!";
	}
}

class Box <T> {
	private T thing;

	public void store(T thing) {
		this.thing = thing;
	}
	
	public T out() {
		return this.thing;
	}
}

// [문제]
class Wrap <T> {
	T thing;
	 
	public void wrap(T thing) {
		this.thing =thing;
	}
	
	public T unWrap() {
		return this.thing;
	}
}

class Animal{}

public class GenericEx06 {
	
	// [문제] Pen을 포함한 부모의 타입으로 제한
	// Pen의 부모가 모두 올 수 있는 상태에서 컴파일을 하게 되면
	// 서로 관련없는 타입이 올 수도 있기 때문에 형변환으로 정확히 지정
	public static void unwrapGift(Wrap<? super Pen> wrap) {
		Thing thing = (Thing)wrap.unWrap();
		System.out.println(wrap.unWrap() instanceof Object);
		System.out.println(thing);
	}
	
	// 제네릭 타입을 메소드의 파라미터로 사용
	// 타입 파라미터는 상속관계를 인식하지 못함 -> 와일드 카드(?,unknown type)를 사용
	public static void openBox(Box<? extends Thing> box) {
		Thing thing = box.out();
		System.out.println(thing);
	}
	
	public static void main(String[] args) {
		Box<Tv> one = new Box<Tv>();
		one.store(new Tv());
		openBox(one);

		Box<Pen> two = new Box<Pen>();
		two.store(new Pen());
		openBox(two);
		
//		Box<Animal> three = new Box<Animal>();
//		three.store(new Animal());
//		openBox(three);
		
//		[문제]
		Wrap<Pen> pen = new Wrap<Pen>();
		pen.wrap(new Pen());
		unwrapGift(pen);
		
//		Wrap<Tv> tv = new Wrap<Tv>();
//		tv.wrap(new Tv());
//		unwrapGift(tv);
	}
}
