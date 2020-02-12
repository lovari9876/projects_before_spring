package chapter03.practice;

import java.util.Scanner;

// 일치하는 요소 중 맨 앞의 요소 찾기!!

public class Q5 {
	static int binSearchX(int[] a, int n, int key) {
//		n은 a.length
		int pl = 0; // 검색범위 시작점
		int pr = n - 1; // 검색범위 끝 = a의 길이-1		

		do {			
			int pc = (pl + pr) / 2; // 중앙 인덱스
			if (a[pc] == key) {
				for(int i = pc; a[i] == key; i--) {
					pc = i;
				}
				return pc;
			} else if (a[pc] < key)
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

		int i = binSearchX(a, n, key);
		if (i == -1)
			System.out.println("없어");
		else
			System.out.printf("%d는 a[%d]에 있습니다.", key, i);
	}
}