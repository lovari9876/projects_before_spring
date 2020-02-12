package day1115.chap22.example;

interface Getable<T> {
	public T get();
}

class Box2<T> implements Getable<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	@Override
	public T get() {
		return ob;
	}
}

class Toy {
	@Override
	public String toString() {
		return "I am a Toy.";
	}
}

public class GenericInterface {
	public static void main(String[] args) {
		Box2<Toy> box2 = new Box2<>();
		box2.set(new Toy());

		// Box<T>가 Getable<T>를 구현하므로 참조 가능
		Getable<Toy> gt = box2;
		System.out.println(gt.get());
	}

}
