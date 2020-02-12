package chapter02.practice;
import java.util.Random;

public class Q03 {

	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Random r = new Random();
		int num = 2 + r.nextInt(9);
		int[] a = new int[num];
		
		for(int i = 0; i < num; i++) {
			a[i] = r.nextInt(100);
			System.out.printf("a[%d] = %d\n", i, a[i]);
		}
		System.out.printf("int[] a의 총합은 %d", sumOf(a));
	}

}
