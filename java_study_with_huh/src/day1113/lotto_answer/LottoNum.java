package day1113.lotto_answer;

import java.util.Arrays;
import java.util.Random;

import day1113.lotto.ILottoNum;

public class LottoNum implements ILottoNum {

	int[] lotto;

	@Override
	public int[] randomNum() {
		Random rand = new Random();
		lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rand.nextInt(45) + 1;
//			lotto[i] = (int)(Math.random()*45)+1;  
//			math클래스의 랜덤함수, 스태틱이므로 객체생성안하고 바로 불러와서 사용가능 
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					System.out.println("중복 : " + lotto[i] + ", " + lotto[j]);
					break;
				}
			}
		}
		return lotto;

	}

	public void printLottoNum() {
		System.out.println(Arrays.toString(lotto));
	}

}
