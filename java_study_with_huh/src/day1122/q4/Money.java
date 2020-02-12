package day1122.q4;

import java.util.Scanner;

// java,html1122_면접예상질문 4번 문제

class Money implements IProblem {
	public void changeDollarToKorea() {
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>> ");
		int won = sc.nextInt();

		double dollar = won / 1100.0;

		System.out.printf("%d원은 $%.1f입니다.\n\n", won, dollar);
	}

	public void showMeTheMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오>> ");
		int won = sc.nextInt();
		int num = 0; // 몇 매인지
		while (won > 0) {
			if ((num = won / 50000) > 0) {
				System.out.printf("오만원권 %d매\n", num);
				won %= 50000;
			}
			if ((num = won / 10000) > 0) {
				System.out.printf("만원권 %d매\n", num);
				won %= 10000;
			}
			if ((num = won / 1000) > 0) {
				System.out.printf("천원권 %d매\n", num);
				won %= 1000;
			}
			if ((num = won / 500) > 0) {
				System.out.printf("오백원 %d매\n", num);
				won %= 500;
			}
			if ((num = won / 100) > 0) {
				System.out.printf("백원 %d매\n", num);
				won %= 100;
			}
			if ((num = won / 50) > 0) {
				System.out.printf("오십원 %d매\n", num);
				won %= 50;
			}
			if ((num = won / 10) > 0) {
				System.out.printf("십원 %d매\n", num);
				won %= 10;
			}
			if ((num = won / 1) > 0) {
				System.out.printf("일원 %d매\n", num);
				won %= 1;
			}
		}
	}
}
