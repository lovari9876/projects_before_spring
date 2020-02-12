package day1031.exercise;

public class Star {
	public static void main(String[] args) {
		star4();
		star5();
		star5_T(); //멋진 선생님의 방법
	}
	
	public static void star4() {
		System.out.println("star4");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void star5() {
		System.out.println("star5");
		for(int i = 1; i <= 5; i++) {
			for(int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void star5_T() {
		System.out.println("star5_T");
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


}
