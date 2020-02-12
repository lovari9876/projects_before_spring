package chapter02.practice;

import java.util.Scanner;

public class Q06 {
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String digitChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] temp = new char[32];
		
		do {			
			temp[digits++] = digitChar.charAt(x % r);
			x /= r;			
		} while(x != 0);
		
		for (int i = 0; i < digits; i++) {
			d[i] = temp[digits - 1 - i];
		}
		return digits;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num;
		int cardNum;
		int digitNum;
		int retry;
		char[] convNum = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수: ");
				num = stdIn.nextInt();			
			} while (num < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) : ");
				cardNum = stdIn.nextInt();
			} while (cardNum < 2 || cardNum > 36);
			
			digitNum = cardConv(num, cardNum, convNum); //no를 cd진수로 변환
			
			System.out.print(cardNum + "진수로는 ");
			for (int i = 0; i < digitNum; i++) // 윗자리부터 차례로 읽는다
				System.out.print(convNum[i]);
			System.out.println("입니다.");
			
			System.out.println("한 번 더 할까요? (1.예/ 0.아니오)");
			retry = stdIn.nextInt();
		} while (retry == 1);
		
		stdIn.close();
	}

}
