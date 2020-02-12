package day1107.exercise;

// class TV {
//	 private int size;
//	 public TV(int size) { this.size = size; }
//	 protected int getSize() { return size; }
// }
//
// public static void main(String args[]) {
//	 	ColorTV myTV = new ColorTV(32, 1024);
//	 	myTV.printProperty();
// }
// 출력결과
// => 32 인치 1024 컬러.
//
// TV를 상속받은 ColorTV 클래스를 작성하라.

public class ColorTV_Test {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}

}
