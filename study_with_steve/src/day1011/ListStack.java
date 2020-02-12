package day1011;
//import java.util.Collection;
//import java.util.ArrayList;
import java.util.*;
//컬렉션 사용

//public class ArrayStack extends AbstractStack {
public class ListStack implements IStack {
	//일반 클래스가 되었다.
	
	//class's members
	private static final int DEFAULT_SIZE = 10;	
	
	//instance's members: static 안붙음
	private List<Object> stack;
	private int size;
	private int topIndex;
	
	//Default constructor
	//클래스의 멤버를 초기화 한다.
	public ListStack() {
		this.size = DEFAULT_SIZE;
		this.stack = new ArrayList<Object>(DEFAULT_SIZE);
		//ArrayList로 객체 받는다.
		this.topIndex = 0;
	}
	
	//인자가 있는 생성자
	public ListStack(int size) {
		this.size = size;
		this.stack = new ArrayList<Object>(size);
		this.topIndex = 0;
	}
	
	public synchronized void push(Object data) {
		if (isFull())
			return;
		
		this.stack.add(this.topIndex, data);
		this.topIndex++;
	}
	
	public synchronized void pop() {
		if (isEmpty())
			return;
		
		this.stack.remove(this.topIndex - 1);
		this.topIndex--;
	}
	
	public synchronized Object top() {
		return isEmpty() ? null : this.stack.get(this.topIndex - 1);
	}
	
	public boolean isEmpty() {
		return this.topIndex == 0;
	}
	
	public boolean isFull() {
		return this.topIndex == this.size;
	}
}
