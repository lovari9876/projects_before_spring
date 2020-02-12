package day1106.example;

import java.util.Scanner;

public class ScannerNextLIne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력: ");
		String str1 = sc.nextLine();
		// NEXTLINE() 사용시 띄어쓰기를 인정한다.
		// 엔터칠 때까지 읽어들인다!!

		System.out.print("문자열 입력: ");
		String str2 = sc.nextLine();

		System.out.printf("입력된 문자열 1: %s \n", str1);
		System.out.printf("입력된 문자열 2: %s \n", str2);

		sc.close();
	}

}
