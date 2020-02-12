package day1115.chap22.example;

class Box<T> {
	private T ob;
	public void set(T o) { ob = o; }
	public T get() {
		return ob;
	}
}

class EmptyBoxFactory {
	public static <T> Box<T> makeBox() {
		Box<T> box = new Box<>();
		return box;
	}
}

public class TargetType {
	public static void main(String[] args) {
		Box<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
		// Box<Integer> iBox = EmptyBoxFactory.makeBox();
		// 이렇게 일반 메소드처럼 그냥 써주게 되면, 컴파일러는
		// 참조변수의 형인 Box<Integer>을 makeBox의 제네릭 타입으로 결정한다
		// 이것이 바로 '타겟타입'이다~
		iBox.set(25);
		System.out.println(iBox.get());
	}

}
