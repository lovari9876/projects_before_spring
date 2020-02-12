package day1112.chap19.example;

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	public void finalize() throws Throwable {
		super.finalize(); // 상위 클래스의 finalize() 호출!!
		System.out.println("destroyed: " + name);
	}
}

public class ObjectFinalize {

	public static void main(String[] args) {
		Person p1 = new Person("Yoon");
		Person p2 = new Person("Park");
		p1 = null; // 참조대상을 가비지 컬렉션의 대상으로 만듦
		p2 = null; // 참조대상을 가비지 컬렉션의 대상으로 만듦
//		원래는 gc가 언제 메모리 정리할 지 모르는데, 실행을 강제로 시키는 것이 밑의 두 줄이다.
//		그러나 함부로 쓰면 큰일나니까 쓰지마!!!
//		 System.gc();
//		 System.runFinalization();
// 주석 해제하면 오버라이딩 된 메소드 출력~~
		
		System.out.println("end of program");
	}

}
