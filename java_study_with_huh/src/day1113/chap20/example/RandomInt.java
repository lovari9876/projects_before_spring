package day1113.chap20.example;

import java.util.Random;

public class RandomInt {
// 실행 할 때마다 다른 결과 보인다.
	public static void main(String[] args) {
		Random rand = new Random(); 
//		씨드 안넣으면 생성자로 이렇게 현재시간을 밀리초로 계산한 long seed 넣어줌
//		public Random() {
//			// Random(long seed) 생성자 호출
		
//			this(System.currentTimeMillis());
//		}
		
		for(int i = 0; i < 7; i++)
			System.out.println(rand.nextInt(1000));

	}

}
