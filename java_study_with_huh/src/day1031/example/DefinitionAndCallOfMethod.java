package day1031.example;

public class DefinitionAndCallOfMethod {

	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		hiEveryone(13); //13을 파라미터에 인수로 전달하여 메소드 호출
		//local variable은 그 지역, 즉 local 안에서만 쓰고 버린당...
		hiEveryone(12); //위의 할당한 int age는 폐기하고 새롭게 호출!!
		System.out.println("프로그램의 끝");
	}
	
	// 함수(function) = 메소드(method)
	private static void hiEveryone(int age) {
		System.out.println("good morning");
		System.out.println("I am " + age + "years old.");
	}
}
