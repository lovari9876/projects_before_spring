package day1106.exercise;

import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Circle[] circle = new Circle[3];

		for (int i = 0; i < circle.length; i++) {
			System.out.print("x,y,radious >> ");

			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			circle[i] = new Circle(x, y, radius);
		}

		for (Circle c : circle)
			c.show();
		
		sc.close();
	}

}
