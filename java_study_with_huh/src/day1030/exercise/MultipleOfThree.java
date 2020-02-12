package day1030.exercise;
//1. 1부터 100까지 합을 구하시오
//2. 1부터 100까지의 숫자 중에 3의 배수인 숫자를 출력하시오.

import java.util.ArrayList;
public class MultipleOfThree {
	
	public int total() {
		int temp = 0;
		for(int i = 1; i <= 100; i++) {
			temp = temp + i;
		}
		return temp;
	}
	
	public ArrayList<Integer> multipleOfThree() {
		ArrayList<Integer> multipleOfThree = new ArrayList<>();		
		for (Integer i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				multipleOfThree.add(i);
			}
		}		
		return multipleOfThree;
	}
	
//	public void multipleOfThree() {
//		System.out.print("3의 배수는 ");
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				System.out.println(i + " ");
//			}
//		}
//		System.out.println("입니다.");
//	}
}
