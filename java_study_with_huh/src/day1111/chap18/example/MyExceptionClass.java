package day1111.chap18.example;

import java.util.Scanner;

public class MyExceptionClass {

	public static void main(String[] args) {
		System.out.println("나이 입력: ");

		try {
			int age = readAge();
			System.out.printf("입력된 나이: %d \n", age);
		} catch (ReadAgeException e) {
			System.out.println(e.getMessage());
		}		
	}

	public static int readAge() throws ReadAgeException {
		Scanner kb = new Scanner(System.in);
		int age = kb.nextInt();
		kb.close();
		
		if (age < 0)
			throw new ReadAgeException(); // 예외의 발생!
		// 던지기 아니고 발생이라서 new!		
		
		return age;		
	}
}

// 예외 클래스를 직접 만들기
class ReadAgeException extends Exception {
	public ReadAgeException() {
		super("유효하지 않은 나이가 입력되었습니다. ");
	}	
}

