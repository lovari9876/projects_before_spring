package chapter03.practice;

import java.util.Scanner;

public class Q4 {
	static int printBinSearch(int[] a, int n, int key) {
//		n은 a.length
		int pl = 0; // 검색범위 시작점
		int pr = n - 1; // 검색범위 끝 = a의 길이-1

		System.out.print("   |  ");
		for (int i = 0; i < n; i++) {
			System.out.print(i + "  ");
		}
		System.out.println();
		System.out.print("---+");
		for (int i = 0; i <= n; i++) {
			System.out.print("---");
		}
		System.out.println();

		do {
			System.out.printf("   | <-");
			int pc = (pl + pr) / 2; // 중앙 인덱스
			for (int i = 0; i < ((pc - pl) * 3 - 1); i++) {
				System.out.print(" ");
			}
			System.out.print("+");
			for (int i = 0; i < (3 * (pc - pl) - 2); i++) {
				System.out.print(" ");
			}
			System.out.printf(" ->\n");

			System.out.printf("  %d|", pc);
			for (int e : a) {
				System.out.print("  " + e);
			}
			System.out.printf("\n   |\n");

			if (a[pc] == key)
				return pc;
			else if (a[pc] < key)
				pl = pc + 1;
			else
				pr = pc - 1;
		} while (pl - pr <= 0);

		return -1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수: ");
		int n = sc.nextInt();

		int[] a = new int[n];

		System.out.println("한자리 수만 입력해라.");
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] : \n");
			a[i] = sc.nextInt();
		}

		System.out.print("찾을 요소: ");
		int key = sc.nextInt();

		int i = printBinSearch(a, n, key);
		if (i == -1)
			System.out.println("없어");
		else
			System.out.printf("%d는 a[%d]에 있습니다.", key, i);
	}
}
