package day1105.example;
//생성자의 오버로딩!!
//생성자의 오버로딩을 통해 생성되는 인스턴스의 유형을 구분할 수 있다.

public class Person {
	private int regiNum;
	private int passNum;

	Person(int rnum, int pnum) {
		regiNum = rnum;
		passNum = pnum;
	}

	//여권 없는 사람 위한 생성자
	Person(int rnum) {
		this(rnum, 0);
//		위 한 줄이 밑 두 줄임
//	1.	this는 객체 자기 자신을 가리키고, 자기 자신의 변수 가리킬 때 사용!
//	2.	this() 함수는 자기자신이니까!! 생성자 호출해!!!
//		Person(rnum, 0) == this(rnum, 0)
//		regiNum = rnum;
//		passNum = 0;
	}

	void showPersonInfo() {
		System.out.println("주민등록번호: " + regiNum);
		System.out.println("여권 번호: " + passNum);
	}
}
