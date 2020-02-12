package day1031.exercise;

import java.util.Scanner;

public class Main_MakeMethods {
	public static void main(String[] args) {
		MakeMethods makeMethods = new MakeMethods();
		Scanner scan = new Scanner(System.in);

		System.out.print("반지름을 입력하시오: ");
		double radious = scan.nextDouble();
		System.out.printf("원의 넓이는 %.2f\n", makeMethods.circleArea(radious));
		System.out.println("=====================");

		System.out.print("가로를 입력하시오: ");
		double width = scan.nextDouble();
		System.out.print("세로를 입력하시오: ");
		double height = scan.nextDouble();
		System.out.println("삼각형의 넓이는 " + makeMethods.triangleArea(width, height));
		System.out.println("=====================");

		System.out.println("1부터 100까지의 합은 " + makeMethods.totalOfOddNum());
		System.out.println("=====================");

		scan.close();
	}

}
