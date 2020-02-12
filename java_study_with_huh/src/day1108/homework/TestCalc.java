package day1108.homework;

import java.util.Scanner;

public class TestCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");		
		int a = sc.nextInt();
		int b = sc.nextInt();
		String operator = sc.next();
		
		switch(operator) {
		case "+":
			Calc calc = new Add();
			calc.setValue(a, b);
			System.out.printf("%d %s %d = %d\n", a, operator, b, calc.calculate());
			break;
		case "-":	
			calc = new Sub();
			calc.setValue(a, b);
			System.out.printf("%d %s %d = %d\n", a, operator, b, calc.calculate());
			break;
		case "*":
			calc = new Mul();
			calc.setValue(a, b);
			System.out.printf("%d %s %d = %d\n", a, operator, b, calc.calculate());
			break;
		case "/":	
			calc = new Div();
			calc.setValue(a, b);
			System.out.printf("%d %s %d = %d\n", a, operator, b, calc.calculate());
		}
		
		sc.close();
	}
}
