package day1114.chap21.example;

class Apple {
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	public String toString() {
		return "I am an orange.";
	}
}

class BBox {
	private Object ob;

	public void set(Object o) {
		ob = o;
	}

	public Object get() {
		return ob;
	}
}

public class BeforeGeneric {
	public static void main(String[] args) {
		BBox aBox = new BBox(); // 상자 생성
		BBox oBox = new BBox(); // 상자 생성

		aBox.set(new Apple()); // 상자에 사과를 담는다.
		oBox.set(new Orange()); // 상자에 오렌지를 담는다.

		Apple ap = (Apple) aBox.get(); // 상자에서 사과를 꺼낸다.
		Orange og = (Orange) oBox.get(); // 상자에서 오렌지를 꺼낸다.

		// toString 호출
		System.out.println(ap); 
		System.out.println(og);
	}
//	어쩔수 없이 형 변환의 과정이 수반된다.
//	그리고 이는 컴파일러의 오류 발견 가능성을 낮추는 결과로 이어진다.

}
