//숫자 n(1과 9사이의 숫자)를 입력받아, 구구단을 출력하시오.

import java.util.Scanner;

public class Star1Answer {
    public static void main(String[] args) throws Exception {
	Scanner scanner = new Scanner(System.in);
	String pattern = "*";
	
	//정수 외의 값 입력시 예외 빼주기
	//일단 스트링으로 받고 받은 값을 정수로 바꿔주기
	String input = Scanner.next();
	input.charAt

	
	int num = scanner.nextInt();
	
	for (int i = 1; i <= num; i++) {
	    System.out.format(String.format("%%%ds\n", n), pattern);
	    pattern += "*"
	}	   

    }
}

/*
//n을 10으로 지정~~
String str = "*";
System.out.format("%10s\n", str);
str+= "*";

String.format("%%%ds\n", n);
// n이 10이라면 출력은 %10s\n

n= 10;
System.format("%d", n);

 n자리의 문자열을 어떻게 만드냐?
 %ns => %% + %d(정수 n 받아) + s = %%%ds

 //아래 두 코드는 동일함
 System.out.format(String.format("%%%ds\n", n), pattern);
 System.out.format("%10s\n", pattern);
*/

