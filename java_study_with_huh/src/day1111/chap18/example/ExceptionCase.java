package day1111.chap18.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
			System.out.print("a/b...a? ");
			int n1 = kb.nextInt();
			System.out.print("a/b...b? ");
			int n2 = kb.nextInt();
			System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2); // 예외 발생 지점			
		} catch(InputMismatchException e) {
			// try 안에서 발생할 에러의 해당 클래스와 객체이름을 catch 괄호 안에 넣어준다.
			// 그러면 에러 발생 시 JVM이 캐치하여 객체에 에러 발생 주소를 넣어준다.
			// 그 후 catch 내부의 실행문을 실행한다.
			
			// 이렇게 해당 에러가 아니면 catch문을 두개 이상 쓸 수 있다.
			// catch는 순차적으로 진행된다.
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(ArithmeticException e) {			
			System.out.println(e.getMessage());
			e.printStackTrace();
//		} catch(InputMismatchException | ArithmeticException e) {
			// 이렇게 한번에 해줄 수도 있다
		}
		System.out.println("Good bye~~~!");
		
		kb.close();
	}

}
