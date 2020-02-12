package chapter02.practice;
import java.util.Random;
// 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하세요.

public class Q04 {
	static void copy(int[] a, int[] b) {
		int num = ( a.length <= b.length) ? a.length : b.length;
		for(int i = 0; i < num; i++) {
			a[i] = b[i];
		}
	}	
	
	static void show(int[] a) {
		for(int i = 0; i < a.length; i++)
			System.out.printf("a[%d] = %d\n", i, a[i]);
	}
	
	public static void main(String[] args) {
		Random r = new Random();
		int numA = 2 + r.nextInt(9);
		int numB = 2 + r.nextInt(9);
		int[] a = new int[numA];
		int[] b = new int[numB];
		
		show(a);
		
		for(int i = 0; i < numB; i++) {
			b[i] = r.nextInt(100);
			System.out.printf("b[%d] = %d\n", i, b[i]);
		}
		
		System.out.println("복사합니다.");
		copy(a, b);		
		show(a);
	}
}
