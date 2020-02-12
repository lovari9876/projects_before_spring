package chapter02.practice;

import java.util.Scanner;

// 70p
// 기수 변환 과정 자세히 나타내는 프로그램 작성하기
// 이건 성공??? 아니었다. 보요 이새끼 존나 !!!

public class Q07 {

	static int printCardConv(int x, int r, char[] d) {
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int digits = 0;
		System.out.printf("%d |\t%d\n", r, x);
		System.out.println("  +-------");
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
			if (x > 0) {
				System.out.printf("%d |\t%d ··· %d\n", r, x, x % r);
				System.out.println("  +-------");
			}
		} while (x != 0);

		System.out.println("   \t0");
		// digits까지만 역순정렬
		for (int i = 0; i < digits / 2; i++) {
			char temp = d[i];
			d[i] = d[digits - 1 - i];
			d[digits - 1 - i] = temp;
		}
		return digits;
	}

	static void printFormat(char[] d, int cdn) {
		System.out.printf("%d |\t", cdn);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n; // 변환할 정수
		int cdn; // cardinal number
		int dN; // digit num
		int retry; // 다시 한 번?
		char[] convN = new char[32];

		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				n = sc.nextInt();
			} while (n < 0);
			do {
				System.out.print("어떤 진수로 변환할까요?(2~36) : ");
				cdn = sc.nextInt();
			} while (cdn < 2 || cdn > 36);
			System.out.println();

			dN = printCardConv(n, cdn, convN);

			System.out.print(cdn + "진수로 ");
			for (int i = 0; i < dN; i++)
				System.out.print(convN[i]);
			System.out.print("입니다.");

			System.out.print("한 번 더 할까요? (1.예／0.아니오)：");
			retry = sc.nextInt();
			
			sc.close();
		} while (retry == 1);
	}

}
