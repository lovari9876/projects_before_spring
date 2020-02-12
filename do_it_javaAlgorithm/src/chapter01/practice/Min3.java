package chapter01.practice;

//13p 연습문제02.
//세 값의 최솟값 구하는 min3 메서드 작성하기

import java.util.Scanner;

public class Min3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 3개를 차례로 입력하세요: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println(min3(a, b, c));
		
		scan.close();
	}

	static int min3(int a, int b, int c) {
		int min = a;
		if(min > b) 
			min = b;
		if(min > c)
			min = c;
		return min;
	}

}
