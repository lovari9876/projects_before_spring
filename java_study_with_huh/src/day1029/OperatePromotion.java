package day1029;

public class OperatePromotion {
	public static void main(String[] args) {
		short num1 = 11;
		short num2 = 22;
//		short result = (num1 + num2);
//		위의 주석 코드는 오류가 난다. 결과값이 int형이기 때문..
		short result = (short)(num1 + num2);
		int result2 = num1 + num2; // 혹은 이렇게~
		System.out.println(result);
		
	}
}
