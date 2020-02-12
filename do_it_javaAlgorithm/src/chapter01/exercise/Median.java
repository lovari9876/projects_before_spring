package chapter01.exercise;

import java.util.Scanner;

//21p 실습문제
//세 정수의 중앙값 구하기

public class Median {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("세 정수를 차례로 입력하세요: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println("중앙값은: " + median(a, b, c));

		scan.close();
	}

	static int median(int a, int b, int c) {
		//1. a부터 차례로 크기 비교
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		// b<=c<=a 일때는
		// 조건에 쓰기 제일 복잡하므로 마지막에 써준다.
		//2. 값이 같은 경우는 다 처리해주었으니 이제 등호는 뺀다
		// else if니까
		// a < b이고 a > c 일 때
		else if (a > c)
			return a;
		// a < b이고 a < c 이고 b > c일 때
		else if (b > c)
			return c;
		// a < b 이고 b < c 일때
		else
			return b;
	}
}
