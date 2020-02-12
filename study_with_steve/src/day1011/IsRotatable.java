package day1011;
//셤문제이다
//어떤 수가 rotatable인지 검사해보자.

public class IsRotatable {
	public static int rotateDigit(int digit) {
		switch (digit) {
			case 0: 
			case 1:
			case 8:
				return digit;
			case 6:
				return 9;
			case 9:	
				return 6;
			default:
				return -1;		
		}
	}	

	public static boolean isRotatable(int number) {
		int num = number;
		int sum = 0;
		//while문 내부는 어떤 수를 한자리씩 분리하여 처리 하기 위한 코드들
		while (number > 0) {
			//조건의 의미: 더 이상 비교할 자리수가 없다.
			int temp = rotateDigit(number % 10);
			if (temp == -1)
				return false;
					
			sum = sum * 10 + temp;
			number /= 10;
			//자리수를 한자리씩 줄이는 것
		}
		return num == sum;
	}
	
	public static void main(String[] args) {
		System.out.format("%d is rotatable: %b\n", 123, isRotatable(123));
		System.out.format("%d is rotatable: %b\n", 609, isRotatable(609));	
		System.out.format("%d is rotatable: %b\n", 808, isRotatable(808));
	
	}
	
}