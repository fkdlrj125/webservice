/*
 * 	[상속 관계]
 * 	
 * 	 <IS-A관계>
 *	- ~는 ~다. ex) 학생은 사람이다.	 o
 *			   ex) 사람은 학생이다.	 x
 *	부모 => 일반적,추상적,포괄적 | 자식 => 구체적
 *
 *	 <HAS-A관계> 소유 관계, 포함 관계
 *	- ~는 ~를 소유(포함)하고 있다. ex) 핸드폰은 카메라를 포함하고 있다. o
 *								   ex) 카메라는 핸드폰을 포함하고 있다. x
 *	- 상속으로 나타내면 부자연스러움
 *	  -> 부모를 객체로 생성해서 사용(containment) 
 */

class Gun{
	int bullet;
	
	public Gun(int bnum) {
		bullet = bnum;
	}
	public void shoot() {
		System.out.println("BBANG!");
		bullet--;
	}
	void showBullet() {
		System.out.println(bullet);
	}
}

class Police{
	int handcuffs;
	Gun pistol;			
	
	public Police(int bnum,int bcuff) {
		handcuffs=bcuff;
		if(bnum!=0) {
			pistol=new Gun(bnum);
		} else {
			pistol=null;
		}
	}
	
	public void putHandcuff() {
		System.out.println("SNAP!");
		handcuffs--;
	}
	
	public void shoot() {
		if(pistol==null) {
			System.out.println("Hut BBANG!");
		} else {
			pistol.shoot();
		}
	}
	
	void showInfo() {
		System.out.println(pistol.bullet);
		System.out.println(handcuffs);
	}
	
}

//class Police extends Gun{
//	int handcuffs;
//	
//	public Police(int bnum,int bcuff) {
//		super(bnum);
//		handcuffs=bcuff;
//	}
//	public void putHandcuff() {
//		System.out.println("SNAP!");
//		handcuffs--;
//	}
//	void showHandcuff() {
//		System.out.println(handcuffs);
//	}
//}

public class InheritanceEx05 {
	public static void main(String[] args) {
		Police pman = new Police(5, 3);
		pman.shoot();
		pman.putHandcuff();
		pman.showInfo();
	}
}
