package day1120.chap32.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

// 1024바이트 단위 읽어들이기(1키로바이트 단위)

// 이 프로젝트 폴더 내부에 fileOrg.txt 을 만들어서 내용을 적고,
// fileCp.txt 라는 사본 파일을 입력하면,
// fileCp.txt 가 생성되면서 자동으로 내용복사해준다!

public class BufBytesFileCopier {

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
			byte buf[] = new byte[1024];
// 같은거:	byte[] buf = new byte[1024];
			int len;

			// 더 이상 읽어들일 데이터가 없을 때까지 1키로바이트씩 차례로 읽어들인다.
			while (true) {
				len = in.read(buf); // 배열 buf로 데이터를 읽어들인다.
				if (len == -1) // 더 이상 읽어들일 데이터가 없다면, 끝낸다.
					// read()는 더이상 읽을게 없다면 -1 리턴함
					break;
				out.write(buf, 0, len); // len 바이트만큼 데이터를 저장한다.
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
