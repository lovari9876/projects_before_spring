package day1029;

public class Constants {
	public static void main(String[] args) {
		final int MAX_SIZE = 100;
		final char CONST_CHAR = '상';
		final int CONST_ASSIGNED;
		
		CONST_ASSIGNED = 12;
		System.out.println("상수1 : " + MAX_SIZE);
		System.out.println("상수2 : " + CONST_CHAR);
		System.out.println("상수3 : " + CONST_ASSIGNED);
		circle();
	}
	
	public static void circle() { 
		final double PI = 3.14; //파이는 변하면 안되는 값! 그래서 상수 처리 고고링!!
		double radious = 5;
		
//		PI = 3.252; // 이렇게 바꿀수가 없게 된다!
		
		System.out.println(PI * radious * radious);
		
		//그리고 대입해준 숫자인 3.14와 5는 literal constant라고 한다!
		//문자 그대로 그냥 상수라는 것!!!!
		//그냥 숫자는 리터럴인 것~~~
	}
}
