package day1106.example;

public class CallPrintf {

	public static void main(String[] args) {
		int age = 20;
		double height = 179.2;
		String name = "YOON SUNG WOO";

		System.out.printf(" name: %s \n", name);
		System.out.printf(" age: %d \n height: %e \n\n", age, height);

		System.out.printf(" %d - %o - %x \n\n", 77, 77, 77);
		System.out.printf(" %g \n", 0.00014);
		System.out.printf(" %g \n", 0.000014);
		// %g는 소숫점 5번째 자리까지는 %f방식 즉, 실수표기법으로 표기하고
		// 소숫점 6번째 자리부터는 %e 즉 e표기법 기반으로 실수를 표현해준다.
	}

}
