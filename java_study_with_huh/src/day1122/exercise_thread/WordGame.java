package day1122.exercise_thread;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

class WordGame {
	
	Vector<String> words = new Vector<>();
	String[] data = { "태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카" };

	int interval = 2 * 1000; // 2초
	WordGenerator wg = new WordGenerator();

	public static void main(String args[]) {
		@SuppressWarnings("resource") // sc 안닫았다고 난리치니까 경고누르기
		Scanner sc = new Scanner(System.in); // 닫는 순간 오류남..
		WordGame game = new WordGame();
		game.wg.start(); // inner class라서.
		Vector<String> words = game.words;

		while (true) {
			// 주의: 배열에 2초마다 하나씩 요소 추가되도록 만들었지만,
			// while문이 진행되려면 중간에 스캐너 한번 입력해야 하기에
			// 입력하고 엔터 쳐줘야 다음 배열이 출력된다!!!
			System.out.println(words); // 배열 기반 벡터 출력
			String prompt = ">> ";
			System.out.print(prompt);
			// 화면으로부터 라인단위로 입력받는다.
			
			String input = sc.nextLine().trim();
			int index = words.indexOf(input);
			// 벡터 words에서 input의 인덱스 알려준다. 없으면 -1리턴

			if (index != -1) { // words에 input이 존재하면,
				words.remove(index);
				// words에서 index 위치의 요소 삭제.
			}			
		} 
	}	

	class WordGenerator extends Thread {
		public void run() {
			Random r = new Random();
			/*
			 * (1) 아래의 로직에 맞게 코드를 작성하시오.
			 *  1.interval(2초)마다 배열 data의 값 중 하나를 임의로 선택해서 
			 *  2.words에 저장한다.
			 */
			while (true) {				
				int idx = r.nextInt(9);
				words.add(data[idx]);
				 
				try {
					sleep(interval);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
