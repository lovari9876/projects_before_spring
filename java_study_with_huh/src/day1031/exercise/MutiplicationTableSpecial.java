package day1031.exercise;

//인자 2개 받아서 (i, j) 일때 작은 수 단부터 큰 수 단까지 구구단만드쇼

import java.util.Scanner;

public class MutiplicationTableSpecial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 두 개 입력하세요: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
//		multiplicationTableSpecial(num1, num2);
		multiplicationTableSwap(num1, num2);

		scan.close();
	}

	private static void multiplicationTableSwap(int start, int end) {
		//end보다 start가 더 클 때 두 수 바꾸기!
		//How to swap!!!
		int temp;
		
		if(start > end) {
			temp = start;
			start = end;
			end = temp;
		}
		
		for (int i = start; i <= end; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println("============");
		}
	}

	//내 방법....중복 되는 코드 파트가 3구간이나 되고 장황하다....
	public static void multiplicationTableSpecial(int num1, int num2) {
		System.out.println("===========");
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d x %d = %d\n", i, j, i * j);
				}
				System.out.println("============");
			}
		} else if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d x %d = %d\n", i, j, i * j);
				}
				System.out.println("============");
			}
		} else {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", num1, j, num1 * j);
			}
			System.out.println("============");

		}
		
	}

}
