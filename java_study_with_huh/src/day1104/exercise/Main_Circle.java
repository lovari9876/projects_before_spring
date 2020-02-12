package day1104.exercise;

public class Main_Circle {

	public static void main(String[] args) {
		Circle c = new Circle(1.5);
		System.out.println(c.getArea());

		c.setRad(2.5);
		System.out.println(c.getArea());
		c.setRad(-3.3);
		System.out.println(c.getArea()); // 0 출력
		//c.rad = -4.5; 
		//이제 rad는 private 멤버변수이므로 직접 접근이 불가능하고
		//메소드를 통해서만 접근 가능!!!
		System.out.println(c.getArea());
	}

}
