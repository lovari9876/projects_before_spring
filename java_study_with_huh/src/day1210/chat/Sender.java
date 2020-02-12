package day1210.chat;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

class Sender extends Thread {
	Socket socket;
	DataOutputStream out;
	String name;

	Sender(Socket socket) {
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
		} catch (Exception e) {
		}
	}

	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (out != null) {
			try { // 글자 깨지지 마
				out.writeUTF(name + scanner.nextLine());
			} catch (IOException e) {
			}
		}
	} // run()

}
