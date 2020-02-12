package day1029;

public class DataTypeConversion {
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		System.out.println(b + s);
		//결과값은 int가 된다!!!!!!!!!!!!		
		//int 이전 데이터들과 int연산시 무조건 int로 변한다!!
		
		int num = 123;
		float f = 1.4f;
		
		System.out.println(num + f);
		System.out.println((int)f);
		//암시적 형변환과 명시적 형변환!!!
		
		long l = 300000000000L;
		int i = (int)l;
		System.out.println(i);
		//걍 인정사정없이 잘라낸다..........
		//-647710720 나옴
		
		int num1 = 3;
		double num2 = 4.0;
		double result = num1/num2;
		System.out.println(result);
		
		//방법 2
		int num3 = 3;
		int num4 = 4;
		double result2 = (double)num3/num4;
		System.out.println(result2);
	}
}
