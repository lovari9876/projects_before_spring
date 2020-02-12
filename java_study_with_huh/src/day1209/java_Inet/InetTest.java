package day1209.java_Inet;

import java.util.Scanner;
import java.net.InetAddress;

class InetAddressEx {
	Scanner scanner;
	
	public InetAddressEx() {
		System.out.println("Host 이름을 입력하세요");
//		입력 예시: www.naver.com
	
		scanner = new Scanner(System.in);
		try {
			InetAddress inetAddress = InetAddress.getByName(scanner.next());
//			new 하지 않고 static 함수 가져다가 쓴다. 
//			java.net.InetAddress.getByName(String host)
//			Determines the IP address of a host, given the host's name. 
			
//			InetAddress inetAddress = InetAddress.getLocalHost(); 
//			자기 자신 부르기
			
			System.out.println("Computer NAME : " + inetAddress.getHostName());
			System.out.println("Computer IP: " + inetAddress.getHostAddress());
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}	
	}
}

public class InetTest {
	public static void main(String[] args) {
		new InetAddressEx(); // 이미 클래스 생성자에서 주소 다 받기 때문에 객체 생성 안해주어도 된다.	
	}
}
