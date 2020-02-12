package day1120.chap32.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7ToFile {

	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("chap32file.dat"); 
		// 출력 스트림 생성 <= 파일이 없을 경우 새로 만들어낸다.
		// 이 프로젝트 폴더 내부에!
		out.write(7); // 7을 저장 (int니까 4바이트)
		out.close(); // 스트림 종료 => 메모리 정리
	}

}
