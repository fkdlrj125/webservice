package polymorphism;

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	public Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	public Computer() {
		super(200);
	}

	@Override
	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1100;
	int bonusPoint = 0;
	int totalprice = 0;
	String[] buylist = new String[10];
	int length = buylist.length - 1;
	int pointer = -1;

	void buy(Product p) {
		if (pointer >= length) {
			System.out.println("바구니가 넘쳤습니다.");
			return;
		} else if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		totalprice += p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
		buylist[++pointer] = p.toString();
	}

	void summary() {
		System.out.printf("구입하신 물품의 총금액은 %d만원입니다.\n", totalprice);
		System.out.print("구입하신 제품은 ");
		for (int i = 0; i <= pointer; i++) {
			System.out.print(buylist[i] + ", ");
		}
		System.out.printf("입니다.");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Tv());
		b.summary();
	}
}
