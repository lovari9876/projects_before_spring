package day1011;

public abstract class AbstractStack {
	//구현 파트가 하나의 함수라도 있으면 interface대신 추상화함수 상속해야해
	
	//구현부를 서술하고 싶지 않은 abstract 함수는 ; 로 마무리
	public abstract void push(Object data);
	//Object type(예: Integer, Object 등..) 넣어줘야 null값 쓸수있어~~!!
	public abstract void pop();
	public abstract Object top();
	
	public abstract boolean isEmpty();
	//public abstract boolean isFull();
	//stack이 비었니? 다 찼니?
	//추가로 써 줄 수 있는 메소드!
}
