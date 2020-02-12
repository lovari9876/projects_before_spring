package day1121.exercise_IOStream;

import java.util.Scanner;
import java.io.*;

// 사용자로부터 두 개의 텍스트 파일 이름을 입력받고 첫번째 파일 뒤에
// 두번째 파일을 덧붙여 새로운 파일을 생성하는 프로그램을 작성하라.

public class ConcatFile {
	static void concatFile(Scanner sc) {
		System.out.print("파일 이름: ");
		String f1 = sc.next();
		System.out.print("덧붙일 파일 이름: ");
		String f2 = sc.next();
		System.out.print("새로 만들 파일 이름: ");
		String nf = sc.next();

		try (BufferedReader in1 = new BufferedReader(new FileReader(f1));
				BufferedReader in2 = new BufferedReader(new FileReader(f2));
				BufferedWriter out = new BufferedWriter(new FileWriter(nf))) {

//			쌤이 하신 간편한 답안!!
//			int data;
//
//			while ((data = in1.read()) != -1) {
//				out.write(data);
//			}
//
//			while ((data = in2.read()) != -1) {
//				out.write(data);
//			}

			
//			 내가 한 것...
// 결과:		 외계어 나온다.
// 왜??? : 조건에서도 읽고, 반복문 안에서도 읽고, read()를 두번씩 쓰니까 두번째, 즉 짝수번째
// 캐릭터만 배열에 넣은 것....
// => int data해주고 , 조건 안에서 한번만 read()써서 담기!!
// ==> 아래는 고친것!!		
			
			char[] ch = new char[10000];
			int i = 0;
			int data = 0;
			
			while ((data = in1.read()) != -1) {
				ch[i++] = (char) data;
			}
			
			while ((data = in2.read()) != -1) {				
				ch[i++] = (char) data;
			}			

//			이것이 두번씩 read() 쓴 오류 일으키는 방법!			
//			while (in1.read() != -1) {
//				ch[i] = (char) in1.read();
//				i++;
//			}
//			while (in2.read() != -1) {
//				ch[i] = (char) in2.read();
//				i++;
//			}

			String s = new String(ch); // 캐릭터 배열로 문자열 만들기
			out.write(s); // 파일에 쓰기
			
			System.out.println(s); // 시험삼아 프린트

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		concatFile(sc);
	}

}
