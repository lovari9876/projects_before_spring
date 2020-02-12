package day1108.exercise3;

import java.util.Random;

public class TestMInMax {

	public static void main(String[] args) {
		Random r = new Random();

		System.out.println("자동으로 배열을 만들겠습니둥");
		double arr[] = new double[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = r.nextInt(10) + r.nextDouble();
			System.out.printf("arr[%d] = %f\n", i, arr[i]);
		}
		
		System.out.println();
		System.out.println("최댓값과 최솟값 구한다.");
		MinMax minmax = new MinMax();
		System.out.println("최댓값: " + minmax.min(arr));
		System.out.println("최솟값: " + minmax.max(arr));
	}
}
