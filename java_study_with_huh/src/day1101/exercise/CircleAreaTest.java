package day1101.exercise;

import java.util.Scanner;

public class CircleAreaTest {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input radious: ");
		double r = scan.nextDouble();
		
		CircleArea circleArea = new CircleArea(r);
		System.out.println("The area of circle is " + circleArea.getCircleArea());
		
		scan.close();
	}
}
