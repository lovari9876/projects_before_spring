package day1111.chap18.example;

class Board {}
class PBoard extends Board {}

class ClassCast {

	public static void main(String[] args) {
		Board pbd1 = new Board();
		PBoard pbd2 = (PBoard)pbd1; //ok!
		
		System.out.println(".. intermediate location..");
		Board ebd1 = new Board();
		PBoard ebd2 = (PBoard)ebd1; // Exception!!!
		// 신기하게도 컴파일 에러가 아니라!! 런타임 에러가 난다....
		// 클래스캐스팅의 경우, 런타임 에러가 나기 때문에
		// 꼭 주의해서 코딩하자!!!!
		
		// 왜 런타임 에러?????
		// new는 객체를 동적생성한다. 
		// 즉 런타임에 객체를 생성하는데, 아직 메모리에 할당되지 않은
		// 객체의 경우는 컴파일 타임에 체크되지 않는것이다!
	}

}
