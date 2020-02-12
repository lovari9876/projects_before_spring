package day1108.exercise;
import java.util.Scanner;

public class TestArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		IArea tArea = new Triangle();
		System.out.println("삼각형의 넓이 구하기");
		System.out.println("너비와 높이를 차례로 입력하시오.");
		System.out.println("너비: ");
		System.out.println("높이: ");
		double width = scan.nextDouble();
		double height = scan.nextDouble();
		System.out.println("넓이는: " + tArea.area(width, height));
		
		System.out.println();
		
		IArea rArea = new Rectangle();
		System.out.println("사각형의 넓이 구하기");
		System.out.println("너비와 높이를 차례로 입력하시오.");
		System.out.println("너비: ");
		System.out.println("높이: ");
		width = scan.nextDouble();
		height = scan.nextDouble();
		System.out.println("넓이는: " + rArea.area(width, height));
		
		scan.close();
	}
}
