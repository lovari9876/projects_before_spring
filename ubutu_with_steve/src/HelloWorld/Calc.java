import java.util.Scanner;

class Calc {
	//멤버로 정적상수 선언해주었기 때문에 클래스 내부에서 계속 사용 가능
	private static final double PI = 3.141592;

	public static void main(String[] args) throws Exception {

		//로컬 안에서만 참조가능한 로컬변수라서 중괄호 즉, 블럭 안에서만 사용 가능
		
		final double PI = 3.141592;
		//위의 파이는 =이 대입연산자가 아니라 ???
		int radious;
		Scanner scanner = new Scanner(System.in);

		System.out.print("input radious: ");
		radious = scanner.nextInt();

		System.out.println("Area of square : " + (radious * radious));
		System.out.println("Area of circle : " + PI * (radious * radious));
		System.out.println("Area of circle : " + Calc.PI * (radious * radious));
		System.out.println("");
	

	}	
}
