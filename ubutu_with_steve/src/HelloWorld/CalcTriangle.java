import java.util.Scanner;

class CalcTriangle {
	private static final double A = 0.5;
	public static void main(String[] args) throws Exception {

		final double PI = 3.141592;
		int base, height;
		Scanner scanner = new Scanner(System.in);

		System.out.println("input base: ");
		base = scanner.nextInt();
		System.out.println("input height: ");
		height = scanner.nextInt();

		System.out.println("Area of triangle : " + (base * height * A));
		//System.out.println("Area of triangle : " + (base * height /2.0)); 도 같은 결과 나온다.
		System.out.println("");
	

	}	
}
