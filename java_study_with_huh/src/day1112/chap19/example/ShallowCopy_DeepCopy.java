package day1112.chap19.example;

class Point2 implements Cloneable {
	int x;
	int y;

	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
		}
		return obj;
	}

	public String toString() {
		return "x = " + x + ", y = " + y;
	}
}

class Circle implements Cloneable {
	Point2 p; // 원점
	double r; // 반지름

	Circle(Point2 p, double r) {
		this.p = p;
		this.r = r;
	}

	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
		}
		Circle c = (Circle)obj;
		c.p = new Point2(this.p.x, this.p.y);
		// 클론인 obj를 형변환하여 새 변수 c에 담는중!
		// c의 필드 p가 참조형 이기에 객체를 새로 생성해주어야 
		// p가 기존 주소를 참조하는게 아니라 새 인스턴스를 생성하여 참조 가능.
		return obj;
	}
	
	public String toString() {
		return p.toString() + ", r = " + r;
	}
}

public class ShallowCopy_DeepCopy {
	public static void main(String[] args) {
		Point2 original = new Point2(3, 5);
		Point2 copy = (Point2) original.clone();
		System.out.println(original);
		System.out.println(copy);
	}

}
