//숫자 n(1과 9사이의 숫자)를 입력받아, 구구단을 출력하시오.

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws Exception {
	Scanner scanner = new Scanner(System.in);

	int num;	
	//숫자가 범위내의 숫자인지 일단 판별부터!!!
	do {
	    System.out.print("1부터 9까지의 숫자를 입력하시오: ");
	    num = scanner.nextInt();
	
	    if(num < 1 || num > 9)
		continue;
	    //if (num >= 1 && num <= 9) {
	    //do while을 안쓸경우 if로 대체가능
	    for (int i = 1; i<=9; i++) {
		int temp = num * i;
		System.out.format("%d x %d = %d\n", num, i, temp);
	    }
	    System.out.println("===========================");
	     
	}while (true);
    }   
}
