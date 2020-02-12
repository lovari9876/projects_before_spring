package day1011;
//Generic
public interface GerericStack <T extends Object> {
	void push(T data);
	void pop();
	T top();
	
	boolean isEmpty();
	//boolean isFull();

}
