package day1030.example;

public class CompAssignOp {
	public static void main(String[] args) {
		
		//산술 연산자(arithmetic operator) 사용시!
		short num = 10;
		num = (short)(num + 77L); //명시적 형변환중..
		int rate = 3;
		rate = (int)(rate * 3.5); //형변환 안하면 컴파일 오류 발생
		System.out.println(num);
		System.out.println(rate);
		
		//Assignment Operator 사용시!
		num = 10; //short로 선언된 num이다!!
		num += 77L; //long을 더했지만 자동으로 short로 형변환 된다!!!
		rate = 3;
		rate *= 3.5; // 컴파일러가 자동으로 명시적 형변환 해주는 거야!!!
		System.out.println(num);
		System.out.println(rate);		
	}
}
