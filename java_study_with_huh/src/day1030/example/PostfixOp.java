package day1030.example;

public class PostfixOp {

	public static void main(String[] args) {
		int num = 5;
		System.out.print((num++) + " ");
		System.out.print((num++) + " ");
		System.out.print(num + "\n");
		
		System.out.print((num--) + " ");
		System.out.print((num--) + " ");
		System.out.print(num);
		
		//1. 
		num = 5;
		System.out.println(num++);
		
		//2. 1은 풀어쓰면 다음과 같다.
		//; 다음에서야 ++연산을 실행한다.
		num = 5;
		System.out.println(num);
		num = num + 1;
	}
}
