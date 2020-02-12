package chapter02.practice;
import java.util.Scanner;

// 61p 연습문제 2번
// 배열 요소를 역순으로 정렬하는 과정을 
// 하나 하나 나타내는 프로그램을 작성하세요.

class Q02 {
	static void swap(int arr[], int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	
	static void show(int[] arr) {
		for (int e : arr)
			System.out.printf("%d ", e);
		System.out.println();
	}

	static void reverse(int[] arr) {
		show(arr);
		
		for (int i = 0; i < arr.length / 2; i++) {
			swap(arr, i, arr.length - 1 - i);
			System.out.printf("a[%d]과(와) a[%d]를 교환합니다.\n", i, arr.length - 1 - i);
			show(arr);
		}
		System.out.println("역순 정렬을 마쳤습니다.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[] { 5, 10, 73, 2, -5, 42 };

		reverse(arr);
		
		sc.close();
	}
}
