package day1108.exercise2;
import java.util.Scanner;

public class TestArea2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삼각형의 넓이 구하기");
		System.out.println("너비와 높이를 차례로 입력하시오.");
		System.out.println("너비: ");
		System.out.println("높이: ");
		double width = scan.nextDouble();
		double height = scan.nextDouble();
		IArea2 tArea = new Triangle(width, height);		
		System.out.println("넓이는: " + tArea.area());
		
		System.out.println();
		
		System.out.println("사각형의 넓이 구하기");
		System.out.println("너비와 높이를 차례로 입력하시오.");
		System.out.println("너비: ");
		System.out.println("높이: ");
		width = scan.nextDouble();
		height = scan.nextDouble();
		IArea2 rArea = new Rectangle(width, height);
		System.out.println("넓이는: " + rArea.area());
		
		scan.close();
	}
}
