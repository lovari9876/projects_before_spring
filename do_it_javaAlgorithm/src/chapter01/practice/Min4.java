package chapter01.practice;

//13p 연습문제03.
//네 값의 최솟값 구하는 min4 메서드 작성하기

import java.util.Scanner;

public class Min4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("네 정수를 차례로 입력하세요: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		System.out.println(min4(a, b, c, d));
		scan.close();
	}

	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		if (min > d)
			min = d;

		return min;
	}

}
