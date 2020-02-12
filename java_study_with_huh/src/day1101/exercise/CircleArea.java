package day1101.exercise;

//원의 반지름을 가지는 변수를 가지고 원의 넓이를 구하는 함수를 가진
//CircleArea 클래스 작성하여
//CircleAreaTest 클래스에서 테스트 하시오~~

public class CircleArea {
	double radious; // 꼭 필요하니까 생성자로 꼭 얘 쓰게 하쟈
	double area;
		
	public CircleArea(double radious) {
		if(radious < 0) {
			System.out.println("음수 노노");
			return;
		}
		this.radious = radious;
	}
	
	public double getCircleArea() {
		double area = radious * radious * Math.PI;
		//기본 제공 파이 쓰자!
		//Math class의 변수 PI는 static 변수라서 클래스것이기에 
		//객체 생성없이 쓸 수 있어!!!!!
		return area;
	}
}
