class Fruit{
	String sort;
	int count;
	
	Fruit(){
		
	}
	
	Fruit(String sort,int count){
		this.sort=sort;
		this.count=count;
	}
	
	void fruitInfo() {
		System.out.printf("%s가 %d개 있습니다\n",this.sort,this.count);
	}
}


public class ArrayInstanceEx02 {
	public static void main(String[] args) {
		
		Fruit[] fruits = new Fruit[] {new Fruit("사과",3),
									  new Fruit("딸기",5),
									  new Fruit("망고",2)};
		
		for(Fruit fruit:fruits) {
			fruit.fruitInfo();
		}
		
	}
}
