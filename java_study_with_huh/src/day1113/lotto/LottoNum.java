package day1113.lotto;

import java.util.Arrays;
import java.util.Random;

// interface IRottoNum을 구현하는 클래스 RottoNum을 작성하고
// 로또 번호를 추출하시오

class LottoNum implements ILottoNum {
	Random r = new Random();
	int[] rNum = new int[6];

	public int[] randomNum() {
		for (int i = 0; i < rNum.length; i++) {
			rNum[i] = 1 + r.nextInt(45);
			int j = 0;
			do {
				if (rNum[i] == rNum[j++]) {
					System.out.print("중복: " + rNum[i] + " ");
					rNum[i] = 1 + r.nextInt(45);
					j = 0;
				} else
					j++;
			} while (j > rNum.length);
		}
		return rNum;
	}

//	int[] lotto = new int[6];
//
//	public int[] randomNum() {
//		for (int i = 0; i < rNum.length; i++) {
//			// lotto[i] = (int)(Math.random() * 45) +1;
//			lotto[i] = r.nextInt(45) + 1;
//			for (int j = 0; j < i; j++) {
//				if (lotto[i] == lotto[j]) {
//					i--;
//
//					System.out.println("중복입니다. " + lotto[i + 1] + "=" + lotto[j]);
//					break;
//				}
//			}
//		}
//	}

	void printLottoNum(int[] rNum) {
		System.out.println(Arrays.toString(rNum));
	}
}
