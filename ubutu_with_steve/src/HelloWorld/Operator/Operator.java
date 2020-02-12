import java.util.Scanner;

class Operator {
	//Entry point(시작점)
	//메인 진입 함수
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int age, height;

	    System.out.print("input age: ");
	    age = scanner.nextInt();

	    System.out.print("input height: ");
	    height = scanner.nextInt();

	    boolean result = (age >= 20 && height >= 170);
	    System.out.println("나이가 스무살 이상이고 키가 170이상인 사람인가? " + result);
	      
	   
	    /*
	    전체 주석 처리하기~~   
	    int a, b;

	    System.out.print("input number a: ");
	    a = scanner.nextInt();

	    System.out.print("input number b: ");
	    b = scanner.nextInt();


	    System.out.println("a > b " + (a > b));
	    System.out.println("a >= b " + (a >= b));
	    System.out.println("a = b " + (a = b));
	    System.out.println("a <= b " + (a <= b));
	    System.out.println("a < b " + (a < b));
	    */
	}
}



