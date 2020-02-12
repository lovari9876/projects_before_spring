package day1029;

public class IntegerLiterals {
	public static void main(String[] args) {
		integerLiterals();
		longLiterals();
	}
	
	public static void integerLiterals() {
		int num1 = 123;
		int num2 = 0123;
		int num3 = 0x123;
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		
		System.out.println("11 + 22 + 33 = " + (11 + 22 + 33));
		System.out.println("011 + 022 + 033 = " + (011 + 022 + 033));
		System.out.println("0x11 + 0x22 + 0x33 = " + (0x11 + 0x22 + 0x33));
	}
	
	public static void longLiterals() {
		//System.out.println(314743548647 + 314544748648);
		//너무 숫자 커서 오류 발생
		System.out.println(314743548647L + 314748648525L);		
	}
	
	public static void more() {
		byte seven = 0B111;
		int num201 = 0b11001101;
		//이진수 표현
		int num = 100_000_000;
		int num2 = 12_34_56_78;
		//이렇게 언더바 넣으나 안넣으나 같아
		
		//d나 D 붙이나 안붙이나 더블 표현가능
		double a = 3.4e3;
		double a2 = 3.4e3D;
	}
}
