package day1121.exercise_IOStream;

import java.util.Scanner;
import java.io.*;

public class AnswerByT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("대상 파일: ");
		String src = sc.nextLine();
		System.out.print("사본 이름: ");
		String dst = sc.nextLine();

		try (BufferedReader in = new BufferedReader(new FileReader(src));
				BufferedWriter out = new BufferedWriter(new FileWriter(dst));) {

			int data;
			while ((data = in.read()) != -1) {
				if (data >= 97 && data <= 122) { // ascii코드의 범위가  소문자일때!
					out.write((char) (data - 32)); // 읽은 문자를 버퍼 출력 스트림에 씀
					// 읽은걸 대문자로 바꾸어서 캐릭터로 바꾸어 쓴다.
					System.out.print((char) (data - 32));
				} else {
					out.write(data);
					System.out.print((char) (data));
					// 대문자는 걍 변환없이 결과 읽어낸다.
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
