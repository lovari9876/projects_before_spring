package day1017_File;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			PrintWriter printer = new PrintWriter("Hello.txt");
			printer.println("Hello");
			printer.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
//result:
// C:\Users\ user\ git\javaSunEclipse\JavaSun
// 위의 내 프로젝트 폴더에 Hello.txt 가 생긴다.
// 왜냐면 이클립스에서는 현재 working directory가 프로젝트 폴더이기 때문
	}

}
