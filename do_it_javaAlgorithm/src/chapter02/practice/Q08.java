package chapter02.practice;

import java.util.Scanner;

// 83p => 메서드 dayOfYear을 변수 i와 days 없이 구현, while문 사용

class Q08 {
	// 각 달의 일 수 
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
	};
	
	// 서기 year년은 윤년인가? (윤년: 1/ 평년: 0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1: 0);
	} // 400은 어차피 4로 나누어 떨어짐
	
	// 서기 y년 m월 d일의 그 해 경과 일 수를 구함 //m-1월까지의 일 수 더하기
	static int dayOfYear(int y, int m, int d) {	
		int validM = m-2; // m-2는 더해야 하는 month 인덱스 범위(0 ~ m-2))
		while (validM >= 0) {			
			d += mdays[isLeap(y)][(validM)--];
		}
		return d; 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 경과 일 수를 구합니다.");
		
		do {
			System.out.print("년: ");
			int year = sc.nextInt();
			System.out.print("월: ");
			int month = sc.nextInt();
			System.out.print("일: ");
			int day = sc.nextInt();
			
			System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
			
			System.out.println("한 번 더 할까요? (press 1)");
			retry = sc.nextInt();
			
			
		} while(retry == 1);
		
		sc.close();

	}

}
