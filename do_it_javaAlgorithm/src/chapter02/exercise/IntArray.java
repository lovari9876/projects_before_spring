package chapter02.exercise;

public class IntArray {
	public static void main(String[] args) {
		int[] a = new int[5];
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;
		// int[] a = new int[] {0, 37, 51, 0, 74}
		// int[] a = {0, 37, 51, 0, 74}
		// 위 2가지는 결과가 완전히 같다!! 컴파일러가 자동으로 배열 객체를 생성해줘
		// 값을 넣지 않은 int형 변수의 디폴트 값은 0이다.
		
		for(int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
