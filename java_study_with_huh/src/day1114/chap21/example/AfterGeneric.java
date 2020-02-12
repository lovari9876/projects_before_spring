package day1114.chap21.example;

class Box<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

public class AfterGeneric {

	public static void main(String[] args) {
		Box<Apple> aBox = new Box<Apple>(); // T를 Apple로 결정
		Box<Orange> oBox = new Box<Orange>(); // T를 Orange로 결정

		aBox.set(new Apple()); // 상자에 사과를 담는다.
		oBox.set(new Orange()); // 상자에 오렌지를 담는다.
		
//		aBox.set("Apple"); // 드디어 컴파일 에러가 난다!! 실수를 미리 고칠수있어!

		// 형변환이 필요없다! 이미 지정된 타입으로 객체가 들어있음
		Apple ap = aBox.get(); // 상자에서 사과를 꺼낸다.
		Orange og = oBox.get(); // 상자에서 오렌지를 꺼낸다.

		// toString 호출
		System.out.println(ap); 
		System.out.println(og);

	}

}
