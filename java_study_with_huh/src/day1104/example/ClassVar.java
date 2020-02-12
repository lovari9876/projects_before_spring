package day1104.example;
// static붙은 변수=>
//	static 변수 = 정적 변수 = 클래스 변수
// 클래스변수는 어떤 인스턴스를 생성하더라도 모든 인스턴스들이
// 하나의 공통된 저장 공간 공유!! => 공통된 값 갖는다.
// ==> 즉 인스턴스에 상관없이 공통된 값이나 로직이 필요할 때는
// 클래스 변수나 클래스 메서드로 선언하는 것!!!

class InstCnt {
	static int instNum = 0;
	
	InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);
	}
}

public class ClassVar {
	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
	}
}
