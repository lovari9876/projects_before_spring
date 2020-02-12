package day1106.exercise;

import java.util.Scanner;

//테스트 클래스 MyMathTest 를 만든 후
//int 배열의 구성 요솟값 5개를 키보드 입력으로 받아서 
//myMin, myMax 함수 호출할것.

public class MyMathTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] intArray = new int[5];

		System.out.print("정수 5개를 차례로 입력하시오: ");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
		}

		System.out.println("최댓값은 " + MyMath.myMax(intArray));
		System.out.println("최솟값은 " + MyMath.myMin(intArray));

		scan.close();
	}
}
