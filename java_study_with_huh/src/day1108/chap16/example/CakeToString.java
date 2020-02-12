package day1108.chap16.example;

class Cake2 {
	
	@Override // annotation 이다. 
	// 컴파일러에게 오버라이딩할 것이라고 알려준다.
	// 컴파일러가 에러를 내는 것이 아님
	public String toString() {
		return "My birthday cake";
	}
}

public class CakeToString {
	
	public static void main(String[] args) {
		Cake2 cake = new Cake2();
		System.out.println(cake);

	}

}
