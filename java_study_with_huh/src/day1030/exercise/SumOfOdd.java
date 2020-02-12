package day1030.exercise;
//1. 1부터 100까지의 숫자 중에 홀수의 합을 구하시오.
//2. 구구단 7단 출력

public class SumOfOdd {
	static int level = 7;
	
	public static void main(String[] args) {
		System.out.println("홀수의 합은 " + total());
		System.out.println();		
		multiplicationOf7();
	}
	
	public static int total() {
		int temp = 0;
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				temp = temp + i; 
			}
		}
		return temp;
	}
	
	public static void multiplicationOf7() {
		int num = 0;
		for (int i = 1; i <= 9; i++) {
			num = level * i;
			System.out.printf("%d x %d = %d\n", level, i, num); 
		}
	}

}
