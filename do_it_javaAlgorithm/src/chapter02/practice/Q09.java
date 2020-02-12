package chapter02.practice;

import java.util.Scanner;

// 83p => 그 해 남은 일 수를 구하는 메서드 작성
// static int leftDayOfYear(int y, int m, int d);

class Q09 {
	// 각 달의 일 수 
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
	};
	
	// 서기 year년은 윤년인가? (윤년: 1/ 평년: 0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1: 0);
	} // 400은 어차피 4로 나누어 떨어짐
	
	static int leftDayOfYear(int y, int m, int d) {
		int validM = m - 2; // m-2는 더해야 하는 month 인덱스 범위(0 ~ m-2))
		int leftDays;
		while (validM >= 0) {			
			d += mdays[isLeap(y)][(validM)--];
			
		}
		
		if(isLeap(y) == 0)
			leftDays = 365 - d;
		else
			leftDays = 366 - d;
		return leftDays;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 남은 일 수를 구합니다.");
		
		do {
			System.out.print("년: ");
			int year = sc.nextInt();
			System.out.print("월: ");
			int month = sc.nextInt();
			System.out.print("일: ");
			int day = sc.nextInt();
			
			System.out.printf("그 해 남은 일 수는 %d입니다.", leftDayOfYear(year, month, day));
			
			System.out.println("한 번 더 할까요? (press 1)");
			retry = sc.nextInt();
			
			
		} while(retry == 1);
		
		sc.close();

	}

}
