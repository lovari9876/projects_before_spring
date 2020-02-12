package chapter04.practice;

public class Q4_intAryQueue {
//	public static void main(String[] args) {
	private int max; // 큐 용량
	private int num; // 현재 데이터 수
	private int[] que; // 큐 본체

	public class EmptyIntAryQueueException extends RuntimeException {
		public EmptyIntAryQueueException() {
		}
	}
	
	public class OverflowIntAryQueueException extends RuntimeException {
		public OverflowIntAryQueueException() {
		}
	}
	
	// 생성자
	public Q4_intAryQueue(int capacity) {
		num = 0;
		max = capacity;
		try {
		que = new int[max];
// Thrown when the Java Virtual Machine cannot allocate an object
// because it is out of memory, and no more memory could be made
// available by the garbage collector.
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enque(int x) throws OverflowIntAryQueueException {
		if(num >= max) 
			throw new OverflowIntAryQueueException();
		else { 
		
		}
		return x;
	}
	

}
