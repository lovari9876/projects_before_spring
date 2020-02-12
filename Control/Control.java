package Control;

import java.util.Scanner;

public class Control {
    public static void main(String[] args) {

	//정수를 입력 받아서
	//양의 정수면 양수라 출력하고, 
	//음의 정수면 음수라 출력하시오.

	int integer;
	Scanner scanner = new Scanner(System.in);

	System.out.print("정수를 입력하시오: ");
	integer = scanner.nextInt();

	if (integer > 0) {
	    System.out.println("양수입니다.");
	} else if (integer < 0) {
	    System.out.println("음수입니다.");
	} else {
	    System.out.print("");
	}
	
    }
}