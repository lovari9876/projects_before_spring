package day1018_FileEx;

import java.io.*;
import java.util.*;

public class FileTeacher {

	public static void main(String[] args) {
		writeScores();
	}

	public static void writeScores() {
		Scanner scanner = new Scanner(System.in);
		PrintWriter file = null;

		try {
			file = new PrintWriter("scores.csv");
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
				
				// TO-DO: 저장하는 코드 작성.
				file.format("%s, %d, %d, %d, %d, %.2f\n",
						name, korean, math, english, 0, 0.0);

				System.out.print("중단은 q, 계속입력은 아무키(any)나 눌러주세요:");
				String key = scanner.next();

				// TO-DO: 분기하는 코드 작성.
				if ("q".equalsIgnoreCase(key)) {
					break;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("성적 입력을 완료합니다.");

			scanner.close();
			try {
				if (file != null) {
					file.flush(); // 버퍼에 남은 데이터를 파일에 쓴다.
					file.close();
				}
			} finally {
			}
		}
	}
}
