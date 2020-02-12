package day1105.example;

public class Main_Person {
	public static void main(String[] args) {
		// 여권 있는 사람의 정보를 담은 인스턴스 생성
		Person jung = new Person(335577, 112233);

		// 여권 없는 사람의 정보 담은 인스턴스 생성
		Person hong = new Person(775544);

		jung.showPersonInfo();
		hong.showPersonInfo();
	}
}
