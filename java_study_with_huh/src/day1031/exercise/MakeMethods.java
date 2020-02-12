package day1031.exercise;

// 1. 파라미터 하나 받아서 원의 넓이 구하는 함수를 만드시오
// 2. 가로, 세로를 받아 삼각형의 넓이를 구하는 함수를 만드시오
// 3. 1부터 100까지의 자연수의 집합이 있을 때, 홀수의 합을 구하는 함수를 만드시오

public class MakeMethods {
	final double PI = 3.14;

	public double circleArea(double radious) {
		double circle = PI * radious * radious;
		return circle;
	}

	public double triangleArea(double width, double height) {
		double triangle = 0.5 * width * height;
		return triangle;
	}

	public int totalOfOddNum() {
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1)
				total = total + i;
		}
		return total;
	}

}
