package day1031.exercise;

//4. parameter i개 받아서 별 i층 만들고 층마다 층 수 만큼의 별 찍으쇼
//5. 인자 2개 받아서 (i, j) 일때 작은 수부터 큰 수까지 4번 규칙에 따라 층 만드쇼

//5번은 여러 번 해서야 성공....

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("만들고 싶은 별 탑의 층 수를 입력하시오: ");
		int num = scan.nextInt();
		starI(num);
		System.out.println();

		System.out.print("정수를 두 개 입력하세요: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		starI2(num1, num2);

		scan.close();
	}

	public static void starI(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void starI2(int num1, int num2) {
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			for (int i = 1; i <= num1; i++) {

				System.out.print("*");
			}

		}

	}

}
