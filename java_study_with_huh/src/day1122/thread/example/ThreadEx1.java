package day1122.thread.example;

import javax.swing.JOptionPane;

public class ThreadEx1 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은 " + input + "입니다.");
		// dialog가 뜨면서 그 창이 주도권을 가지고, 그게 완료될 때까지
		// 밑의 for문을 실행 안함 // 기다리게 두면 OS가 놀고 있으니 아깝네? => Ex2에서 해결
				
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {Thread.sleep(1000);}catch(Exception e) {}
			// 1초(1000밀리초) 간격으로 찍으셈
			// => 지금 실행중인 스레드를 쉬는데, 그동안 OS는 context switching
			// 하라는 것을 알려준다!
		}
	} // main()
}
