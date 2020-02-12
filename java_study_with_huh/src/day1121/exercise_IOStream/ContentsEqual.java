package day1121.exercise_IOStream;

import java.io.*;
import java.util.Scanner;

// 사용자로부터 두 개의 파일 이름을 입력받고 두 파일의 내용을 비교하여
// 같으면 "파일이 같습니다."를, 틀리면 "파일이 서로 다릅니다."를
// 출력하는 프로그램을 작성하라.
// 비교 대상인 파일은 텍스트 및 바이너리 파일 모두를 포함한다.

class ContentsEqual {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("파일 이름: ");
		String f1 = sc.next();
		System.out.print("비교할 파일 이름: ");
		String f2 = sc.next();

		try (BufferedInputStream in1 = 
				new BufferedInputStream(new FileInputStream(f1));
				BufferedInputStream in2 = 
						new BufferedInputStream(new FileInputStream(f2))) {
			boolean flag = true;
			int data1, data2;
			while ((data1 = in1.read()) != -1) {
				data2 = in2.read();
				if(data1 != data2) {
					System.out.println("파일이 서로 다릅니다.");
					flag = false;
					break;					
				}			
			}
			if(flag) {
				System.out.println("파일이 같습니다.");			
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
