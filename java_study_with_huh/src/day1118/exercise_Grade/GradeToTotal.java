package day1118.exercise_Grade;

import java.util.*;
import java.util.Scanner;

public class GradeToTotal implements Totalable {			
	public void printAVG() {
		List<Character> gList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("6개의 학점을 빈칸으로 분리 입력(A/B/C/D/F) >> ");		
		
		for(int i=0;i<6;i++) {	
			char c = sc.next().charAt(0);		
			gList.add(c);
		}
		
		// for문 위처럼 돌리든 아래처럼 while 돌리든 상관 없셈
		//while(gList.size() < 6) {	
		//	char c = sc.next().charAt(0);		
		//	gList.add(c);
		//} // 문자열로 읽되, 한글자씩 입력할거니까 문자열의 첫번째 인덱스가 곧 
		// 내가 얻고 싶은 문자.
		
		
		Iterator<Character> itr = gList.iterator();
		double sum = 0;
		while(itr.hasNext()) {
			
//			System.out.println(itr.next());
//			cursor 위치 확인용! 
			
			char c = itr.next(); // 커서 계속 넘어가니까
			// 꼭 대입해두고 if문 돌리기!!
			if (c == 'A') {
				sum += 4.0;
			} else if(c == 'B') {
				sum += 3.0;
			} else if(c == 'C') {
				sum += 2.0; 
			} else if(c == 'D') {
				sum += 1.0;
			} else // 'F'
				sum += 0.0;			
		}
		double avg = sum / 6;
		
		sc.close();
		System.out.println(avg);
	}
}
