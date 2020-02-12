package day1210.chatEco;

import java.io.*;
import java.net.Socket;

public class MakeClientSocket {
	Socket socket = null;
	PrintWriter writer = null;
	BufferedReader reader = null;
	// 서버가 아니라서 ServerSocket 객체는 필요없어!
	
	public MakeClientSocket() {
		try {
			socket = new Socket("localhost", 2000);
//			localhost: 내컴퓨터 = 127.0.0.1
//			socket = new Socket("192.168.6.26", 2000); // 희정
//			socket = new Socket("192.168.6.4", 2000); // 서원
			writer = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			socket(내컴퓨터의 2000번 프로그램)으로 연결하는 빨대 꽂았다!
//			Stream은 한 방향이니까 보내고 받는 것 따로따로 해야해!! 개울 생각하셈
			
			String str = null;
			
//			보내는 부분 
			BufferedReader sReader = new BufferedReader(new InputStreamReader(System.in));
			// System.in 이니까 키보드 입력이다! 한 번 멈춘다!!!			
					
			while((str = sReader.readLine()) != null) {
				writer.println(str); // 소켓의 대상으로 보낸다. 즉 서버쪽으로 보낸다.
				System.out.println("output : " + str);
			} // while문 있는데도 받으려면!! thread 말고는 답이 없는 것이다 ㅠㅠ!
			
			writer.close();
			reader.close();
			sReader.close();
			socket.close();
			
		} catch(Exception e) {}
	}
	
	public static void main(String[] args) {
		new MakeClientSocket();
	}	
}
