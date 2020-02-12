package day1031.example;

public class DefinitionAndCallOfMethod3 {

	public static void main(String[] args) {
		int result;
		result = adder(4, 5);
		System.out.println("4 + 5 = " + result);
		System.out.println("3.5 x 3.5 = " + square(3.5));
	}
	
	public static int adder(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult;
		//변수를 리턴 가능
	}

	public static double square(double num) { 
		return num * num; 
		//수식도 리턴 가능
	}
}
