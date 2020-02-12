package day1113.lotto;


public class TestLotto {

	public static void main(String[] args) {
		LottoNum lottoNum = new LottoNum();
		int[] rNum = lottoNum.randomNum();
		System.out.println();
		
		lottoNum.printLottoNum(rNum);
	}

}
