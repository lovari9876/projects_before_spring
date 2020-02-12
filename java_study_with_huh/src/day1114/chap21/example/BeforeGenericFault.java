package day1114.chap21.example;

public class BeforeGenericFault {
	public static void main(String[] args) {
		BBox aBox = new BBox(); // 상자 생성
		BBox oBox = new BBox(); // 상자 생성

		aBox.set("Apple"); // 상자에 사과를 담는다.
		oBox.set("Orange"); // 상자에 오렌지를 담는다.

		System.out.println(aBox.get()); 
		System.out.println(oBox.get());
	}
//	String 문자열을 넣었는데 런타임 오류조차 발생하지 않는다. 
//	무언가 바라지 않은 결과만 나올 뿐...
//	==> Box 가 setter의 파라미터로 Object 타입을 받기 때문에...
//	==> 또 프린트시 스트링은 그냥 프린트 되기에.... 

}
