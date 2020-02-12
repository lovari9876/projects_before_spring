package day1113.chap20.example;

import java.util.Arrays;

public class CopyOfSystem {

	public static void main(String[] args) {
		double[] org = {1.1, 2.2, 3.3, 4.4, 5.5,};
		// 마지막에 쉼표 안붙이는데 붙이는 것도 허용함.
		System.out.println(Arrays.toString(org));
		double[] cpy = new double[3];
		
		// 배열 org의 인덱스 1에서 배열 cpy 인덱스 0으로 세 개의 요소 복사
		System.arraycopy(org, 1, cpy, 0, 3);
		
		for(double d : cpy)
			System.out.print(d + "\t");
		System.out.println();
	}

}