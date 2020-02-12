package day1112.chap19.example;

class INum {
	private int num;
	public INum(int num) {
		this.num = num;
	}
	
//	만약 오버라이딩 된 equals 메소드를 주석 처리하고 사용하면,
//	주솟값만 비교하여 객체들이 서로 다르다고 판단, 
//	false 만 리턴한다.
	@Override
	public boolean equals(Object obj) {
		if (this.num == ((INum)obj).num)
			return true;
		else 
			return false;
	}
}

public class ObjectEquals {

	public static void main(String[] args) {
		INum num1 = new INum(10);
		INum num2 = new INum(12);
		INum num3 = new INum(10);
		
		if(num1.equals(num2))
			System.out.println("num1, num2 내용 동일하다.");
		else 
			System.out.println("num1, num2 내용 다르다.");
		
		if(num1.equals(num3))
			System.out.println("num1, num3 내용 동일하다.");
		else 
			System.out.println("num1, num3 내용 다르다.");
	}

}
