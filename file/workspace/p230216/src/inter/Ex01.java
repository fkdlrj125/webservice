package inter;


interface A{}

interface B{}

interface C extends A{}

// 다중 상속 가능
interface D extends A,B{}

class E{}
class F{}
class G extends E{}
// 다중 상속 불가
//class H extends E,F{}
// 클래스는 인터페이스를 extends로 상속할 수 없음
//class I extends A{}
// 클래스와 인터페이스가 상속관계를 만들 땐 implements
class J implements A{}

// 클래스를 상속하면서 인터페이스 상속가능
class K extends E implements A,B{}

// 클래스와 인터페이스를 동시에 상속할 때 같은 타입이 먼저 와야됨
//class L implements A extends E{}

//클래스가 인터페이스의 부모가 될 수 없음
//interface M implements E{}

public class Ex01 {
	public static void main(String[] args) {
		
	}
}
