
public class TypeCastingEx01 {
	
	public static void main(String[] args) {
		
		//형변환(Type Casting)
		//강제 형변환, 명시적 형변환
		//자동 형변환, 묵시적 형변환
		
		
		int n1=9;
		int n2=2;
		
		System.out.println("n1 / n2 : "+ n1 / n2);
		System.out.println("n1 / n2 : "+ (float)/*명시적 형변환,
		강제 형변환*/n1 / n2/*,묵시적 형변환,자동 형변환*/);
		
		//형변환2
		
		int num = 100;
		short sh = (short)num;//강제 형변환 : 큰 크기 -> 작은 크기,
		long lo = num;		  //자동 형변환 : 작은 크기 -> 큰 크기
		float fl = num;		  //정수가 실수로 바뀌는 건 자동 형변환
		
	}
}
