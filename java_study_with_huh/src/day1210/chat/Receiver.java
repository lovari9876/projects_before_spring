package day1210.chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

class Receiver extends Thread {
	Socket socket;
	DataInputStream in;

	Receiver(Socket socket) {
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
		}
	}

	@Override
	public void run() {
		while (in != null) {
			try {
				System.out.println(in.readUTF());
			} catch (IOException e) {
			}
		}
	} // run()
}
