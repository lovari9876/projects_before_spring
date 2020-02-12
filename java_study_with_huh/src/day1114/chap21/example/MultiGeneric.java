package day1114.chap21.example;

class DBox<L, R> {
	private L left;
	private R right;

	public void set(L o, R r) {
		left = o;
		right = r;
	}

	@Override
	public String toString() {
		return left + " & " + right;
	}
}

public class MultiGeneric {
	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>();
		box.set("Apple", 25); // 오토박싱이 이루어진다.
		// Integer right = 25; 
		// 25를 파라미터로 받는 생성자로 Integer 객체 생성
		System.out.println(box);
	}
}
