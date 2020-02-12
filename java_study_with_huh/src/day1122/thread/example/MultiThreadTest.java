package day1122.thread.example;

public class MultiThreadTest {
	public static void main(String[] args) {
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
		th1.start(); 
		th2.start();
	}
	// 왜 run()이 아니라 start() 호출해??
	// run() 걍 부르면 함수 호출인데, thread관리하면서 run 호출해야 하므로 OS에게 시키는 것
	// 스레드 생성시에 프로세스처럼 리소스와 스레드가 그 안에 또 생겨.
	// 그래서 바로 run() 호출하는게 아니라 start()로 요청하는 것!
	// thread 돌릴거니까 메모리도 잡아주고 리소스잡아달라고 요청!
	// run()하면 함수 호출이지, thread 생성되는게 아니다!!
	
	// 이렇게 실행하면 놀랍게도 실행시마다 결과가 달라... 
	// start()는 -부터 찍도록 시켰는데, 결과는 지멋대로(임의로) 섞여나온다! 
	// 작업단위는 스레드! 
	// 돌아가는 작은 프로그램은 3개. 메인, 가로찍기, 세로찍기.
	// 그리고 작은 프로그램들은 서로 독립적!
	// 현재 OS가 스케쥴링하고 Cpu가 돌리고 있는 스레드 상황에 따라, 
	// OS의 context Switching 스케쥴링이 달라짐.
	// 그래서 남는 메모리에 할당하며 스케쥴링 하다 보니 매번 출력 결과가 달라지는 것!
}

// run()이 thread의 main()이다!!
class MyThread1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++)
			System.out.println("-");
	} // run()
}

class MyThread2 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++)
			System.out.println("|");
	} // run()
}
