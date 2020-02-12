package chapter02.practice;

import java.util.Random;
// 배열 b의 모든 요소를 배열 a에 역순으로 복사하는
// 메서드 rcopy를 작성하세요.

public class Q05 {
//	이렇게 할 필요 없었다....
//	static void swap(int[] a, int i, int j) {
//		int temp = a[i];
//		a[i] = a[j];
//		a[j] = temp;
//	}
//
//	static void reverse(int[] a) {
//		for (int i = 0; i < a.length / 2; i++) {
//			swap(a, i, a.length - 1 - i);
//		}
//	}

	static void rcopy(int[] a, int[] b) {		
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++) {
			a[i] = b[b.length - 1 - i];
		}
	}

	public static void main(String[] args) {
		Random r = new Random();
		int numA = 2 + r.nextInt(9);
		int numB = 2 + r.nextInt(9);
		int[] a = new int[numA];
		int[] b = new int[numB];

		System.out.println("배열 a의 요소값을 정합니다.");
		for (int i = 0; i < numA; i++) {
			a[i] = r.nextInt(100);
			System.out.printf("a[%d] = %d\n", i, a[i]);
		}
		System.out.println();

		System.out.println("배열 b의 요소값을 정합니다.");
		for (int i = 0; i < numB; i++) {
			b[i] = r.nextInt(100);
			System.out.printf("b[%d] = %d\n", i, b[i]);
		}
		System.out.println();

		System.out.println("배열 b의 모든 요소를 배열 a에 역순으로 복사합니다.");
		rcopy(a, b);
		for (int i = 0; i < a.length; i++) {			
			System.out.printf("a[%d] = %d\n", i, a[i]);
		}
	}

}
