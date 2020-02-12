package day1113.chap20.example;

import java.util.Random;

public class RandomInt2 {
// 실행할 때마다 같은 결과 보인다.
// 같은 환경에서 seed가 동일하면 정해진 연산에 의해 같은 결과 나오는 것
	public static void main(String[] args) {
		Random rand = new Random(12); // <- 괄호안에 seed 값 들어감
		for(int i = 0; i < 7; i++)
			System.out.println(rand.nextInt(1000));

	}

}