package day1209.java_thread_sync;

// 실행순서

class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
//		synchronized 붙여야, 동기화 문제가 안생긴다!
		this.memory = memory;

		try {
			Thread.sleep(2000); // 지금 돌아가는 thread를 2초 동안 정지시키고, 다른 프로그램이 돌아감(혹은 다른 쓰레드)
		} catch (InterruptedException e) {
		}

		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}

class User1 extends Thread {
	private Calculator calculator;

	// Calculator 주입 받음
	public void setCalculator(Calculator calculator) {
		this.setName("CalculatorUser1"); // 부모(Thread) 메소드임.
		this.calculator = calculator;
	}

	@Override
	public void run() { // thread의 main() // 공유객체에 100 저장
		calculator.setMemory(100);
	}
}

class User2 extends Thread {
	private Calculator calculator;

	// Calculator 주입 받음
	public void setCalculator(Calculator calculator) {
		super.setName("CalculatorUser2"); // 부모(Thread) 메소드임.
		this.calculator = calculator;
	}

	@Override
	public void run() { // thread의 main() // 공유객체에 100 저장
		calculator.setMemory(50);
	}
}

public class SyncTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();

		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
