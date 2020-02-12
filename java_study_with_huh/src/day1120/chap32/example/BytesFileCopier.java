package day1120.chap32.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

// 1바이트 단위 읽어들이기

// 이 프로젝트 폴더 내부에 fileOrg.txt 을 만들어서 내용을 적고,
// fileCp.txt 라는 사본 파일을 입력하면,
// fileCp.txt 가 생성되면서 자동으로 내용복사해준다!

public class BytesFileCopier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("대상 파일: ");
		String src = sc.nextLine();
		System.out.println("사본 이름: ");
		String dst = sc.nextLine();

		// try-with-resource 문으로 쓰면 try(...)안의 객체가 자동으로
		// close() 처리된다.
		try (InputStream in = new FileInputStream(src); 
				OutputStream out = new FileOutputStream(dst)) {
			int data;

			// 더 이상 읽어들일 데이터가 없을 때까지 1바이트씩 차례로 읽어들인다.
			// 자바의 데이터 전송 기본단위는 32비트 즉 4바이트인데 
			// 1바이트씩 보내니까 3바이트는 0으로 채워지고 놀고있다...
			while (true) {
				data = in.read(); // 파일로부터 1바이트를 읽는다.
				if (data == -1) // 더 이상 읽어들일 데이터가 없다면, 끝낸다.
					// read()는 더이상 읽을게 없다면 -1 리턴함
					break;
				out.write(data); // 파일에 1바이트를 쓴다.
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
