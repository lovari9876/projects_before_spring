package day1030.example;

public class ArithOp {
	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 3;

		// 문자열과 int 연산 시 문자열로 형변환된다!!
		// 걍 String 되는것이야!!
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));

		char a = '1';
		int b = a - ' ';

//		이건 안된다.... 클래스라 그런듯
//		String c = "4";
//		int d = c - " ";

		System.out.println("num1 / num2 = " + (7.0 / 3.0));
		// 실수 연산이기 때문에 double형으로 출력

	}
}
