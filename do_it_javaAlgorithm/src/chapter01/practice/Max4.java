package chapter01.practice;

// 13p 연습문제01.
// 네 값의 최댓값 구하는 max4 메서드 작성하기

import java.util.Scanner;

public class Max4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 4개를 차례로 입력하세요: ");

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		System.out.println("최댓값은 " + max4(a, b, c, d));

		scan.close();
	}

	static int max4(int a, int b, int c, int d) {
		int max = a;

		if (max < b)
			max = b;
		if (max < c)
			max = c;
		if (max < d)
			max = d;

//		  필요없다. 왜냐면 max보다 d가 작을땐 안넘어간다.
//		  } else if (max < d) { max = d;
//		
//			}
//		} else if (max < c) {
//			max = c;
//			if (max < d)
//				max = d;
//		} else if (max < d)
//			max = d;

		return max;
	}

}
