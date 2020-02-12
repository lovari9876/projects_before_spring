package day1114.chap21.example;

class Box2<T extends Number> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

public class GenericExtends {
	public static void main(String[] args) {
		Box2<Integer> iBox = new Box2<>();
		iBox.set(24);
		System.out.println(iBox.get());
		
		Box2<Double> dBox = new Box2<>();
		dBox.set(5.97);
		System.out.println(dBox.get());
	}

}
