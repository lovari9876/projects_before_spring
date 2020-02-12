package day1111.chap17.example;
// 기존의 흑백프린터 인터페이스에 컬러메소드를 추가하는게 아니라!
// 새로운 인터페이스 추가함으로써 기존 소스를 변경하지 않음!!
// 설계의 1원칙: 기존 소스 변경하지 않는다!(노트 참고)

interface Printable {
	void print(String doc);
}

interface ColorPrintable extends Printable {
	void printCMYK(String doc);
}

//기존 흑백 프린터 드라이버
class SPrinterDriver implements Printable {
	public void print(String doc) {}
} // 기존 클래스 수정할 필요 없음!
// 이미 삼성 프린터 드라이버 설치한 흑백프린터 사용자들이
// 쓸데없이 컬러 업뎃 하지 않아도 돼!!

class Prn909Drv implements ColorPrintable {
	//컬러 프린터 드라이버~
	@Override
	public void print(String doc) {
		System.out.println("black & white ver");
		System.out.println(doc);
	}

	@Override
	public void printCMYK(String doc) {
		System.out.println("CMYK ver");
		System.out.println(doc);
	}	
}

