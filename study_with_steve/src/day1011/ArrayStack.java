package day1011;

//public class ArrayStack implements AbstractStack {
//interface 상속하든지, abstract class 상속하든지 결과가 같기 때문에
//이럴땐 인터페이스 쓰는게 낫다.
//하나라도 구현상속(바디 있는 함수 상속)이 이루어지면 abstract class 상속하는게 낫다.
public class ArrayStack extends AbstractStack {
	//배열 사용
	//일반 클래스가 되었다.
	
	//class's members
	private static final int DEFAULT_SIZE = 10;	
	
	//instance's members: static 안붙음
	private final Object[] stack;
	private int size;
	private int topIndex;
	
	//Default constructor
	//클래스의 멤버를 초기화 한다.
	public ArrayStack() {
		this.size = DEFAULT_SIZE;
		this.stack = new Object[this.size];
		this.topIndex = 0;
	}
	
	//인자가 있는 생성자
	public ArrayStack(int size) {
		this.size = size;
		this.stack = new Object[size];
		this.topIndex = 0;
	}
	
	public synchronized void push(Object data) {
		if (isFull())
			return;
		
		this.stack[this.topIndex] = data;
		this.topIndex++;
	}
	
	public void pop() {
		if (isEmpty())
			return;
		
		this.stack[this.topIndex -1] = null;
		this.topIndex--;
	}
	
	public Object top() {
		return isEmpty() ? null : this.stack[this.topIndex - 1];
	}
	
	public boolean isEmpty() {
		return this.topIndex == 0;
	}
	
	public boolean isFull() {
		return this.topIndex == this.size;
	}
}
