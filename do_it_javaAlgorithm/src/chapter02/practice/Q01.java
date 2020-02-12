package chapter02.practice;

import java.util.Random;

// 키 뿐만 아니라 사람 수도 난수로 생성하도록 
// 실습 2-5를 수정하여 프로그램 작성

public class Q01 {
	static int maxOfArray(int[] array) {
		int max = array[0];
		for(int i = 1; i < array.length; i++) {
			if(max < array[i])
				max = array[i];
		}
		return max;		
	}	

	public static void main(String[] args) {
		Random rand = new Random();
		
		int num = 1 + rand.nextInt(10);
		int[] height = new int[num];
		
		System.out.println("키의 최댓값을 구합니다.");
		for(int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
		}
		System.out.println("최댓값은 " + maxOfArray(height));
	}

}
