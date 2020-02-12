package day1104.example;
// => 반드시!!!! 멤버변수를 private으로 설정하여 정보를 은닉하고 
// getter로 접근하기!

public class Main_Circle {

	public static void main(String[] args) {
		Circle c = new Circle(1.5);
		System.out.println(c.getArea());

		c.setRad(2.5);
		System.out.println(c.getArea());
		c.setRad(-3.3);
		System.out.println(c.getArea()); // 0 출력
		c.rad = -4.5; // 직접 값을 대입해버려도
		// 의도와 다른데도, 컴파일 된다.
		// 멤버 변수를 직접 접근하면 통제가 안된다!!
		// 설정한 의도에 부합하도록 반드시 설정한 메소드로 접근할 것!
		System.out.println(c.getArea());
	}

}
