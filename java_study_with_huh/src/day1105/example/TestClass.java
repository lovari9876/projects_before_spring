package day1105.example;

//왜 static 함수 안에 static 함수만 올 수 있고 인스턴스 함수는 올 수 없는 것일까??

public class TestClass {
	void instanceMethod() {}
	static void staticMethod() {}
	
	void instanceMethod2() {
		instanceMethod();
		staticMethod(); //인스턴스 메서드에서는 클래스 메서드 호출 가능~
	}
	
	static void staticMethod2() {
//		instanceMethod(); //클래스 메서드에서 인스턴스 메서드 호출 불가능!!
//		아직 생성되지도 않은 instanceMethod()를 staticMethod2()에서 호출하니까
//		당연 안되는 것이야.
//		인스턴스 변수와 메서드는 인스턴스 생성, 즉 new 할때야 생기는 것!
		staticMethod();
	}
}
