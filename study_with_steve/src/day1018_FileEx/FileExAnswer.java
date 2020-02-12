package day1018_FileEx;

import java.util.Scanner;
import java.io.*;

public class FileExAnswer {
	
	public static void file() {
		Scanner scanner = new Scanner(System.in);
		PrintWriter file = null;
		
		try {
			file = new PrintWriter("scoresT.csv");
			file.println("이름, 국어, 수학, 영어, 총점, 평점");
			
			while (true) {
				System.out.print("이름: ");
				String name = scanner.next();
				
				System.out.print("국어: ");
				int korean = scanner.nextInt();
				
				System.out.print("수학: ");
				int math = scanner.nextInt();
				
				System.out.print("영어: ");
				int english = scanner.nextInt();
				
				//저장하는 코드 작성
				
				System.out.print("중단은 q, 계속 입력은 아무 키나 눌러주세요: ");
				String key = scanner.next();
				if ("q".equalsIgnoreCase(key)) {
					//상수랑 변수 비교시 상수기준으로 해야 안전해!
					break;
				}
				
			
		}
	
		}
		}
}







