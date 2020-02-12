package day1108.chap17.example;

// interface를 강제해서 공통된 규칙을 바탕으로 프로그래밍하게 해야
// 통일성 있고 다형성 적용 가능한 프로그램을 만들 수 있다!
// (주먹구구식 코드, 스파게티 코드가 되지 않음!)

public class PrinterDriver_Test {

	public static void main(String[] args) {
		String myDoc = "This is report about...";

		// 삼성 프린터로 출력
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();

		// 엘지 프린터로 출력
		prn = new LPrinterDriver(); // 새로운 주소 참조
		prn.print(myDoc);
	}

}
