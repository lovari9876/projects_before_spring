package day1112.exercise;

// main() {
// 	Person p1 = new Person("홍길동", "123456789");
// 	Person p2 = new Person("홍길동", "123456789");
// 	s.o.p(p1.equals(p2));
// 	 ==> 결과값 true 나오도록 프로그래밍 하시오
// }

class Person implements Cloneable {
	private String name;
	private String pNum;

	public Person(String name, String pNum) {
		this.name = name;
		this.pNum = pNum;
	}

	@Override
	public boolean equals(Object obj) {		
		Person p = (Person)obj;
		if (name.equals(p.name) && pNum.equals(p.pNum)) 
			return true;
		else
			return false;		
	}	
}

public class Exercise1 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", "123456789");
		Person p2 = new Person("홍길동", "123456789");
		
		System.out.println(p1.equals(p2));
		

	}

}
