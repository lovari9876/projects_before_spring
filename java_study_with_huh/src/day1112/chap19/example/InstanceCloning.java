package day1112.chap19.example;

class Point implements Cloneable {
	private int xPos;
	private int yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); // Object 클래스의 clone메소드 호출
	} // 오버라이딩 목적: 접근 수준 지시자를 protected to public
}

public class InstanceCloning {
	public static void main(String[] args) {
		Point org = new Point(3, 5);
		Point cpy;

		try {
			cpy = (Point)org.clone(); // Object가 리턴되므로 Point로 형변환!!
			org.showPosition();
			cpy.showPosition();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
