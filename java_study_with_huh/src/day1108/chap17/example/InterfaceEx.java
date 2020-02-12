package day1108.chap17.example;


interface Printable { // MS가 정의하고 제공한 인터페이스
	void print(String doc); // 추상 메소드
} // public과 abstract를 생략해도 컴파일러가 자동으로 붙여준다.

class Printer implements Printable {
	@Override // 오버라이딩이니까 annotation 붙일 수 있다.
	public void print(String doc) {
		System.out.println(doc);
	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		// 인터페이스형 참조변수 선언가능!!
		Printable prn = new Printer();
		prn.print("Hello");
	}
}

// ==============프린터 드라이버=====================

class SPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

class LPrinterDriver implements Printable {
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}
