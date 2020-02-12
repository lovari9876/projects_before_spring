package day1011;

public interface IStack {
	//구현체 필요없을때 interface 상속이 더 효율적
	void push(Object data);
	void pop();
	Object top();
	
	boolean isEmpty();
	//boolean isFull();
}
