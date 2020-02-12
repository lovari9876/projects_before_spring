package day1210.chat;

import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(1234);
			System.out.println("서버가 준비되었습니다.");

			socket = serverSocket.accept();
//			accept(): Listens for a connection to be made to this socket and accepts it.

			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);

			sender.start();
			receiver.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}