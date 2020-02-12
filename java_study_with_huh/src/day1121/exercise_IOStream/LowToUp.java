package day1121.exercise_IOStream;

import java.io.*;

// 텍스트 파일을 읽어 소문자로 된 영어 문자를 모두 대문자로 바꿔서 
// 출력하는 프로그램을 버퍼 스트림을 이용하여 작성하라.

public class LowToUp {
	static void lowToUp() {
		try (BufferedReader in = 
				new BufferedReader(new FileReader("LowToUp.txt"));) {
			// "I'm so TIRED... It's HARD to learn."
			String s = in.readLine();
			System.out.println(s.toUpperCase());
			// 출력만 바꿔서 하는거지 파일이 대문자로 바뀌는게 아니셈
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		lowToUp();
	}
}