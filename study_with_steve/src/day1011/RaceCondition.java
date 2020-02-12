package day1011;

public class RaceCondition {
	public static Long count = 0L;

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {
				//스레드클래스 10개 생성하였다. 메인스레드 동작하고 있는데 추가
				public void run() {
					synchronized (count) {
						//동기화할(synchronize) 인수(객체나 변수) 집어넣기
						for (int i = 0; i < 100; i++) {
							System.out.format("Thread: %d, count: %d\n",
							Thread.currentThread().getId(), count++);
							//스레드의 아이디 검사하는법: 꼭 알아둬
						}
					}
				}
			}).start();
		}

	}
}
