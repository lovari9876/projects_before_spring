package day1107.chap15.example;

class Cake {
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake {
	public void yummy() {
		super.yummy();
		System.out.println("Yummy Cheese Cake");
	} // 이것이 함수의 오버라이딩!!
	
	public void tasty() {
		super.yummy();
		System.out.println("Yummy Tasty Cake");
	}
}

public class Overriding {
	public static void main(String[] args) {
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();

//		다형성이 적용될 때 오버라이딩한 함수가 호출되는 것이다!
		c1.yummy(); 
		c2.yummy();
		c2.tasty();
		//Cake의 yummy()는 이용당한 것이다....
	}
}
