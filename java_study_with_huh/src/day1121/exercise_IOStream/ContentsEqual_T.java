package day1121.exercise_IOStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ContentsEqual_T {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("파일 이름: ");
		String src = sc.next();
		System.out.print("비교할 파일 이름: ");
		String dst = sc.next();

		boolean equal = false;

		try (BufferedInputStream f1 = 
				new BufferedInputStream(new FileInputStream(src));
				BufferedInputStream f2 = 
						new BufferedInputStream(new FileInputStream(dst))) {
			
			int data1, data2;
			if (f1.available() != f2.available()) { // 파일의 길이가 다르면
				equal = false;
				System.out.println("파일 길이가 다릅니다.");
			} else {
				equal = true;
				// 파일 길이가 같을 때 두 파일이 같다고 가정하고 while을 돌리면
				while ((data1 = f1.read()) != -1) { // a가 파일의 끝을 만날때까지
					data2 = f2.read(); // b를 읽어들임
					if (data1 != data2) { // 중간에 한 글자라도 다르면
						equal = false; // 두 파일은 같지 않다.
						break; // while 탈출
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(equal == true)
			System.out.println("파일이 같습니다.");
		else
			System.out.println("파일이 서로 다릅니다.");
		
		sc.close();
	}
}
