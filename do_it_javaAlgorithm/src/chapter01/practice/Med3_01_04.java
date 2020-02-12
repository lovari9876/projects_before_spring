package chapter01.practice;

//22p 연습문제
//세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값 출력
//경우의 수는 절대 그냥 머리로 하지 말고 공책에 써서 하자...

public class Med3_01_04 {
	public static void main(String[] args) {
		System.out.println("median(3,3,3) = " + median(3,3,3));
		System.out.println("median(3,3,2) = " + median(3,3,2));
		System.out.println("median(3,2,2) = " + median(3,3,3));
		System.out.println("median(3,2,1) = " + median(3,3,3));		
		System.out.println("median(2,2,3) = " + median(3,3,3));		
		System.out.println("median(2,1,3) = " + median(3,3,3));
		System.out.println("median(3,1,2) = " + median(3,3,3));		
		System.out.println("median(3,2,3) = " + median(3,3,3));
		System.out.println("median(2,3,1) = " + median(3,3,3));
		System.out.println("median(1,3,2) = " + median(3,3,3));
		System.out.println("median(2,3,2) = " + median(3,3,3));
		System.out.println("median(1,2,3) = " + median(3,3,3));
		System.out.println("median(2,3,3) = " + median(3,3,3));
	}

	static int median(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}
}