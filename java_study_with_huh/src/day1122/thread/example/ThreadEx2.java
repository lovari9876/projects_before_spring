package day1122.thread.example;

import javax.swing.JOptionPane;

public class ThreadEx2 {

	public static void main(String[] args) {
		ThreadEx2_1 th1 = new ThreadEx2_1();
		th1.start();
//		스레드가 돌아갈 때 
//		동시에!

//		sleep 하는 동안 context switching 하면서 다이알로그 창 뜬다.
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
	}
}

class ThreadEx2_1 extends Thread {
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
