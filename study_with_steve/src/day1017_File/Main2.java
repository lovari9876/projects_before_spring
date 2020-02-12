package day1017_File;

import java.io.*;

public class Main2 {

	public static void main(String[] args) {
		try {
			PrintWriter printer = new PrintWriter("C:\\Users\\user\\Hello.txt");
			printer.println("Hello");
			printer.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
//result:
// 지정 장소에 생긴다.
// 우분투는 리눅스기에 거기서는 주소를 /로 구분!
// 윈도우는 역슬래시\
	}

}