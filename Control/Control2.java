package Control;

import java.util.Scanner;

public class Control2 {
    public static void main(String[] args) {

	//성별을 입력받아
	//M이면 남성, F이면 여성을 출력.
	String gender;
	Scanner scanner = new Scanner(System.in);

	System.out.print("성별을 입력하시오: ");
	gender = scanner.next();

	//equalsIgnoreCase() 메소드는 대소문자를 구분하지 않고 비교한다.
	//equals() 메소드는 대소문자를 구분하여 비교하므로 
	//원하는 비교 형태를 확인하고 선택하여 사용하기
	if (gender.equalsIgnoreCase("M")) {
	    System.out.println("남성");
	} else if (gender.equalsIgnoreCase("F")) {
	    System.out.println("여성");
	}
	
    }
}