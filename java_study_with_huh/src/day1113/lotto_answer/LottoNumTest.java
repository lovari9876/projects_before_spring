package day1113.lotto_answer;

import day1113.lotto.ILottoNum;

public class LottoNumTest {
	public static void main(String [] args) {
		
		ILottoNum rottoNum = new LottoNum(); //다형성 적용
		
//		int [] num = rotto.randomNum();
//		for (int i : num) {
//			System.out.println(i);
//		}
		
		rottoNum.randomNum(); // 오버라이딩 된 함수 불러오기
		((LottoNum)rottoNum).printLottoNum();
		
		
	}

}
