package day1018_FileEx;
// File Name: Score.txt
//"kor, math, eng"
//scanner int  50, 60, 70 do-while until press 'q'
import java.io.*;
import java.util.*;

//잉........오류났는디...왜그러는지 모르겠다참나ㅠㅠ
//알았다...while로 써야해...do-while 노노...
//파일은 내 프로젝트폴더에 생성된다.
public class FileEx {
	
	public static void main(String[] args) {
		writeScores();
	}
	
	public static void writeScores() {	
		Scanner scanner = new Scanner(System.in);
		PrintWriter file = null;
				
		try { 
			file = new PrintWriter("Scores.txt");
			file.println("name, kor, math, eng, sum, avg");
						
			while (true) {
				System.out.print("name: ");
				String name = scanner.next();
				
				System.out.print("kor: ");
				int kor = scanner.nextInt();
				
				System.out.print("math: ");
				int math = scanner.nextInt();
				
				System.out.print("eng: ");
				int eng = scanner.nextInt();
				
				int sum = kor + math + eng;
				double avg = sum / 3.0;
				
				// TO-DO: 저장하는 코드 작성.
				file.format("%s, %d, %d, %d, %d, %.2f\n",
						name, kor, math, eng, sum, avg);
				
				System.out.print("If you want to stop, press q. "
						+ "If you don't, press any key: ");
				String key = scanner.next();
				
				// TO-DO: 분기하는 코드 작성.
				if ("q".equalsIgnoreCase(key)) {
					//상수랑 변수 비교시 상수기준으로 해야 안전해!
					break;								
				}	
			} 		
		} catch (Exception ex) {
			ex.printStackTrace();			
		} finally {
			System.out.println("Complete score entry.");
			
			scanner.close();
			try {
				if (file != null) {
					file.flush();
					// 버퍼에 남은 데이터를 파일에 쓴다.
					file.close();
				}
			} finally {		
			}
		}
	}
}
