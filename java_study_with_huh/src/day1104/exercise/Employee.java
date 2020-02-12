package day1104.exercise;
// 필드: 이름, 나이, 주소, 부서, 월급 정보를 필드로 선언
// 생성자: 이름, 나이, 주소, 부서, 월급을 지칭하는 생성자 정의
//메소드 printInfo(): 인자는 없고 자신의 필드 이름, 나이, 주소, 부서, 월급을 출력

//한 파일 안에서 클래스를 두 개 이상 정의할 때
//public class는 main() 가진 하나만 있어야해!
// => 대표로 다른 클래스들을 이용하는 클래스가 있으므로
// => public class를 하나만 두어 진입점으로 하는 것이 관습이 되었다.
// => c++부터 이어지던 관습을 java에서는 문법으로 정한 것!
class Employee {
	private String name;
	private int age;
	private String address;
	private String dept; //department
	private int salary;
	
	Employee(String name, int age, String address, String dept, int salary) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.dept = dept;
		this.salary = salary;
	} //걍 default 고고 
	
	public void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
		System.out.println("부서: " + dept);
		System.out.println("월급: " + salary);
	}
	
	
	
}
