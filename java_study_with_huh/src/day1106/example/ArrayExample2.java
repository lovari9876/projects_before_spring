package day1106.example;

class Box2 {
	private String conts;
	
	Box2(String cont) {
		this.conts = cont;
	}
	
	public String toString() {
		return conts;
	} //오버라이딩 해주어야 주솟값이 리턴되지 않는다.
}

public class ArrayExample2 {	
	public static void main(String[] args) {
		Box2[] ar = new Box2[3];
		
		//배열에 인스턴스 저장
		ar[0] = new Box2("First");
		ar[1] = new Box2("Second");
		ar[2] = new Box2("Third");
		
		//저장된 인스턴스 참조
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		// 주솟값이나 obj.toString()의 리턴값이 출력되지 않은 이유는
		// 이미 toString()을 오버라이딩해서 
		// 리턴값이 conts가 되도록 했기때문
	}
}
