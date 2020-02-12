package day1031.exercise;
// 1. 구구단 2단부터 9단까지 전체 출력되도록 만들기!

public class MultiplicationTable {

	public static void main(String[] args) {
		multiplicationTableDeco();
	}
	
	public static void multiplicationTable() {
		System.out.println("===========");
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
			System.out.println("============");			
		}
	}
	
	public static void multiplicationTableDeco() {
		System.out.println("===========");
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
			System.out.println("============");			
		}
	}
}













