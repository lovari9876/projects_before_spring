package day1107.chap15.example;

// <중요!> 다형성을 설명하는 가장 구체적인 예!!!!!

public class MobileSmartPhone {

	public static void main(String[] args) {
		SmartPhone phone1 = 
				new SmartPhone("010-555-7777", "Nougat");		
		MobilePhone phone2 = 
				new SmartPhone("010-999-7777", "Nougat"); //다형성!
		
		phone1.answer(); // 전화 받기
		phone1.playApp(); // 앱을 선택하고 실행한다.
		
		phone2.answer(); // 전화 받기
//		phone2.playApp(); // 앱을 선택하고 실행한다.
		((SmartPhone)phone2).playApp();
		// 객체를 형변환 하여 메소드 호출 가능!
		
//		phone의 데이터 타입이 MobilePhone이기에 
//		멤버는 MobilePhone에 있는 것만 쓸수있고,
//		생성자는 SmartPhone 것이니까 SmartPhone의 객체이고, 
//		SmartPhone에서 오버라이딩 된 멤버가 있다면 
//		그것은 적용되는 것이야!!!		
	}
}
