package day1107.chap14.example;

class SuperCLS {
	public SuperCLS() {
		System.out.println("I'm Super Class");
	}
}

class SubCLS extends SuperCLS {
	public SubCLS() {
		System.out.println("I'm Sub Class");
	}
}

public class SuperSubCom {
	public static void main(String[] args) {
		new SubCLS();
		// 따로 객체 이름을 생성하지 않고 생성자를 호출
		// 자식클래스의 생성자만 호출되는 것이 아니고,
		// 부모클래스의 생성자가 먼저 호출된 후 자식의 생성자가 호출!!
	}
}
