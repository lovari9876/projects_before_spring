package day1210.chatEco;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// 채팅 프로그램을 띄워두고 한 명이 채팅 걸고 기다려야 하기 때문에 
// 서버라는 개념 필요!

public class MakeServerSocket {
	ServerSocket serverSocket = null;
	Socket socket = null;
	
	// 주고받는 문자열 다루기
	PrintWriter writer = null;
	BufferedReader reader = null;
	String lineStr;

	public MakeServerSocket() {
		try { 
			serverSocket = new ServerSocket(2000);
			// 원하는 숫자를 내가 만드는 이 프로그램의 포트번호로 지정해준다.
		
			// 무한 루프로 서버가 무한정 기다린다는 것을 나타냄!
			while (true) { // 여기부턴 외우는 파트!
				socket = serverSocket.accept(); //진짜 기다리는:멈추는 파트
				// 누군가(client)가 접속하게 되면 그때부터 서버소켓이 연결되는 것!!
				// 연결후에야 아래 프린트 실행된다.
				System.out.println("Client 요청됨");
			
				writer = new PrintWriter(socket.getOutputStream(), true);
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				// reader는 상대방이 나에게 보내는 것을 읽는 것인데 어떻게 보냈는지 여부를 알까?
				
				while((lineStr = reader.readLine()) != null) {
					// reader가 읽어온 것이 not null 일 때 누가 보냈구나 하는 것. 
					writer.write(lineStr); // 서버로부터 나와서 클라이언트에게 써주는 것! 
					// 상대 소켓에게 전송하게 되는 것이다.
					System.out.println("input : " + lineStr); 
					// 메아리 서버: 메아리처럼 내가 쓴 것을 프린트한다. 
				}
				
				writer.close();
				reader.close();
				socket.close();			
			}
		} catch(Exception e) {}
 	}
	
	public static void main(String[] args) {
		new MakeServerSocket();
	}
}
