package day1120.chap32.example;

import java.util.Scanner;
import java.io.*;

// 그냥 InputStream보다 Buffered가 훨씬 더 빠르고 안정적

public class BufferdStreamFileCopier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("대상 파일: ");
		String src = sc.nextLine();
		System.out.print("사본 이름: ");
		String dst = sc.nextLine();

		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dst))) {
			int data;
			
			// 바이트 단위 복사가 진행되지만, 버퍼링 되므로 속도는 빠르다!
			while (true) {
				data = in.read();
				if (data == -1)
					break;
				out.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
