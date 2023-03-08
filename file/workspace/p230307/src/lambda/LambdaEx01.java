/*
 * 	[람다 표현식] 람다식, 람다, lambda expression
 * 	: Java 8부터 함수형 프로그래밍 지원을 위해 Lambda, Stream 도입
 * 	: 메소드를 하나의 식으로 표현
 * 	: lambda는 익명 함수(anonymous function)를 의미 -> 메소드명 없음
 * 	: 사실상 객체로 관리
 * 	
 * 	<< 특징 >>
 * 	- 메소드명과 반환형을 생략, return 키워드 대신 식(expression) 사용
 * 	- 람다식 내 지역변수 final
 * 
 * 	<< 장점 >>
 * 	- 코드 간결
 * 	- 가독성 높아짐
 * 	- 메소드 정의 없이 한 번에 처리 가능하므로 생산성 높아짐
 *	
 *	<< 단점 >>
 *	- 익명 함수이므로 재사용 불가능
 *	- 디버깅 어려움
 *	- 재귀로 부적합 
 *
 *	<< 문법 >> 
 *	- [형태 1]
 *		() -> 실행부					// 자동으로 리턴				
 *
 *	- [형태 2]
 *		(매개변수) -> 실행부			// 자동으로 리턴
 *
 *	- [형태 3]
 *		(매개변수, 매개변수) -> {
 *			실행부
 *			실행부
 *			return 값;
 *		}
 *	() : parameter - 메소드의 매개변수
 *	-> : arrow 	   - {} 실행(진행방향)
 *	{} : body	   - 메소드의 실행부(실행부가 한 줄이면 생략가능)
 *
 *	<< 활용 >>
 *	- 참조변수에 람다식을 저장 - 자바에선 람다식을 객체로 관리
 *	- return
 *	- 인수
 */

package lambda;

//	[함수형 인터페이스] 
//	: 추상 메소드가 1개 정의되어 있고, 람다식을 다루기 위한 인터페이스
//	: 추상 메소드는 반드시 1개만 정의 -> 람다식과 인터페이스가 1:1 대응(연결)
@FunctionalInterface
interface Mood {
	String howAreYouFeeling(String feel);
}

class Person implements Mood {

	public String howAreYouFeeling(String feel) {

		return "오늘 기분은? -> " + feel;

	}
}

public class LambdaEx01 {
	public static void main(String[] args) {

		Mood instance = new Person();
		String s = instance.howAreYouFeeling("똑같아");
		System.out.println(s);

//		<< 익명 클래스 >>
		Mood moodOne = new Mood() {
			@Override
			public String howAreYouFeeling(String feel) {
				return "[익명 클래스] 저는요 ~ >> " + feel;
			}
		};
		String one = moodOne.howAreYouFeeling("좋아요");
		System.out.println(one);

//		[형태 2] 위 코드를 더 간결하게
//		객체 생성 후, 메소드 호출
		System.out.println(new Mood() {
			public String howAreYouFeeling(String feel) {
				return "[익명 클래스] 더 간결하다! 기분은? " + feel;
			}
		}.howAreYouFeeling("신기하다!"));
		
//		<< 람다식 1-1>>
//		Mood moodOne = new Mood() {
//			@Override
//			public String howAreYouFeeling(String feel) {
//				return "[익명 클래스] 저는요 ~ >>" + feel;
//			}
//		};
//		생략 : method명, 반환형
//		명시 : 매개변수 타입, 매개변수명
		Mood moodTwo = (String feel) -> "[Lambda 1] 제 기분은 ~ >> " + feel;
		String two = moodTwo.howAreYouFeeling("신난다~!!!!!!");
		System.out.println(two);
		
//		<< 람다식 1-2>> 
//		생략 : method명, 반환형, 매개변수 타입
//		명시 : 매개변수명
		Mood moodThree = (feel) -> "[Lambda 2] 현재 기분은 ~ >> " + feel;
		String three = moodThree.howAreYouFeeling("쩔어요.");
		System.out.println(three);
		
//		<< 람다식 2 >>
//		System.out.println(new Mood() {
//			public String howAreYouFeeling(String feel) {
//				return "[익명 클래스] 더 간결하다! 기분은? " + feel;
//			}
//		}.howAreYouFeeling("신기하다!"));
//		System.out.println((String feel) -> {return "[익명 클래스] 더 간결하다! 기분은? "+feel;});
	}
}
