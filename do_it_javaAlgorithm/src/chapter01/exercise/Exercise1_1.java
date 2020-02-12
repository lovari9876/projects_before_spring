package chapter01.exercise;
//13p 세 값의 최댓값

//3개의 정숫값 가운데 최댓값을 구하는 프로그램 
//변수 a, b, c 에 들어가는 값은 키보드에서 입력한것 
//그 3개의 값중 최댓값을 변수 max로 찾기

import java.util.Scanner;

public class Exercise1_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개를 차례대로 입력하세요: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
//		int max = 0;
//		if (a > b) {
//			max = a;
//			if (a < c) {
//				max = c;
//			}
//		} else if (a < b) {
//			max = b;
//			if (b < c) {
//				max = c;
//			}			
//		} 

		int max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		System.out.println("최댓값은 " + max);

		scan.close();
	}
}
