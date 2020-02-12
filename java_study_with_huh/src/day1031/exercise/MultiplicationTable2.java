package day1031.exercise;
//1. 구구단 2단부터 9단까지 짝수단만 만들기!
//2. 결과값이 홀수인 구구단만 출력
//3. 9단부터 1단까지 찍으슈
//main method에서 원하는 메소드 실행가능

public class MultiplicationTable2 {
	public static void main(String[] args) {
//		multiplicationTableEven();
//		multiplicationTableEvenByT(); //best
//		multiplicationTableEvenByT2(); //걍....예시....
//		multiplicationValueIsOdd();
		multiplicationTableDesc();
	}

	//내 방법 좀 구려 ㅠㅠㅠㅠ
	public static void multiplicationTableEven() {
		System.out.println("===========");
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", 2 * i, j, 2 * i * j);
			}
			System.out.println("============");
		}
	}
	
	public static void multiplicationTableEvenByT() {
		System.out.println("===========");
		for (int i = 1; i < 10; i++) {
			if(i % 2 == 1)
				continue;
			//홀수면 밑으로 안내려가고 다시 조건으로 간다!!
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println("============");
		}
	}
	
	public static void multiplicationTableEvenByT2() {
		System.out.println("===========");
		for (int i = 1; i < 10; i++) {			
			for (int j = 1; j < 10; j++) {
				if(i % 2 == 1)
					break;
				//조건에 1 있는 for문으로 간다...
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println("============");
		}
	}

	public static void multiplicationValueIsOdd() {
		System.out.println("===========");
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (((i * j) % 2) == 1) {
					System.out.printf("%d x %d = %d\n", i, j, i * j);
				}
			}
			System.out.println("============");
		}
	}
	
	public static void multiplicationTableDesc() {
		System.out.println("===========");
		for (int i = 9; i >= 1; i--) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %-2d%2s", i, j, i * j, "");
			} 
			System.out.printf("\n");
		}
	}

}
