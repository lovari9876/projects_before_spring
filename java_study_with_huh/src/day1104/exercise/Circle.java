package day1104.exercise;
//해결방법!!!
//1. 프로그램 사용방법을 문서화 시킨다.(반드시 메소드 사용하여 변수에 값 넣으시오)
//2. (자바에서) private double rad 선언 -> 접근제한자 private으로 설정!
//	=> 메소드를 통할 수 밖에 없도록!!
//	==> 정보 은닉: 멤버변수에 직접 접근하지 못하고, 함수로만 접근하도록 하는 것!

public class Circle {
	private double rad = 0;
	final double PI = 3.14;
	
	public Circle(double r) {
		setRad(r);
	}
	
	public void setRad(double r) {
		if(r < 0) {
			rad = 0;
			return;
		}
		rad = r;
	}
	
	public double getArea() {
		return (rad * rad) * PI;
	}
}
